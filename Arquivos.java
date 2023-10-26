import java.io.BufferedReader;

public class Arquivos {
    
    // Nomes temporarios
    // Gravar Clients
    // OBS: PROCURA UM MEIO DE MELHORA PARA Q ESSAS FUNÇÕES FIQUEM GENERICAS!
    public static void writter (String filename, Clients Clientes[]){
        try{
            java.io.FileOutputStream arquivo = new java.io.FileOutputStream(filename);
            java.io.PrintWriter pr = new java.io.PrintWriter(arquivo);
            
            int len = Clientes.length;

            for (int i = 0; i<len; i++){
                pr.printf("%s - ", Clientes[i].getNome());
                pr.printf("%s - ", Clientes[i].getTelefone());
                pr.printf("%s - ", Clientes[i].getCPF());
                pr.printf("%s", Clientes[i].getEndereco());
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

    public static void reader(String filename, Clients Clientes[]){
        try{
            java.io.FileInputStream arquivo = new java.io.FileInputStream(filename);
            java.io.InputStreamReader inp = new java.io.InputStreamReader(arquivo);
            java.io.BufferedReader br = new BufferedReader(inp);

            String line;
            int line_id = 0;
            do{
                line = br.readLine();
                if (line != null){
                    //System.out.println(line);
                    // Aqui fica o tratamento para retorna os valores para o Array
                    // Por enquanto vamos usar um slipt
                    String [] dados = line.split(" - ");
                    Clientes[line_id] = new Clients(dados[0], dados[1], dados[2], dados[3]);

                }
            }while(line != null);

            System.out.println("Leitura do Arquivo feita com Sucesso!");
            br.close();

        }
        catch(Exception e){
            System.out.println("Aconteceu algum erro!");
        }
    }

}