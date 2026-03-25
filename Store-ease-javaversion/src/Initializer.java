//imports
import View.MenuEntrance;

import java.util.Scanner;


public class Initializer{

    //entrance of program
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        MenuEntrance.Entrance(read);

        read.close();
    }
}
