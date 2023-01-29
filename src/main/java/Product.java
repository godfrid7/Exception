public class Product {
    protected int id;
    protected String name;
    protected int price;


    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public boolean isTooExpensive() {
        if (price > 1_000_000) {
            return true;
        } else {
            return false;
        }
    }
}
