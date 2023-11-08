package principal;

import java.util.Scanner;

import funcao.FuncaoSO;
import modelo.Cliente;

public class MenuCliente 
{
    public void telaMenuCliente(){
        
        Scanner sc;
        int opcao,laco;

        Cliente j = new Cliente();
        MenuCliente me = new MenuCliente();
        //ListarProduto lp = new ListarProduto();
        
        try {
            String so = FuncaoSO.obterSistemaOperacional();

            do{
                FuncaoSO.limpar(so);
                sc = new Scanner(System.in);
                laco = 0;
                System.out.println("==============================");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Remover Cliente");
                System.out.println("3 - Listar Clientes");
                System.out.println("4 - Sair");
                System.out.println("==============================");
            
                System.out.print("\nSelecione a opção desejada: ");
                
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        j.valoresCliente(j,sc);
                        Thread.sleep(2000);
                        break;
                    case 2:
                        j.ExcluirCliente(sc);
                        Thread.sleep(2000);
                        break;
                    case 3:
                        j.ListarP();
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

