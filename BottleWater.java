package Task1;

import java.util.Objects;

/**
 * Класс, представляющий бутылку воды. Расширяет абстрактный класс Product, добавляя свойство объема.
 */
public class BottleWater extends Product {
    /**
     * Объем воды в бутылке.
     */
    private int volume;

    /**
     * Создает новый экземпляр класса BottleWater.
     *
     * @param name   имя продукта
     * @param cost   стоимость продукта
     * @param volume объем воды в бутылке
     */
    public BottleWater(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    /**
     * Получает объем воды в бутылке.
     *
     * @return объем воды
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Устанавливает объем воды в бутылке.
     *
     * @param volume объем воды
     */
    public void setVolume(int volume) {
        // Проверяем, чтобы объем был неотрицательным и реалистично большим (например, меньше 5 литров)
        if (volume >= 0 && volume <= 5000) {
            this.volume = volume;
        } else {
            throw new IllegalArgumentException("Некорректное значение объема воды.");
        }
    }

    /**
     * Возвращает строковое представление бутылки воды.
     *
     * @return строковое представление бутылки воды
     */
    @Override
    public String toString() {
        return "BottleWater{" +
                "name='" + super.getName() + '\'' +
                ", volume=" + volume +
                ", cost=" + super.getCost() +
                '}';
    }

    /**
     * Сравнивает этот объект бутылки воды с указанным объектом.
     *
     * @param o объект, с которым производится сравнение
     * @return true, если объекты равны; false в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BottleWater)) return false;
        if (!super.equals(o)) return false;
        BottleWater that = (BottleWater) o;
        return getVolume() == that.getVolume();
    }

    /**
     * Возвращает хэш-код бутылки воды на основе имени и объема.
     *
     * @return хэш-код бутылки воды
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getVolume());
    }
}
