package funcao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import modelo.Produto;

public class FuncaoProduto {

    public int IndiceProduto(){
        int id = 0;
        try {
            File arquivo = new File("src/arquivo/produto.txt");
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

    public boolean Cadastrar(Produto p) {
        try {
            // Passo 1: Abre o arquivo em modo de adição (append)
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/arquivo/produto.txt", true));

            // Passo 2: Adiciona uma nova linha ao arquivo
            String linha = p.getIdProduto() + " - " + p.getNome() + " - " + p.getValor() + "\n";
            bw.write(linha);

            // Passo 3: Fecha o BufferedWriter
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    private int encontrarLinha(int id){
        int i = -1;
        try {
            int cont = 1;
            // Passo 1: Abre o arquivo em modo de adição (append)
            File arquivo = new File("src/arquivo/produto.txt");
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
    public boolean Excluir(Produto p) {
        try {
            int id = encontrarLinha(p.getIdProduto());

            if(id == -1){
                return false;
            }
            // Passo 1: Abre o arquivo em modo de adição (append)
            File arquivo = new File("src/arquivo/produto.txt");
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
            BufferedReader br = new BufferedReader(new FileReader("src/arquivo/produto.txt"));

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