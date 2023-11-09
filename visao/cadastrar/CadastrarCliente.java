package visao.cadastrar;

import funcao.FuncaoCliente;
import modelo.ClienteF;
import modelo.ClienteJ;

import java.util.Scanner;

public class CadastrarCliente {

    public void cadastrarClienteF(Scanner sc){

        ClienteF cf = new ClienteF();
        FuncaoCliente fc = new FuncaoCliente();

        try{
            sc.nextLine();
            System.out.println("Digite o nome do cliente: ");
            cf.setNome(sc.nextLine());
            System.out.println("Digite o endereço: ");
            cf.setEnd(sc.nextLine());
            System.out.println("Digite o telefone: ");
            cf.setTel(sc.nextInt());
            System.out.println("Digite o CPF:");
            cf.setCpf(sc.nextInt());

            cf.setId_pessoa(fc.IndiceCliente());

            if(fc.CadastraCliente(cf)){
                System.out.println("CADASTRADO!");
            }else{
                System.out.println("ERRO AO CADASTRAR!");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void cadastrarClienteJ(Scanner sc){

        ClienteJ cj = new ClienteJ();
        FuncaoCliente fc = new FuncaoCliente();

        try{
            sc.nextLine();
            System.out.println("Digite o nome do cliente: ");
            cj.setNome(sc.nextLine());
            System.out.println("Digite o endereço: ");
            cj.setEnd(sc.nextLine());
            System.out.println("Digite o telefone: ");
            cj.setTel(sc.nextInt());
            sc.nextLine();
            System.out.println("Digite o CNPJ:");
            cj.setcNPJ(sc.nextInt());
            sc.nextLine();

            cj.setId_pessoa(fc.IndiceCliente());

            if(fc.CadastraCliente(cj)){
                System.out.println("CADASTRADO!");
            }else{
                System.out.println("ERRO AO CADASTRAR!");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }


}
