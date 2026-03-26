package View;

//imports
import java.util.Scanner;

public abstract class MenuEntrance {

    //
    public static void Entrance(Scanner reading)
    {
        int optionMenu = 0;

        while (optionMenu <= 0 || optionMenu >= 4)
        {
            System.out.println("\nBem vindo ao Store Easy!!\n");
            System.out.println("Escolha uma opção:\n1- Cadastrar produto\n2- Atualizar produto\n3- Excluir produto\n4- Listar produtos\n");

            optionMenu = reading.nextInt();

            if(optionMenu <= 0 || optionMenu >= 4)
            {
                System.out.println("Ops... parece que essa não foi uma entrada válida\ntente novamente\n\n");
                //add time for comeback to main menu
            }
        }



        switch(optionMenu)
        {
            case 1:

                break;

            case 2: //call function
                break;

            case 3: //call function
                break;

            case 4: //call function
                break;

            default:
        }
    }
}
