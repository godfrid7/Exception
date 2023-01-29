public class Book extends Product {
    private String author;


    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isTooExpensive() {
        if (price > 10_000) {
            return true;
        } else {
            return  false;
        }
    }

    public void setPrice(int i) {
    }
}
