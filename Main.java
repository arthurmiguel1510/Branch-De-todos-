import Controller.UserController;
import View.UserView;
import Model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();
        UserView view = new UserView();

        List<User> usuarios = controller.listarUsuarios();
        view.mostrarUsuarios(usuarios);
    }
}
