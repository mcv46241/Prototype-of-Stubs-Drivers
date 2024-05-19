import java.util.List;

public class ShoppingCart {
    public double calculateTotalPrice(List<Double> prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}