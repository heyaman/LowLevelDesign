package LibraryManagement.data;
import java.util.*;

public class BookDetails {
    private final String name;
    private final String author;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private float price;
    private List<String> fiction;

    public BookDetails(String name, String author) {
        this.name = name;
        this.author = author;
        this.fiction=new ArrayList<>();
    }
}
