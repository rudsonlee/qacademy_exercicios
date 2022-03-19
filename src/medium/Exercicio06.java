package medium;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        
        int fatorial, i;
        String fatorialDigitandoString = JOptionPane.showInputDialog("Digite o numero pra calcular o fatorial");
        fatorial=Integer.parseInt(fatorialDigitandoString);
        i = fatorial;

        while (i>1) {
         fatorial = fatorial * (i-1);
         i--;
        }
         System.out.println("O fatorial  do numero digitado é: " + fatorial);   
        }


    }
