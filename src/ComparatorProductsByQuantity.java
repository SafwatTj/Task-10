import java.util.Comparator;

public class ComparatorProductsByQuantity implements Comparator<Product> {


    @Override
    public int compare(Product product1, Product product2) {
        return Integer.compare(product1.getQuantity(), product2.getQuantity());
    }
}
