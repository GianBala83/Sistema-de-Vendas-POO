package visao.listar;

import funcao.FuncaoCliente;

import java.util.List;

public class ListarClientes {

    public void ListaClientes(){
        FuncaoCliente fc = new FuncaoCliente();

        try {
            List<String> linhas;
            linhas = fc.ListarClientes();
            System.out.println();
            for (String l : linhas) {
                System.out.println(l);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
