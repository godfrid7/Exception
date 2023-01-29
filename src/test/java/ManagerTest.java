import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Faust", 1300, "Goethe");
        Book book2 = new Book(2, "War and Peace", 2000, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter", 1000, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);


        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearch() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Faust", 1300, "Goethe");
        Book book2 = new Book(2, "War and Peace", 2000, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter", 1000, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1};
        Product[] actual = manager.searchBy("Faust");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testDeleteBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);


        Book book1 = new Book(1, "Faust", 1300, "Goethe");
        Book book2 = new Book(2, "War and Peace", 2000, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter", 1000, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book2, book3};
        Product[] actual = repo.removeById(1);

    }

    @Test
    public void testAddSearch() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Faust", 1300, "Goethe");
        Book book2 = new Book(2, "War and Peace", 2000, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter", 1000, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book2};
        Product[] actual = manager.searchBy("Wa");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSearchBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Faust", 1300, "Goethe");
        Book book2 = new Book(2, "War and Peace", 2000, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter", 1000, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Power");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSomeSearchBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Faust", 1300, "Goethe");
        Book book2 = new Book(2, "War and Peace", 2000, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter", 1000, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book2, book3};
        Product[] actual = manager.searchBy("ar");

        Assertions.assertArrayEquals(expected, actual);
    }

}
