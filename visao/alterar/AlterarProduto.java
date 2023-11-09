package visao.alterar;

import java.util.Scanner;

import funcao.FuncaoProduto;
import modelo.Produto;

public class AlterarProduto {
    public void Alterar(Scanner sc){
        // Declaração de variáveis e objetos
        Produto p = new Produto();
        FuncaoProduto funcaoproduto = new FuncaoProduto();
        int id_produto;
        double valor;

        try {
            System.out.print("Digite o ID do produto: ");
            id_produto = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            p.setIdProduto(id_produto);

            if(funcaoproduto.EncontrarId(id_produto)==-1){
                System.out.println("ID INCORRETO");
            }else{

                System.out.print("Digite o novo valor do produto: ");
                valor = sc.nextDouble();
                p.setValor(valor);

                if(funcaoproduto.Alterar(p)){
                    System.out.println("ALTERADO!");
                }else{
                    System.out.println("ERRO AO ALTERAR!");
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
