package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Pessoa {
    protected String nome;
    protected String tel;
    protected String end;
    protected int id_pessoa;
    protected String tipoc;

    public Pessoa(){

    }
    public Pessoa(String nome, String tel, String end, int id_pessoa,String tipoc) {
        this.nome = nome;
        this.tel = tel;
        this.end = end;
        this.id_pessoa = id_pessoa;
        this.tipoc = tipoc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public String getTipo()
    {
        return tipoc;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public abstract boolean cadastroCliente(Cliente p);

    public int IndicePessoa(){
        int id = 0;
        try {
            File arquivo = new File("src/arquivo/cliente.txt");
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
}