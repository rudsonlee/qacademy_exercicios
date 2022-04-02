package medium;

public class Exercicio01 {
    public void imparPar() {
        int i = 0;

        
        while (i <= 100)
            {

            if (i % 2 == 0) {
                System.out.println("O numero:" + i + "É par!");
            } else {
                System.out.println("O numero:" + i + "É impar!");
                
            }
            i++;
        } // fim classe
    }// fim main
}// fim while
