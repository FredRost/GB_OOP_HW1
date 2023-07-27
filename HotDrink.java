package Task1;

import java.util.Objects;

/**
 * Класс, представляющий горячий напиток. Расширяет абстрактный класс Product, добавляя свойство температура.
 */
public class HotDrink extends Product {
    /**
     * Температура напитка.
     */
    private int temperature;

    /**
     * Создает новый экземпляр класса HotDrink.
     *
     * @param name        имя продукта
     * @param cost        стоимость продукта
     * @param temperature температура напитка
     */
    public HotDrink(String name, double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    /**
     * Получает температуру напитка.
     *
     * @return температура напитка
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Устанавливает температуру напитка.
     *
     * @param temperature температура напитка
     */
    public void setTemperature(int temperature) {
        // Проверяем, чтобы температура была неотрицательной и реалистично высокой (например, меньше 100 градусов)
        if (temperature >= 0 && temperature <= 100) {
            this.temperature = temperature;
        } else {
            throw new IllegalArgumentException("Некорректное значение температуры.");
        }
    }

    /**
     * Проверяет, являются ли два горячих напитка равными на основе имени, стоимости и температуры.
     *
     * @param o объект для сравнения
     * @return true, если горячие напитки равны, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HotDrink hotDrink = (HotDrink) o;
        return temperature == hotDrink.temperature;
    }

    /**
     * Возвращает хэш-код горячего напитка на основе имени, стоимости и температуры.
     *
     * @return хэш-код горячего напитка
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperature);
    }
}
