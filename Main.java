package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Основной метод для демонстрации работы торгового автомата.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создаем несколько горячих напитков
        HotDrink coffee = new HotDrink("Coffee", 100.0, 80);
        HotDrink tea = new HotDrink("Tea", 50.0, 90);

        // Добавляем их в список продуктов
        List<Product> hotDrinks = new ArrayList<>();
        hotDrinks.add(coffee);
        hotDrinks.add(tea);

        // Создаем торговый автомат с горячими напитками
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine(hotDrinks);

        // Получаем напиток по имени
        String requestedDrinkName = "Coffee";
        Product requestedDrink = hotDrinkMachine.getProduct(requestedDrinkName);
        if (requestedDrink != null) {
            System.out.println(requestedDrink.getName());
        } else {
            System.out.println("Продукт с названием " + requestedDrinkName + " не найден.");
        }

        // Получаем напиток по имени и температуре
        String requestedHotDrinkName = "Coffee";
        int requestedTemperature = 80;
        try {
            HotDrink requestedHotDrink = hotDrinkMachine.getProduct(requestedHotDrinkName, requestedTemperature);
            System.out.println(requestedHotDrink.getName());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
