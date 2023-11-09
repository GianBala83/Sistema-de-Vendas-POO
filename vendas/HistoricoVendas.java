package vendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import funcao.FuncaoVenda;



public class HistoricoVendas {
    public void TelaHistorico(Scanner sc){
        // Declaração de variáveis e objetos
        FuncaoVenda funcaovenda = new FuncaoVenda();

        try {
            List<String> linhas = new ArrayList<>();
            linhas = funcaovenda.Listar();
            System.out.println();
            for (String l : linhas) {
                System.out.println(l);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
