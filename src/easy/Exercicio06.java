package easy;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        Double nota1, nota2, resultado;
        String nota1Media = JOptionPane.showInputDialog("Digite a primeira nota");
        String nota2MEdia = JOptionPane.showInputDialog("Digite a segunda nota");

         nota1 = Double.parseDouble(nota1Media);
         nota2 = Double.parseDouble(nota2MEdia);

         resultado = (nota1 + nota2)/2;
         System.out.println(resultado);
         if (resultado >5) {//inicio se
         System.out.println("Aprovado");
         } // fim se
         if (resultado <5) {//inicio se
        System.out.println("Reprovado");
    }//fim se
    if (resultado ==5) {//inicio se
    System.out.println("Exame");
}//fim se
    }
}
