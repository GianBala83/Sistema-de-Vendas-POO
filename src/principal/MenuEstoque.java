package principal;

import java.util.Scanner;


import funcao.FuncaoSO;
import visao.cadastrar.CadastrarEstoque;
import visao.listar.ListarProduto;

public class MenuEstoque {
    public void telaMenuEstoque(){
        Scanner sc;
        int opcao,laco;

        ListarProduto lp = new ListarProduto();
        CadastrarEstoque ce = new CadastrarEstoque();

        try {
            String so = FuncaoSO.obterSistemaOperacional();

            do{
                FuncaoSO.limpar(so);
                sc = new Scanner(System.in);
                laco = 0;
                System.out.println("==============================");
                System.out.println("1 - Adicionar Quantidade ao Estoque");
                System.out.println("2 - Excluir Quantidade do Estoque");
                System.out.println("3 - Listar Produtos no Estoque");
                System.out.println("4 - Sair");
                System.out.println("==============================");
            
                System.out.print("\nSelecione a opção desejada: ");
                
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        lp.Listar();
                        //ce.Cadastrar(sc);
                        Thread.sleep(2000);
                        break;
                    case 2:
                        break;
                    case 3:
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
