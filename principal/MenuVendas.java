package principal;

import java.util.Scanner;

import funcao.FuncaoSO;
import vendas.EfetuarVendas;
import vendas.HistoricoVendas;
import vendas.Saldo;

public class MenuVendas {

    public void TelaMenuVendas(){

        Scanner sc;
        int opcao,laco;

        EfetuarVendas ev = new EfetuarVendas();
        HistoricoVendas hv = new HistoricoVendas();
        Saldo s = new Saldo();
        
        try {
            String so = FuncaoSO.obterSistemaOperacional();

            do{
                FuncaoSO.limpar(so);
                sc = new Scanner(System.in);
                laco = 0;
                System.out.println("==============================");
                System.out.println("1 - Efetuar Venda");
                System.out.println("2 - Ver Histórico");
                System.out.println("3 - Total em Vendas");
                System.out.println("4 - Sair");
                System.out.println("==============================");
            
                System.out.print("\nSelecione a opção desejada: ");
                
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        ev.TelaVendas(sc);
                        Thread.sleep(2000);
                        break;
                    case 2:
                        hv.TelaHistorico(sc);
                        sc.nextLine();
                        sc.nextLine();
                        break;
                    case 3:
                        s.MostrarSaldo();
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
