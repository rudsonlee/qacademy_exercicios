package easy;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int numeroDigitado, resultado;
        String numeroDigitadoUsuario =JOptionPane.showInputDialog("Digite um numero");
        numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
        resultado = numeroDigitado * 2;

        System.out.println("O dobro do numero digitado é:" +resultado);
    
    }
}
