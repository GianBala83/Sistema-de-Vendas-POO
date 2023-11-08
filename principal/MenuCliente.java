package principal;

import funcao.FuncaoSO;
import visao.cadastrar.CadastrarCliente;
import visao.excluir.ExcluirCliente;
import visao.listar.ListarClientes;

import java.util.Scanner;

public class MenuCliente {

    public void TelaMenuCliente(){


        Scanner sc;
        int opcao, laco, aux2 = 0;

        CadastrarCliente cc = new CadastrarCliente();
        ListarClientes lc = new ListarClientes();
        ExcluirCliente ec = new ExcluirCliente();

        try{
            String so = FuncaoSO.obterSistemaOperacional();
            do{
                FuncaoSO.limpar(so);
                sc = new Scanner(System.in);
                laco = 0;
                System.out.println("==============================");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Excluir Cliente");
                System.out.println("3 - Listar Cliente");
                System.out.println("4 - Sair");
                System.out.println("==============================");

                System.out.print("\nSelecione a opção desejada: ");

                opcao = sc.nextInt();
                if(opcao == 1 || opcao == 2){
                    System.out.println("Fisico(1) ou jurídico?(2) ");
                     aux2 = sc.nextInt();
                }
                switch (opcao){
                    case 1:
                        if(aux2 == 1){
                            cc.cadastrarClienteF(sc);
                            Thread.sleep(2000);
                            break;
                        }else if(aux2 == 2){
                            cc.cadastrarClienteJ(sc);
                            Thread.sleep(2000);
                            break;
                        }else {
                            System.out.println("Comando inválido.");
                            break;
                        }
                    case 2:
                        if(aux2 == 1){
                            lc.ListaClientes();
                            ec.ExcluirClienteF(sc);
                            Thread.sleep(2000);
                            break;
                        }else if(aux2 == 2){
                            lc.ListaClientes();
                            ec.ExcluirClienteJ(sc);
                            Thread.sleep(2000);
                            break;
                        }else{
                            System.out.println("Comando inválido.");
                            break;
                        }
                    case 3:
                        lc.ListaClientes();
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

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
