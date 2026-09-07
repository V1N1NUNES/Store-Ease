package Java.Controller;

import Java.Service.ViewService;
import Java.View.Menus;

import java.util.List;
import java.util.Scanner;

public class ControllerView {
    Menus menuController = new Menus();
    ViewService viewService = new ViewService();

    Scanner r = new Scanner(System.in);

    public void menuPrincipal(int option) {
        switch (option) {
            case 1:
                menuController.menuListagem(r);
                break;
            case 2:
                menuController.menuCadastramento(r);
                break;
            case 3:
                menuController.menuRemover(r);
                break;
            case 4:
                menuController.menuAtualizar(r);
                break;
            case 5:
                menuController.menuSair(r);
                break;
        }
    }

    public List menuListagem(int optin) {
        switch (optin) {
            case 1:
                break;
            case 2:
                break;                          //CONTINUAR DAQUI
            case 3:
                break;
            case 4:
                break;
        }
    }

    public boolean validacaoMenus(int a, int b, int option) {
        if (viewService.validacaoMenus(a, b, option)) {
            return true;
        } else {
            return false;
        }
    }
}
