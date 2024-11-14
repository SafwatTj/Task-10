import java.util.Comparator;

public class ComparatorProductsByTitle implements Comparator<Product> {


    @Override
    public int compare(Product product1, Product product2) {
        return product1.getTitle().compareTo(product2.getTitle());
    }
}
