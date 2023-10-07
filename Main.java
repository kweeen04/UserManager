import controller.Menu;
import model.UserDatabase;
import view.View;

public class Main {
    public static void main(String[] args) {
        UserDatabase model = new UserDatabase();
        View view = new View();
        Menu menu = new Menu(model, view);
        menu.run();
    }
}
