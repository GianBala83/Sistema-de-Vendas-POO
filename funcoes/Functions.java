package funcoes;
//import java.io.IOException;

public class Functions {

    static java.util.Scanner scan = new java.util.Scanner(System.in);

    public static void CleanConsole(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(Exception e){
        }
    }

    public static void PauseConsole(){
        try{
            new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
        }catch(Exception e){
        }
    }

    public static int readerIntWithFlag(int flag){
        // Considera as flags para indices logo sempre positiva
        int reader = 0;
        while(reader > flag || reader <= 0 ){
            try{
                reader = scan.nextInt();
            }catch(Exception e){
                System.out.println("Digite um valor numerico.");
            }
            if (reader > flag || reader <= 0){
                System.out.println("Valor Invalido");
                scan.nextLine();
            }
        }
        return reader;
    }
}
