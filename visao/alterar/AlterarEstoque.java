package visao.alterar;

import java.util.Scanner;

import funcao.FuncaoEstoque;
import modelo.Estoque;

public class AlterarEstoque {
    public void Aumentar(Scanner sc){
        // Declaração de variáveis e objetos
        Estoque es = new Estoque();
        FuncaoEstoque funcaoestoque = new FuncaoEstoque();
        int id_estoque, quantidade;

        try {
            System.out.print("Digite o ID do estoque: ");
            id_estoque = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            es.setIdEstoque(id_estoque);

            if(funcaoestoque.EncontrarId(id_estoque)==-1){
                System.out.println("ID INCORRETO");
            }else{

                System.out.print("Digite a quantidade para aumentar no estoque: ");
                quantidade = sc.nextInt();

                quantidade += funcaoestoque.QuantidadeProduto(id_estoque);

                es.setQuantidade(quantidade);

                if(funcaoestoque.Alterar(es)){
                    System.out.println("ALTERADO!");
                }else{
                    System.out.println("ERRO AO ALTERAR!");
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void Diminuir(Scanner sc){
        // Declaração de variáveis e objetos
        Estoque es = new Estoque();
        FuncaoEstoque funcaoestoque = new FuncaoEstoque();
        int id_estoque, quantidade;

        try {
            System.out.print("Digite o ID do estoque: ");
            id_estoque = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            es.setIdEstoque(id_estoque);

            if(funcaoestoque.EncontrarId(id_estoque)==-1){
                System.out.println("ID INCORRETO");
            }else{

                System.out.print("Digite a quantidade para diminuir no estoque: ");
                quantidade = sc.nextInt();

                quantidade = funcaoestoque.QuantidadeProduto(id_estoque) - quantidade;
                if(quantidade < 0){
                    quantidade = 0;
                }

                es.setQuantidade(quantidade);

                if(funcaoestoque.Alterar(es)){
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
