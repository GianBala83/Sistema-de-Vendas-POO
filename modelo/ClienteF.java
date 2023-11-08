package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClienteF extends Cliente {
    private int cpf;

    public ClienteF(){
        super();
    }
    public ClienteF(String nome, String tel, String end, int idCliente, int cpf){
        super(nome, tel, end, idCliente);
        this.cpf = cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getcpf() {
        return cpf;
    }

}