package principal;

import java.util.Scanner;

import funcao.FuncaoSO;
import visao.alterar.AlterarEstoque;
import visao.cadastrar.CadastrarEstoque;
import visao.excluir.ExcluirEstoque;
import visao.listar.ListarEstoque;
import visao.listar.ListarProduto;

public class MenuEstoque {
    public void TelaMenuEstoque(){
        Scanner sc;
        int opcao,laco;

        ListarEstoque le = new ListarEstoque();
        ListarProduto lp = new ListarProduto();
        CadastrarEstoque ce = new CadastrarEstoque();
        AlterarEstoque ae = new AlterarEstoque();
        ExcluirEstoque ee = new ExcluirEstoque();

        try {
            String so = FuncaoSO.obterSistemaOperacional();

            do{
                FuncaoSO.limpar(so);
                sc = new Scanner(System.in);
                laco = 0;
                System.out.println("=====================================");
                System.out.println("1 - Aumentar Quantidade no Estoque");
                System.out.println("2 - Diminuir Quantidade no Estoque");
                System.out.println("3 - Listar Produtos no Estoque");
                System.out.println("4 - Cadastrar Produto no Estoque");
                System.out.println("5 - Excluir Produto no Estoque");
                System.out.println("6 - Sair");
                System.out.println("=====================================");
            
                System.out.print("\nSelecione a opção desejada: ");
                
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        le.Listar();
                        ae.Aumentar(sc);
                        Thread.sleep(2000);
                        break;
                    case 2:
                        le.Listar();
                        ae.Diminuir(sc);
                        Thread.sleep(2000);
                        break;
                    case 3:
                        le.Listar();
                        sc.nextLine();
                        sc.nextLine();
                        break;
                    case 4:
                        lp.Listar();
                        ce.Cadastrar(sc);
                        Thread.sleep(2000);
                        break;
                    case 5:
                        le.Listar();
                        ee.Excluir(sc);
                        Thread.sleep(2000);
                        break;
                    case 6:
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
