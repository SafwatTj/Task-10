import java.util.Comparator;

public class ComparatorProductsByPrice implements Comparator<Product> {


    @Override
    public int compare(Product product1, Product product2) {
        return product1.getPrice().compareTo(product2.getPrice());
    }
}
