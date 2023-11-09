package visao.excluir;

import java.util.Scanner;

import funcao.FuncaoEstoque;
import funcao.FuncaoProduto;
import modelo.Produto;

public class ExcluirProduto {
    public void Excluir(Scanner sc){
        // Declaração de variáveis e objetos
        Produto p = new Produto();
        FuncaoProduto funcaoproduto = new FuncaoProduto();
        FuncaoEstoque funcaoestoque = new FuncaoEstoque();
        int id_produto;

        try {
            System.out.print("Digite o ID do produto: ");
            id_produto = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            p.setIdProduto(id_produto);
            if(funcaoestoque.EncontrarIdProduto(id_produto)){
                System.out.println("ESSE PRODUTO NÃO PODE SER EXCLUÍDO POIS ESTÁ NO ESTOQUE");
            }else{
                if(funcaoproduto.Excluir(p)){
                    System.out.println("EXCLUIDO!");
                }else{
                    System.out.println("ERRO AO EXCLUIR!");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
