package medium;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public void valorAtualizado () {
        double valorInvestimento, taxaJuros = 0.05, totalAtualizadoComJuros;
        int ano = 1, tempoInvestido = 10;
        String valorInvestidoStg = JOptionPane.showInputDialog("Digite um valor de investimento");
        valorInvestimento = Integer.parseInt(valorInvestidoStg);
        totalAtualizadoComJuros = valorInvestimento;

        while (ano <= tempoInvestido) { 
            totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;
        
            ano++;
        }
        System.out.println("O valor do investimento são: " +valorInvestimento);
        System.out.println("O valor do juros são: " + (valorInvestimento - totalAtualizadoComJuros));
        System.out.println("O total do investimento: " +totalAtualizadoComJuros);   
        }
    }
