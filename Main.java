import domain.Apple;
import exception.RepositoryException;
import repository.Repository;
import view.View;
import domain.Item;
import domain.Book;
import domain.Apple;
import domain.Cake;
import repository.IRepository;
import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Apple(13);
        Item item2 = new Book(21);
        Item item3 = new Cake(22);
        Item item4 = new Apple(11);
        IRepository repo = new Repository();
        try {
            repo.add(item1);
            repo.add(item2);
            repo.add(item3);
            repo.add(item4);
        } catch(RepositoryException e) {
            System.out.println(e.getMessage());
            return;
        }
        Controller controller = new Controller(repo);
        View view = new View(controller);
        view.read();
        view.display();
    }
}
