import java.math.BigDecimal;

public class Product {
    private String title;
    private BigDecimal price;
    private double rating;
    private int quantity;


    public Product(String title, BigDecimal price, double rating, int quantity) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", quantity=" + quantity +
                '}';
    }
}
