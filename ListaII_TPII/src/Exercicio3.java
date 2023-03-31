import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salario = new double[20];
        double[] salarioNovo = new double[20];
        double[] diferenca = new double[20];
        double totalSalario = 0;
        double totalSalarioNovo = 0;
        double totalDiferenca = 0;

        leValores(sc, salario);
        comparaSalarios(salario, salarioNovo, diferenca);
        totalColunas(totalSalario, totalSalarioNovo, totalDiferenca, salario, salarioNovo, diferenca);

    }

    private static void leValores(Scanner sc, double[] salario) {
        for (int i = 0; i < 20; i++) {
            // variavel j utilizada para a contagem do vetor iniciar como e  terminar como 20
            int j = i +1;

            System.out.print("Digite o valor do salario do " + j +"º funcionario: ");
            salario[i] = sc.nextDouble();
        }
    }

    private static void comparaSalarios(double[] salario, double[] salarioNovo, double[] diferenca) {
        for (int i = 0; i < 20; i++) {
            int j = i +1;

            salarioNovo[i] = salario[i] + (salario[i] * 0.08);
            diferenca[i] = salarioNovo[i] - salario[i];

            System.out.println(j + "º funcionario: " + "\nSalario antigo -> " + salario[i] + " | Salario novo -> "
                    + salarioNovo[i] + " | Diferença dos salarios -> " + diferenca[i]);
        }
    }

    private static void totalColunas(double totalSalario, double totalSalarioNovo, double totalDiferenca, double[] salario, double[] salarioNovo, double[] diferenca) {
        for (int i = 0; i < 20; i++) {
            totalSalario += salario[i];
            totalSalarioNovo += salarioNovo[i];
            totalDiferenca += diferenca[i];

        }
        System.out.println("\nTotal salario antigo -> " + totalSalario + " | Total salario novo -> "
        + totalSalarioNovo + " | Total diferença dos salarios -> " + totalDiferenca);
    }
}