import java.util.Scanner;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean continuar = true;

        while (continuar) {

            System.out.print("Informe o salário do colaborador: R$ ");
            double salarioAtual = scanner.nextDouble();

            double percentualAumento = 0.0;
            double valorAumento = 0.0;

            if (salarioAtual <= 280.00) {
                percentualAumento = 20.0;
            } else if (salarioAtual > 280.00 && salarioAtual <= 700.00) {
                percentualAumento = 15.0;
            } else if (salarioAtual > 700.00 && salarioAtual <= 1500.00) {
                percentualAumento = 10.0;
            } else {
                percentualAumento = 5.0;
            }

            valorAumento = salarioAtual * percentualAumento / 100;
            double novoSalario = salarioAtual + valorAumento;

            // Inflacao do período
            double inflacao = 3.8;

            // Valor do aumento real, descontado a inflação
            double valorAumentoReal = valorAumento - (salarioAtual * inflacao / 100);

            System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
            System.out.printf("Percentual de aumento aplicado: %.1f%%%n", percentualAumento);
            System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
            System.out.printf("Novo salário, após o aumento: R$ %.2f%n", novoSalario);
            System.out.printf("Valor do aumento real, descontado a inflação: R$ %.2f%n", valorAumentoReal);


        }

    }
}
