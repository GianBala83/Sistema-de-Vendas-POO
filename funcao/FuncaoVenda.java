package funcao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Venda;

public class FuncaoVenda {
    public int IndiceProduto(){
        int id = 0;
        try {
            File arquivo = new File("src/arquivo/vendas.txt");
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            String ultimaLinha = null;
            String linhaAtual;
            while ((linhaAtual = br.readLine()) != null) {
                ultimaLinha = linhaAtual;
            }
            br.close();

            if (ultimaLinha != null) {
                String[] partes = ultimaLinha.split(" - ");
                String idString = partes[0];
                id = Integer.parseInt(idString);
                id++; 
            } else {
                id = 1;
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return id;
    }
    public boolean Vender(Venda v) {
        try {
            // Passo 1: Abre o arquivo em modo de adição (append)
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/arquivo/vendas.txt", true));

            // Passo 2: Adiciona uma nova linha ao arquivo
            String linha = v.getIdVenda()+ " - " + v.getNomeCliente()+ " - " + v.getNomeProduto()+ " - " + v.getQuantidade()+ " - " + v.getValorUnitario()+ " - " + v.getValorTotal() + " - " + v.getData()+ "\n";
            bw.write(linha);

            // Passo 3: Fecha o BufferedWriter
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public List<String> Listar(){
        // Declaração de variáveis e objetos

        try {
            List<String> lista = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("src/arquivo/vendas.txt"));

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
    public String dataPorId(int id){
        String d = "00/00/0000";
        
        try {
            File arquivo = new File("src/arquivo/vendas.txt");
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" - ");
                if(Integer.parseInt(partes[0]) == id){
                    d = partes[6];
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return d;
    }

    public double totalVendas(){
        double total = 0.0;

        try {
            File arquivo = new File("src/arquivo/vendas.txt");
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" - ");
                total = total + Double.parseDouble(partes[5]);
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return total;
    }
}
