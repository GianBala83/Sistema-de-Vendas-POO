package visao.cadastrar;

import java.util.Scanner;

import funcao.FuncaoProduto;
import modelo.Produto;

public class CadastrarProduto {
    public void Cadastrar(Scanner sc){
        // Declaração de objetos
        
        Produto p = new Produto();
        FuncaoProduto funcaoproduto = new FuncaoProduto();

        try {
            //System.out.print("Digite o ID do produto: ");
            //id_produto = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente
            System.out.print("Digite o nome do produto: ");
            p.setNome(sc.nextLine());
            System.out.print("Digite o valor do produto: ");
            p.setValor(sc.nextDouble());

            int id = funcaoproduto.IndiceProduto();

            p.setIdProduto(id);

            if(funcaoproduto.Cadastrar(p)){
                System.out.println("CADASTRADO!");
            }else{
                System.out.println("ERRO AO CADASTRAR!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
