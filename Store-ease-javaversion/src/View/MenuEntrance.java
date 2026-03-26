package View;

//imports
import Controller.ControllerManagerProduct;
import Models.Products;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class MenuEntrance {

    //
    public static void Entrance(Scanner reading)
    {
        //collection for different products type and menu option
        ArrayList<Products> storedProductsEat = new ArrayList<Products>();
        ArrayList<Products> storedProductsElectronics = new ArrayList<Products>();
        ArrayList<Products> storedProductsCosmetics = new ArrayList<Products>();
        int optionMenu = 0;

        while (optionMenu <= 0 || optionMenu >= 4)
        {
            System.out.println("\nBem vindo ao Store Easy!!\n");
            System.out.println("Escolha uma opção:\n1- Cadastrar produto\n2- Atualizar produto\n3- Excluir produto\n4- Listar produtos\n5- Sair\n");

            //casting "optionproduct" for int
            optionMenu = reading.nextInt();

            if(optionMenu <= 0 || optionMenu >= 6)
            {
                System.out.println("Ops... parece que essa não foi uma entrada válida\ntente novamente\n\n");
                //add time for comeback to main menu
            }
        }


        switch(optionMenu)
        {
            case 1:
                String category;

                System.out.println("Qual a categoria do produto?\n1- Eletrônicos\n2- Alimentícios\n3- Cosmético\n");
                category = reading.nextLine();

                //option verify
                //call method for add products
                break;

            case 2:
                //option verify
                //call method for update products
                break;

            case 3:
                //option verify
                //call method for delete products
                break;

            case 4:
                //option verify
                //call method for list products storage
                break;

            case 5:
                System.out.println("Obrigado por visitar o StoreEase\nAté mais!!\n");
                System.exit(0);
        }
    }
}
