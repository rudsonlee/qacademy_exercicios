package easy;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public void retornaNumeros() {
        int primeiroNumero, segundoNumero, terceiroNumero;
        String primeiroNumeroDigitadoMtn = JOptionPane.showInputDialog("Digite o primeiro numero");
        String segundoNumeroDigitadoMtn = JOptionPane.showInputDialog("Digite o segundo numero");
        String terceiroNumeroDigitadoMtn = JOptionPane.showInputDialog("Digite o terceiro numero");
         
        primeiroNumero = Integer.parseInt(primeiroNumeroDigitadoMtn);
        segundoNumero = Integer.parseInt(segundoNumeroDigitadoMtn);
        terceiroNumero = Integer.parseInt(terceiroNumeroDigitadoMtn);

        System.out.println("A soma dos tres numeros digitados é: " +(primeiroNumero+ segundoNumero+ terceiroNumero));
        System.out.println("A subtração dos tres numeros digitados é: " +(primeiroNumero- segundoNumero- terceiroNumero));
        System.out.println("A multiplicação dos tres numeros digitados é: " +(primeiroNumero* segundoNumero* terceiroNumero));
        System.out.println("A média dos tres numeros digitados é: "+(primeiroNumero+ segundoNumero+ terceiroNumero) /3);


    }
}
