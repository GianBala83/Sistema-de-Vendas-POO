package modelo;

public class ClienteJ extends Cliente {
    int cNPJ;

    public ClienteJ() {
        super();
    }

    public ClienteJ(String nome, String tel, String end, int idCliente, int cNPJ) {
        super(nome, tel, end, idCliente);
        this.cNPJ = cNPJ;
    }

    public int getcNPJ() {
        return cNPJ;
    }

    public void setcNPJ(int cNPJ) {
        this.cNPJ = cNPJ;
    }
}
