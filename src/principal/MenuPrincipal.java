package principal;

import java.util.Scanner;

import funcao.FuncaoSO;


public class MenuPrincipal 
{
    public void telaMenuPrincipal(){
        
        Scanner sc;
        int opcao,laco;

        MenuProduto mp = new MenuProduto();
        MenuEstoque me = new MenuEstoque();
        MenuCliente mc = new MenuCliente();
        //ListarProduto lp = new ListarProduto();
        
        try {
            String so = FuncaoSO.obterSistemaOperacional();

            do{
                FuncaoSO.limpar(so);
                sc = new Scanner(System.in);
                laco = 0;
                System.out.println("==============================");
                System.out.println("1 - Menu Produto");
                System.out.println("2 - Menu Estoque");
                System.out.println("3 - Menu Cliente");
                System.out.println("4 - Sair");
                System.out.println("==============================");
            
                System.out.print("\nSelecione a opção desejada: ");
                
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        mp.telaMenuProduto();
                        Thread.sleep(2000);
                        break;
                    case 2:
                        me.telaMenuEstoque();
                        Thread.sleep(2000);
                        break;
                    case 3:
                        mc.telaMenuCliente();
                        Thread.sleep(2000);
                        break;
                    case 4:
                        FuncaoSO.limpar(so);
                        laco = 1;
                        break;
                    default:
                        System.out.println("\nOPÇÃO INVÁLIDA\n");
                        Thread.sleep(1000);
                        break;
                }
            }while(laco==0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

