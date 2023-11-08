package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import funcao.FuncaoProduto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cliente extends Pessoa{
    String cp;

    public Cliente(){
        super();
    }
    public Cliente(String nome, String tel, String end,String cp, int idCliente,String tipoc){
        super(nome, tel, end, idCliente,tipoc);
        this.cp = cp;
    }

    public String getcp() {
        return cp;
    }

    @Override
    public boolean cadastroCliente(Cliente p) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/arquivo/cliente.txt", true));
            String linha = p.getId_pessoa() + " - " + p.getNome() + " - " + p.getTel() + " - " + p.getEnd() + " - "+ "" + p.getcp()+ " - " + p.getTipo()+"\n";
            bw.write(linha);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void valoresCliente(Cliente j,Scanner sc)
    {
        int temp = 3;
        System.out.println("Digite o nome do cliente: ");
        sc.nextLine();
        j.nome = sc.nextLine();
        System.out.println("Digite o telefone do cliente: ");
        j.tel = sc.nextLine();
        System.out.println("Digite o endereço do cliente: ");
        j.end = sc.nextLine();
        System.out.println("Digite o cpf/cnpj do cliente: ");
        j.cp = sc.nextLine();
        System.out.println("Digite o tipo de cliente(1 - Cliente Físico // 2 - Cliente Juridico): ");
        while(temp != 1 && temp != 2){
        temp = sc.nextInt(); 
        if(temp == 1)
        {
            j.tipoc = "Fisico";
        }else if(temp == 2)
        {
            j.tipoc = "Juridico";
        }else
        {
           System.out.println("Tipo Inválido");
        }
        
        }
        j.setId_pessoa(IndicePessoa());
        cadastroCliente(j);
        
    }
    private int encontrarLinhaP(int id){
        int i = -1;
        try {
            int cont = 1;
            // Passo 1: Abre o arquivo em modo de adição (append)
            File arquivo = new File("src/arquivo/cliente.txt");
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" - ");
                String idString = partes[0];
                if(Integer.parseInt(idString) == id){
                    i = cont;
                }
                cont++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }

    public boolean ExcluirClient(Cliente p) {
        Scanner sc = new Scanner(System.in);
        try {
            int id = encontrarLinhaP(p.getId_pessoa());

            if(id == -1){
                return false;
            }
            // Passo 1: Abre o arquivo em modo de adição (append)
            File arquivo = new File("src/arquivo/cliente.txt");
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            List<String> linhas = new ArrayList<>();
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
            br.close();

            if (id > 0 && id <= linhas.size()) {
                linhas.remove(id - 1); // Subtrai 1 porque a lista é baseada em zero
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
            for (String l : linhas) {
                bw.write(l);
                bw.newLine();
            }
            bw.close();
            //ExcluirCliente(sc);
           

        } catch (IOException e) {
            e.printStackTrace();
            sc.close();
            return false;
        }
        return true;
    }
    public void ExcluirCliente(Scanner sc){
        // Declaração de variáveis e objetos
        Cliente p = new Cliente();
        ListarP();
        int id_p;

        try {
            System.out.print("Digite o ID do cliente: ");
            id_p = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            p.setId_pessoa(id_p);

            if(ExcluirClient(p)){
                System.out.println("EXCLUIDO!");
            }else{
                System.out.println("ERRO AO EXCLUIR!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void ListarP(){
        // Declaração de variáveis e objetos
        Cliente p = new Cliente();

        try {
            List<String> linhas = new ArrayList<>();
            linhas = p.ListarPes();
            System.out.println();
            for (String l : linhas) {
                System.out.println(l);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public List<String> ListarPes(){
        // Declaração de variáveis e objetos

        try {
            List<String> lista = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("src/arquivo/cliente.txt"));

            String linha;
            while ((linha = br.readLine()) != null) {
                lista.add(linha);
            }
            br.close();

            return lista;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}