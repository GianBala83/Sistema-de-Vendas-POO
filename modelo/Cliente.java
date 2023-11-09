package modelo;

public abstract class Cliente {
    private String nome;
    private String tel;
    private String end;
    private int id_pessoa;

    public Cliente(){

    }
    public Cliente(String nome, String  tel, String end, int id_pessoa) {
        this.nome = nome;
        this.tel = tel;
        this.end = end;
        this.id_pessoa = id_pessoa;
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

    public void setTel(int tel) {
        this.tel = String.valueOf(tel);
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

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

}

