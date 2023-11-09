
import java.io.IOException;
import java.util.Scanner;

import principal.Iniciar;
import principal.MenuPrincipal;

public class Main {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws IOException {
        Iniciar i = new Iniciar();
        i.Inicio();
        MenuPrincipal mp = new MenuPrincipal();
        mp.TelaMenuPrincipal();
    }
}