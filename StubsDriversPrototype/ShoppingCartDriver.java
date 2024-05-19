import java.util.Arrays;
import java.util.List;

public class ShoppingCartDriver {
    public static void main(String[] args) {
        // Stubbed item prices service
        ItemPriceServiceStub itemPriceServiceStub = new ItemPriceServiceStub();

        // Example items in the shopping cart
        List<String> items = Arrays.asList("apple", "banana", "orange");

        // Calculate total price using ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();
        List<Double> prices = itemPriceServiceStub.getItemPrices(items);
        double totalPrice = shoppingCart.calculateTotalPrice(prices);

        // Display total price
        System.out.println("Total price for items: $" + totalPrice);
    }
}
