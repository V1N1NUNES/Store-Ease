package Java.View;

//imports

import java.util.Scanner;

public class MenuEntrance {

    public static void Entrance(Scanner reading) {
        int optionMenu = 0;

        while (optionMenu == 0 || optionMenu == 6) {

            System.out.println("Bem vindo ao Store-Easy!!\n\n");
            System.out.println("Escolha uma opção: \n1- Verificar estoque\n2- Gerenciar estoque\n3- Sair\n");

            //Add Error handling for option reading
            optionMenu = reading.nextInt();

            switch (optionMenu) {
                case 1:
                    //method calling
                    break;


                case 2:
                    // method calling
                    break;


                case 3:
                    // Program end
                    break;
            }
        }
    }

    private void StorageView(){
        // - Add search menu
    }

    private void StorageMenu() {
        // - Add storage manager menu
    }
}
