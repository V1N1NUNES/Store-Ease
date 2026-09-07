package Java.Service;

import java.util.Scanner;

public class ViewService {
    public boolean validacaoMenus(int a, int b, int option){
        if(option < a || option > b){
            return false;
        } else{
            return true;
        }
    }
}
