package Task1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс, реализующий интерфейс VendingMachine и представляющий торговый автомат с водой.
 */
public class WaterBottleVendingMachine implements VendingMachine {
    /**
     * Список продуктов, доступных в автомате.
     */
    private final Map<String, Product> productsByName;

    /**
     * Создает новый экземпляр класса WaterBottleVendingMachine.
     *
     * @param products список продуктов для инициализации автомата
     */
    public WaterBottleVendingMachine(List<Product> products) {
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
    public Product getProduct(String name) {
        Product product = productsByName.get(name.toLowerCase());
        if (product == null) {
            throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
        }
        return product;
    }
}
