package Java.Controller;

import Java.DB.DataBasesStoreEasy;
import Java.Models.Produto;
import Java.Service.ViewService;
import Java.View.Menus;

import java.util.List;
import java.util.Scanner;

public class ControllerView {
    private final Menus menuController = new Menus();
    private final ViewService viewService = new ViewService();

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
        return switch (optin) {
            case 1 -> DataBasesStoreEasy.getProdutosEletronicos();
            case 2 -> DataBasesStoreEasy.getProdutosAlimenticios();
            case 3 -> DataBasesStoreEasy.getProdutosFarmaceuticos();
            case 4 -> DataBasesStoreEasy.getListaProdutos();  // arrumar a mostra de todas as listas e produtos
            default -> null;
        };
    }

    public void menuCadastramento(int option, Produto produto) {
        switch (option) {
            case 1:
                //adicionar ao estoque de eletrônicos
                break;
            case 2:
                //adicionar ao estoque de alimentos
                break;
            case 3:
                //adicionar ao estoque de farmaceuticos
                break;
        }
    }

    //validações
    public boolean validacaoMenus(int a, int b, int option) {
        return viewService.validacaoMenus(a, b, option);
    }

    public boolean validacaoCriacaoProduto(Produto produto) {
        return viewService.validacaoCriacaoProduto(produto);
    }

//    public boolean validacaoAdicaoProduto() {}
}
