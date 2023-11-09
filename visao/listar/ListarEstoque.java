package visao.listar;

import java.util.ArrayList;
import java.util.List;

import funcao.FuncaoEstoque;
import funcao.FuncaoProduto;
import modelo.Produto;

public class ListarEstoque {
    public void Listar(){
        // Declaração de variáveis e objetos
        FuncaoEstoque funcaoestoque = new FuncaoEstoque();
        FuncaoProduto funcaoproduto = new FuncaoProduto();
        try {
            List<String> linhas = new ArrayList<>();
            linhas = funcaoestoque.Listar();
            System.out.println();
            for (String l : linhas) {
                Produto p = new Produto();
                String[] partes = l.split(" - ");
                int id_produto = Integer.parseInt(partes[1]);
                p = funcaoproduto.InfoProduto(id_produto);
                System.out.println(partes[0]+" - "+p.getNome()+" - "+p.getValor()+" - "+partes[2]);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
