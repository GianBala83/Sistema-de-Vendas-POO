package visao.cadastrar;

import java.util.Scanner;

import funcao.FuncaoEstoque;
import funcao.FuncaoProduto;
import modelo.Estoque;
import modelo.Produto;

public class CadastrarEstoque {
    
    public void Cadastrar(Scanner sc){
        // Declaração de objetos
        
        Estoque es = new Estoque();
        Produto p = new Produto();
        FuncaoEstoque funcaoestoque = new FuncaoEstoque();
        FuncaoProduto funcaoproduto = new FuncaoProduto();

        try {
            System.out.print("Digite o ID do produto: ");
            p.setIdProduto(sc.nextInt());
            
            if(funcaoproduto.EncontrarId(p.getIdProduto())==-1){
                System.out.println("ID INCORRETO!");
            }else{
                int id = p.getIdProduto();
                if(funcaoestoque.EncontrarIdProduto(id)){
                    System.out.println("PRODUTO JÁ ESTÁ NO ESTOQUE!");
                }else{
                    es.setIdEstoque(funcaoestoque.IndiceEstoque());
                    es.setIdProduto(p.getIdProduto());
                    es.setQuantidade(0);
                    if(funcaoestoque.Cadastrar(es)){
                        System.out.println("CADASTRADO!");
                    }else{
                        System.out.println("ERRO AO CADASTRAR!");
                    }
                }
            }     
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
