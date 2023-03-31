import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // leitura dos dados do aluno
        System.out.print("Digite o número de identificação do aluno: ");
        int numAluno = sc.nextInt();
        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = sc.nextDouble();

        // cálculo da média de aproveitamento
        double mediaAproveitamento = (nota1 + nota2*2 + nota3*3 + mediaExercicios) / 7;

        // determinação do conceito
        String conceito;
        if (mediaAproveitamento >= 9) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6) {
            conceito = "C";
        } else if (mediaAproveitamento >= 4) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // exibição dos resultados
        System.out.println("Número de identificação do aluno: " + numAluno);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}