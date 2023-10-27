package funcoes;

import java.io.BufferedReader;
import java.util.List;
import objetos.*;

public class Arquivo {
    
    // Nomes temporarios
    // Gravar Clients
    // OBS: PROCURA UM MEIO DE MELHORA PARA Q ESSAS FUNÇÕES FIQUEM GENERICAS!
    public static void writter (String filename, List<Cliente> Clientes){
        try{
            java.io.FileOutputStream arquivo = new java.io.FileOutputStream(filename);
            java.io.PrintWriter pr = new java.io.PrintWriter(arquivo);
            
            int len = Clientes.size();

            for (int i = 0; i<len; i++){
                pr.printf("%s - ", Clientes.get(i).getNome());
                pr.printf("%s - ", Clientes.get(i).getTelefone());
                pr.printf("%s - ", Clientes.get(i).getCPF());
                pr.printf("%s", Clientes.get(i).getEndereco());
                pr.print("\n");
            }

            System.out.println("Atualização do arquivo feita com sucesso");
            pr.close();
            arquivo.close();

        }
        catch(Exception e){
            System.out.println("Aconteceu algum erro!");
        }
    }

    public static void reader(String filename, List<Cliente> Clientes){
        try{
            java.io.FileInputStream arquivo = new java.io.FileInputStream(filename);
            java.io.InputStreamReader inp = new java.io.InputStreamReader(arquivo);
            java.io.BufferedReader br = new BufferedReader(inp);

            String line;
            do{
                line = br.readLine();
                if (line != null){
                    String [] dados = line.split(" - ");
                    Cliente novoclient = new Cliente(dados[0], dados[1], dados[2], dados[3]);
                    Clientes.add(novoclient);
                }
            }while(line != null);

            System.out.println("Leitura do Arquivo feita com Sucesso!");
            br.close();
            arquivo.close();
        }
        catch(Exception e){
            System.out.println("Aconteceu algum erro!");
        }
    }

}