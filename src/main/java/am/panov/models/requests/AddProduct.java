package am.panov.models.requests;

public class AddProduct {
    private String name;
    private long price;

    public AddProduct(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public AddProduct() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
