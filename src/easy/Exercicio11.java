package easy;

import javax.swing.JOptionPane;

public class Exercicio11 {
    public void retornaNumeroDigitado11(){
        int numeroDigitado;
        int i = 1;
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;
            System.out.println("O Total somado é: " + numeroDigitado);
            i++;
        }
        System.out.println("O Total somado é: " + numeroDigitado);
    }

}
