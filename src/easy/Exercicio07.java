package easy;

public class Exercicio07 {
    public void retornaSalario() {

        double salario, inss = 0.0; // declaração das variaveis
        String salarioStg = "6101.07"; // Leitura da digitação
        salario = Double.parseDouble(salarioStg);// Conversão e atribuição na variavel salario

        if (salario <= 1045.00) {// abertura
            inss = salario * 0.075; // 7,5%
        } // fechamento do if
        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09; // 9%
        }
        if (salario >= 2089.61 && salario <= 3134.40) {
            inss = salario * 0.12;// 12%
        }

        if (salario >= 3134.41 && salario <= 6101.06) {
            inss = salario * 0.14; // 14%
        }
        if (salario > 6101.06) {
            inss = 854.15; //Teto
        }

        System.out.println("O Valor do inss a ser pago é R$ " + inss);
    }
}// fim da classe

