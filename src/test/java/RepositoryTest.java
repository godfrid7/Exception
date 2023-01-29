import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Faust", 1300, "Goethe");
        Book book2 = new Book(2, "War and Peace", 2000, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter", 1000, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

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

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product[] expected = {book1, book3};
        Product[] actual = repo.removeById(2);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveIncorrectId() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Faust", 1300, "Goethe");
        Book book2 = new Book(2, "War and Peace", 2000, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter", 1000, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.removeById(4)
        );
    }


}