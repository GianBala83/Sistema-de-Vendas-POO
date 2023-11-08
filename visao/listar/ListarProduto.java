package visao.listar;

import java.util.ArrayList;
import java.util.List;

import funcao.FuncaoProduto;

public class ListarProduto {
    public void Listar(){
        // Declaração de variáveis e objetos
        FuncaoProduto funcaoproduto = new FuncaoProduto();

        try {
            List<String> linhas;
            linhas = funcaoproduto.Listar();
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
