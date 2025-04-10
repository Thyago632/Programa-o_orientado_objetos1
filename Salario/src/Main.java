import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String salarioStr = JOptionPane.showInputDialog("Digite o salário do colaborador:");
        double salario = Double.parseDouble(salarioStr);


        double percentualAumento = 0;
        double valorAumento = 0;
        double salarioReajustado = 0;
        double inflacao = 3.8 / 100;
        double aumentoReal = 0;


        if (salario <= 280) {
            percentualAumento = 0.20;
        } else if (salario > 280 && salario <= 700) {
            percentualAumento = 0.15;
        } else if (salario > 700 && salario <= 1500) {
            percentualAumento = 0.10;
        } else {
            percentualAumento = 0.05;
        }


        valorAumento = salario * percentualAumento;
        salarioReajustado = salario + valorAumento;
        aumentoReal = valorAumento - (salario * inflacao);


        String mensagem = String.format(
                "Salário antes do reajuste: R$ %.2f\n" +
                        "Percentual de aumento aplicado: %.2f%%\n" +
                        "Valor do aumento: R$ %.2f\n" +
                        "Valor do aumento real (descontada a inflação): R$ %.2f\n",
                salario, percentualAumento * 100, valorAumento, aumentoReal
        );


        JOptionPane.showMessageDialog(null, mensagem);
    }
}
