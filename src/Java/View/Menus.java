package Java.View;

import Java.Controller.ControllerView;

import java.util.Scanner;

public class Menus {
    ControllerView controllerView = new ControllerView();


    public void menuEntrance(Scanner r) {
        int option = 0;

        do {
            System.out.println("------------------------------------");
            System.out.println("Bem-vindo ao StoreEasy");
            System.out.println("Escolha umas das opções abaixo: ");
            System.out.println("1- Listar Produtos");
            System.out.println("2- Cadastrar Produtos");
            System.out.println("3- Remover Produtos");
            System.out.println("4- Atualizar Produtos");
            System.out.println("5- Sair");
            System.out.println("------------------------------------");

            if (r.hasNextInt()) {
                option = r.nextInt();
            } else if (!controllerView.validacaoMenus(1, 5, option)) {
                System.out.println("Erro na entrada, tente novamente");
            }
        } while (option < 1 || option > 5);

        controllerView.menuPrincipal(option);
    }

    public void menuListagem(Scanner r) {
        int option = 0;

        do {
            System.out.println("------------------------------------");
            System.out.println("Selecione a categoria dos produtos que deseja listar: ");
            System.out.println("1- Eletrônicos");
            System.out.println("2- Alimentícios");
            System.out.println("3- Farmaceuticos");
            System.out.println("4- Todos");
            System.out.println("------------------------------------");

            if (r.hasNextInt()) {
                option = r.nextInt();
            } else if (!controllerView.validacaoMenus(1, 4, option)) {
                System.out.println("Erro na entrada, tente novamente");
            } else {

            }
        } while (option < 1 || option > 4);

    }

    public void menuCadastramento(Scanner r) {

    }

    public void menuRemover(Scanner r) {

    }

    public void menuAtualizar(Scanner r) {

    }

    public void menuSair(Scanner r) {
        System.out.println("------------------------------------");
        System.out.println("Até a próxima!");
        r.close();
        System.out.println("------------------------------------");
    }
}
