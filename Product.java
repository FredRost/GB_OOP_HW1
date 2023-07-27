package Task1;

/**
 * Абстрактный класс, представляющий общую структуру продукта.
 */
public abstract class Product {
    /**
     * Имя продукта.
     */
    protected String name;

    /**
     * Стоимость продукта.
     */
    protected double cost;

    /**
     * Создает новый экземпляр класса Product.
     *
     * @param name имя продукта
     * @param cost стоимость продукта
     */
    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Возвращает имя продукта.
     *
     * @return имя продукта
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает стоимость продукта.
     *
     * @return стоимость продукта
     */
    public double getCost() {
        return cost;
    }

    /**
     * Возвращает строковое представление продукта.
     *
     * @return строковое представление продукта
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    /**
     * Проверяет, являются ли два продукта равными на основе их имени и стоимости.
     *
     * @param o объект для сравнения
     * @return true, если продукты равны, иначе false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 && name.equals(product.name);
    }

    /**
     * Возвращает хэш-код продукта на основе его имени и стоимости.
     *
     * @return хэш-код продукта
     */
    @Override
    public int hashCode() {
        int result = name.hashCode();
        long temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
