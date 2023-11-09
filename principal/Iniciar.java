package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Iniciar {

    public void Inicio() {

        String c, p, e, v;
        c = "src/arquivo/clientes.txt";
        p = "src/arquivo/produto.txt";
        e = "src/arquivo/estoque.txt";
        v = "src/arquivo/vendas.txt";

        try {
            //Iniciando os arquivos cliente, estoque e produto.
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(c, true));
            bw.close();
            bw = new BufferedWriter(new FileWriter(p, true));
            bw.close();
            bw = new BufferedWriter(new FileWriter(e, true));
            bw.close();
            bw = new BufferedWriter(new FileWriter(v, true));
            bw.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        
    }
}
