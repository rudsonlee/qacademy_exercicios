package ExerciciosMetodos.metodoComRetorno;

public class Exercicio01 {
    public static void main(String[] args) {
        String status = verficarAprovacao();
        System.out.println(status);
    }

    public static String verficarAprovacao() {
        int nota = 10;
        if (nota >= 5) {
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }

    public static String verficarAprova() {
        int nota = 10;
        if (nota >= 6) {
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }

    public static String verficarAprovado() {
        int nota = 10;
        if (nota >= 7) {
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }

    public static String verficacaoApRp() {
        int nota = 10;
        if (nota >= 8) {
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }

    public static String verficarReprovado() {
        int nota = 10;
        if (nota >= 9) {
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }

    public static String verficacaoAprovados() {
        int nota = 10;
        if (nota >= 4) {
            return "Aprovado" + (nota);
        } else {
            return "Reprovado";
        }
    }

      
}
