package principal;

import java.util.Scanner;

public class MenuPrincipal {

    public void TelaMenuPrincipal(){
        Scanner sc = new Scanner(System.in);
        MenuProduto mp = new MenuProduto();
        MenuCliente mc = new MenuCliente();
        MenuEstoque me = new MenuEstoque();
        int opcao, loop = 0;

        do{
            System.out.println("==============================");
            System.out.println("1 - Menu Produto");
            System.out.println("2 - Menu Estoque");
            System.out.println("3 - Menu Cliente");
            System.out.println("4 - Sair");
            System.out.println("==============================");

            System.out.println("Escolha a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    mp.TelaMenuProduto();
                    break;
                case 2:
                    me.TelaMenuEstoque();
                    break;
                case 3:
                    mc.TelaMenuCliente();
                    break;
                case 4:
                    loop = 1;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }while (loop == 1);
    }
}
