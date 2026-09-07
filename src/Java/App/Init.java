package Java.App;

import Java.View.Menus;

import java.util.Scanner;

public class Init {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Menus menu = new Menus();
        menu.menuEntrance(r);
    }
}
