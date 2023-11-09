package funcao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Estoque;


public class FuncaoEstoque {

    public int IndiceEstoque(){
        int id = 0;
        try {
            File arquivo = new File("src/arquivo/estoque.txt");
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

    public List<String> Listar(){
        // Declaração de variáveis e objetos

        try {
            List<String> lista = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("src/arquivo/estoque.txt"));

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

    public boolean Alterar(Estoque es) {
        try {
            int i = EncontrarLinha(es.getIdEstoque());
            if(i == -1){
                return false;
            }
            // Passo 1: Abre o arquivo em modo de adição (append)
            File arquivo = new File("src/arquivo/estoque.txt");
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            List<String> linhas = new ArrayList<>();
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
            br.close();

            if (i > 0 && i <= linhas.size()) {
                String[] partes = linhas.get(i-1).split(" - ");
                partes[2] = Integer.toString(es.getQuantidade());
                linhas.set(i-1, String.join(" - ", partes));
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

    public boolean Cadastrar(Estoque es) {
        try {
            // Passo 1: Abre o arquivo em modo de adição (append)
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/arquivo/estoque.txt", true));

            // Passo 2: Adiciona uma nova linha ao arquivo
            String linha = es.getIdEstoque() + " - " + es.getIdProduto() + " - " + es.getQuantidade() + "\n";
            bw.write(linha);

            // Passo 3: Fecha o BufferedWriter
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean EncontrarIdProduto(int id){
        if(EncontrarLinhaProduto(id)){
            return true;
        }
        return false;
    }

    private boolean EncontrarLinhaProduto(int id){
        boolean b = false;
        try {
            // Passo 1: Abre o arquivo em modo de adição (append)
            File arquivo = new File("src/arquivo/estoque.txt");
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(" - ");
                String idString = partes[1];
                if(Integer.parseInt(idString) == id){
                    b = true;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return b;
    }

    public int EncontrarId(int id){
        int i = -1;
        if(EncontrarLinha(id)!=-1){
            i = id;
        }
        return i;
    }

    private int EncontrarLinha(int id){
        int i = -1;
        try {
            int cont = 1;
            // Passo 1: Abre o arquivo em modo de adição (append)
            File arquivo = new File("src/arquivo/estoque.txt");
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
    public int QuantidadeProduto(int id){
        int n = 0;

        try {
            int i = EncontrarLinha(id);

            // Passo 1: Abre o arquivo em modo de adição (append)
            File arquivo = new File("src/arquivo/estoque.txt");
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            List<String> linhas = new ArrayList<>();
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
            br.close();

            if (i > 0 && i <= linhas.size()) {
                String[] partes = linhas.get(i-1).split(" - ");
                n = Integer.parseInt(partes[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return n;
    }

    public boolean Excluir(Estoque es) {
        try {
            int id = EncontrarLinha(es.getIdEstoque());

            if(id == -1){
                return false;
            }
            // Passo 1: Abre o arquivo em modo de adição (append)
            File arquivo = new File("src/arquivo/estoque.txt");
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

    public int idProduto(int id){
        int id_produto = 0;
        try {
            List<String> linhas = new ArrayList<>();
            linhas = Listar();
            System.out.println();
            for (String l : linhas) {
                String[] partes = l.split(" - ");
                if(id == Integer.parseInt(partes[0])){
                    id_produto = Integer.parseInt(partes[1]);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return id_produto;
    }
}
