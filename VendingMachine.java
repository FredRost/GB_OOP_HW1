package Task1;
/**
 * Интерфейс, определяющий функционал торгового автомата.
 */
public interface VendingMachine {
    /**
     * Получает продукт по его имени.
     *
     * @param name имя продукта
     * @return продукт
     * @throws IllegalStateException если продукт не найден
     */
    Product getProduct(String name) throws IllegalStateException;
}