package Java.View;

import Java.Controller.ControllerView;
import Java.Models.Eletronicos;
import Java.Models.PRODUTOS;

import java.util.Scanner;

public class Menus {
    ControllerView controllerView = new ControllerView();


    public void menuEntrance(Scanner r) {
        int option = 0;
        int tamanhoX_Menu = 1;
        int tamanhoY_Menu = 5;

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

            if (!controllerView.validacaoMenus(tamanhoX_Menu, tamanhoY_Menu, option)) {
                System.out.println("Número digitado não corresponde com o Menu. Tente novamente.");
                break;
            }

            if (!r.hasNextInt()) {
                System.out.println("Erro na entrada, o número digitado não pode ser um número decimal. Tente novamente.");
                break;
            } else {
                option = r.nextInt();
            }
        } while (!controllerView.validacaoMenus(tamanhoX_Menu, tamanhoY_Menu, option) || option != 5);

        controllerView.menuPrincipal(option);
    }

    public void menuListagem(Scanner r) {
        int option = 0;
        int tamanhoX_Menu = 1;
        int tamanhoY_Menu = 5;

        do {
            System.out.println("------------------------------------");
            System.out.println("Selecione a categoria dos produtos que deseja listar: ");
            System.out.println("1- Eletrônicos");
            System.out.println("2- Alimentícios");
            System.out.println("3- Farmaceuticos");
            System.out.println("4- Todas as categorias e produtos");
            System.out.println("5- Retornar ao Menu Principal");
            System.out.println("------------------------------------");

            if (!controllerView.validacaoMenus(tamanhoX_Menu, tamanhoY_Menu, option)) {
                System.out.println("Número digitado não corresponde com o Menu. Tente novamente.");
                continue;
            }

            if (!r.hasNextInt()) {
                System.out.println("Erro na entrada, o número digitado não pode ser um número decimal. Tente novamente.");
            } else {
                option = r.nextInt();
            }

            if (option == 5) {
                System.out.println("Voltando ao Menu Principal");
                this.menuEntrance(r);
                break;
            }

            System.out.println(controllerView.menuListagem(option));

        } while (!controllerView.validacaoMenus(tamanhoX_Menu, tamanhoY_Menu, option) || option != 5);
    }

    public void menuCadastramento(Scanner r) {
        int option = 0;
        int tamanhoX_Menu = 1;
        int tamanhoY_Menu = 4;

        do {
            System.out.println("------------------------------------");
            System.out.println("Selecione a categoria na qual deseja adicionar seus produtos: ");
            System.out.println("1 - Eletrônicos");
            System.out.println("2 - Alimentícios");
            System.out.println("3 - Farmaceuticos");
            System.out.println("4 - Voltar ao menu principal");
            System.out.println("------------------------------------");

            if (!controllerView.validacaoMenus(tamanhoX_Menu, tamanhoY_Menu, option)) {
                System.out.println("Número digitado não corresponde com o Menu. Tente novamente.");
                continue;
            }

            if (!r.hasNextInt()) {
                System.out.println("Erro na entrada, o número digitado não pode ser um número decimal. Tente novamente.");
            } else {
                option = r.nextInt();
            }

            switch (option) {
                case 1:
                    String nome;
                    String descricao;
                    float preco;
                    PRODUTOS produto;
                    String config;

                    System.out.println("Digite o nome do produto: ");
                    nome = r.nextLine();
                    System.out.println("Digite o descricao do produto: ");
                    descricao = r.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    preco = r.nextFloat();
                    System.out.println("Digite a configuração completa do eletrônico:");
                    config = r.nextLine();

                    Eletronicos produtoCadastrado = new Eletronicos(nome, descricao, preco, PRODUTOS.ELETRONICOS, config);

                    continue;
                case 2:
                    continue;
                case 3:
                case 4:
                    System.out.println("Voltando ao Menu principal");
                    this.menuEntrance(r);
                    break;
            }
        } while (!controllerView.validacaoMenus(tamanhoX_Menu, tamanhoY_Menu, option) || option != 4);
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
