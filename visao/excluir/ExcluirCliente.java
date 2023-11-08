package visao.excluir;

import funcao.FuncaoCliente;
import modelo.ClienteF;
import modelo.ClienteJ;

import java.util.Scanner;

public class ExcluirCliente {

    public void ExcluirClienteF(Scanner sc){

        FuncaoCliente fc = new FuncaoCliente();
        ClienteF cf = new ClienteF();
        int id_pessoa;


        try{
            System.out.println("Digite o id do cliente: ");
            id_pessoa = sc.nextInt();
            sc.nextLine();

            cf.setId_pessoa(id_pessoa);

            if(fc.ExcluirCliente(cf)){
                System.out.println("EXCLUIDO!");
            }else{
                System.out.println("ERRO AO EXCLUIR!");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ExcluirClienteJ(Scanner sc){

        FuncaoCliente fc = new FuncaoCliente();
        ClienteJ cf = new ClienteJ();
        int id_pessoa;


        try{
            System.out.println("Digite o id do cliente: ");
            id_pessoa = sc.nextInt();
            sc.nextLine();

            cf.setId_pessoa(id_pessoa);

            if(fc.ExcluirCliente(cf)){
                System.out.println("EXCLUIDO!");
            }else{
                System.out.println("ERRO AO EXCLUIR!");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
