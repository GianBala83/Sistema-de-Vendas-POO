package principal;

import java.util.Scanner;

import funcao.FuncaoSO;

public class MenuPrincipal {

    public void TelaMenuPrincipal(){
        Scanner sc;
        MenuProduto mp = new MenuProduto();
        MenuCliente mc = new MenuCliente();
        MenuEstoque me = new MenuEstoque();
        MenuVendas mv = new MenuVendas();
        int opcao, loop = 1;

        try {
            String so = FuncaoSO.obterSistemaOperacional();
            do{
                FuncaoSO.limpar(so);
                sc = new Scanner(System.in);
                System.out.println("==============================");
                System.out.println("1 - Menu Produto");
                System.out.println("2 - Menu Estoque");
                System.out.println("3 - Menu Cliente");
                System.out.println("4 - Menu Vendas");
                System.out.println("5 - Sair");
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
                        mv.TelaMenuVendas();
                        break;
                    case 5:
                        loop = 0;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }while (loop == 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
