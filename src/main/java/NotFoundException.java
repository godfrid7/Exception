public class NotFoundException extends RuntimeException{
    public NotFoundException(int id) {
        super("Товар в id " + id + "не найден");
    }
}
