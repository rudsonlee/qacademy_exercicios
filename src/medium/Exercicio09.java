package medium;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        String [] alunosVetor = new String[7];
        int[] numeroAlunosVetor = new int[7];
    int i = 0;
    
    while (i<7) {
        
        alunosVetor[i] = JOptionPane.showInputDialog("Digite o nome do aluno");
        numeroAlunosVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno"));
        i++;

    }
    i = 0;
        while (i<7) {
        System.out.println("O nome do aluno: " + alunosVetor[i] + "-" + "numero do aluno é: " + numeroAlunosVetor[i]);
        i++;
    }
    }


    }

