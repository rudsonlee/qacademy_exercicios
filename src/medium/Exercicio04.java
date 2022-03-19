package medium;

public class Exercicio04 {
    public static void main(String[] args) {
        int i = 1, resultadoMulti = 1;
        while (i <= 1000) {
            resultadoMulti = resultadoMulti * i;
            if (resultadoMulti >= 1000) {
                resultadoMulti = 1;
            }
            System.out.println("O resultado da multiplicação é: " + resultadoMulti);
            i++;

        }
    }
}
