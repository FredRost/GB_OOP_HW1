package Task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс, реализующий интерфейс VendingMachine и представляющий торговый автомат с горячими напитками.
 */
public class HotDrinkMachine implements VendingMachine {
    /**
     * Список продуктов, доступных в автомате.
     */
    private final Map<String, Product> productsByName;

    /**
     * Создает новый экземпляр класса HotDrinkMachine.
     *
     * @param products список продуктов для инициализации автомата
     */
    public HotDrinkMachine(List<Product> products) {
        productsByName = new HashMap<>();
        for (Product product : products) {
            productsByName.put(product.getName().toLowerCase(), product);
        }
    }

    /**
     * Получает продукт по его имени.
     *
     * @param name имя продукта
     * @return продукт
     * @throws IllegalStateException если продукт не найден
     */
    @Override
    public Product getProduct(String name) {
        Product product = productsByName.get(name.toLowerCase());
        if (product == null) {
            throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
        }
        return product;
    }

    /**
     * Получает продукт по его имени, объему и температуре.
     *
     * @param name        имя продукта
     * @param temperature температура напитка
     * @return продукт
     * @throws IllegalStateException если продукт не найден
     */
    public HotDrink getProduct(String name, int temperature) {
        Product product = productsByName.get(name.toLowerCase());
        if (product instanceof HotDrink && ((HotDrink) product).getTemperature() == temperature) {
            return (HotDrink) product;
        }
        throw new IllegalStateException(String.format("Продукт c названием %s и температурой %d не найден.", name, temperature));
    }
}
