package visao.alterar;

import funcao.FuncaoProduto;
import modelo.Produto;

import java.util.Scanner;

public class AlterarProduto {
    public void Alterar(Scanner sc){
        Produto p = new Produto();
        int id_produto;
        double novo_valor;
        try{
            System.out.println("Digite o id do produto: ");
            id_produto = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o novo valor do produto: ");
            novo_valor = sc.nextInt();
            sc.nextLine();

            p.setIdProduto(id_produto);

        }catch(Exception ignored)
        {
            
        }
    }
}