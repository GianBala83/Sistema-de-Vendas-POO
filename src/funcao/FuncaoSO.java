package funcao;

public class FuncaoSO {
    public static String obterSistemaOperacional() {
        String os = System.getProperty("os.name").toLowerCase();
    
        if (os.contains("win")) {
            return "Windows";
        } else if (os.contains("mac")) {
            return "Mac OS";
        } else if (os.contains("nix") || os.contains("nux")) {
            return "Unix / Linux";
        } else if (os.contains("sunos")) {
            return "Solaris";
        } else if (os.contains("ubuntu")) {
            return "Ubuntu";
        }
    
        return "Sistema operacional não identificado";
    }
    public static void limpar(String so){
        try {
            if (so.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (so.contains("nix") || so.contains("nux") || so.contains("mac")) {
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Limpeza de terminal não suportada para este sistema operacional.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
