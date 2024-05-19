import java.util.ArrayList;
import java.util.List;

public class ItemPriceServiceStub {
    public List<Double> getItemPrices(List<String> items) {
        // For simplicity, return fixed prices for the provided items
        List<Double> prices = new ArrayList<>();
        for (String item : items) {
            prices.add(getPriceForItem(item));
        }
        return prices;
    }

    private double getPriceForItem(String item) {
        // For simplicity, return fixed prices for known items
        switch (item) {
            case "apple":
                return 1.0;
            case "banana":
                return 0.5;
            case "orange":
                return 0.75;
            default:
                return 0.0; // Default price for unknown items
        }
    }
}