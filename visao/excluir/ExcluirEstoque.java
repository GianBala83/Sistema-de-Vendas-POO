package visao.excluir;

import java.util.Scanner;

import funcao.FuncaoEstoque;
import modelo.Estoque;

public class ExcluirEstoque {
    public void Excluir(Scanner sc){
        // Declaração de variáveis e objetos
        Estoque es = new Estoque();
        FuncaoEstoque funcaoestoque = new FuncaoEstoque();
        int id_estoque;

        try {
            System.out.print("Digite o ID do produto: ");
            id_estoque = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            es.setIdEstoque(id_estoque);
            
            if(funcaoestoque.Excluir(es)){
                System.out.println("EXCLUIDO!");
            }else{
                System.out.println("ERRO AO EXCLUIR!");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
