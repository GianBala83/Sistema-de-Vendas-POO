package principal;

import java.util.Scanner;

import funcao.FuncaoSO;
import visao.cadastrar.CadastrarProduto;
import visao.excluir.ExcluirProduto;
import visao.listar.ListarProduto;

public class MenuProduto {
    
    public void TelaMenuProduto(){
        
        Scanner sc;
        int opcao,laco;

        CadastrarProduto cp = new CadastrarProduto();
        ExcluirProduto ep = new ExcluirProduto();
        ListarProduto lp = new ListarProduto();
        
        try {
            String so = FuncaoSO.obterSistemaOperacional();

            do{
                FuncaoSO.limpar(so);
                sc = new Scanner(System.in);
                laco = 0;
                System.out.println("==============================");
                System.out.println("1 - Cadastrar Produto");
                System.out.println("2 - Excluir Produto");
                System.out.println("3 - Listar Produtos");
                System.out.println("4 - Sair");
                System.out.println("==============================");
            
                System.out.print("\nSelecione a opção desejada: ");
                
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        cp.Cadastrar(sc);
                        Thread.sleep(2000);
                        break;
                    case 2:
                        lp.Listar();
                        ep.Excluir(sc);
                        Thread.sleep(2000);
                        break;
                    case 3:
                        lp.Listar();
                        sc.nextLine();
                        sc.nextLine();
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
