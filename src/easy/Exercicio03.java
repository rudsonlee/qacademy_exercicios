package easy;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public  void retornaValor() {
        String primeiroValor;
        String segundoValor;
        primeiroValor = JOptionPane.showInputDialog("Digite um valor");
        segundoValor = JOptionPane.showInputDialog("Digite um segundo valor");

        System.out.println("primeiro valor digitado:" + segundoValor);
        System.out.println("segundo valor digitado:" + primeiroValor);
    }
}
