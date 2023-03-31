package Exercicio8;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("#,###.00");

        String nomes[] = {"Pedro", "João", "Maria", "Jose", "Fernanda", "Gabriel", "Higor", "Cassio", "Vitor", "Breno"};
        String sobrenomes[] = {"Neves", "Silva", "Muniz", "Melete", "Ribeiro", "Senhuki", "Souza", "Hespanhol", "Santos", "Freitas"};
        double salarios[] = {1000.00, 2000.00, 2500.00, 3000.00, 3250.00, -4000.00, 4300.00, 9000.00, 2250.00, 3000.00};
        double ajustes[] = {10.00, 15.00, 21.00, 5.00, 50.00, 20.00, 45.00, 7.5, 8.9, 32.7};
        double totalFolha = 0.00;

        System.out.println("Lista de funcionários");
        totalFolha = lista(nomes, sobrenomes, salarios, totalFolha);

        System.out.println("\nValor total da folha de pagamentos: " + df.format(totalFolha));
        totalFolha = 0.00;

        System.out.println("\nLista de funcionários (atualizada)");
        totalFolha = listaAtualizada(nomes, sobrenomes, salarios, ajustes, totalFolha);

        System.out.println("\nValor total da folha de pagamentos: " + df.format(totalFolha));
    }

    private static double lista(String[] nomes, String[] sobrenomes, double[] salarios, double totalFolha) {
        for (int i = 0; i < 10; i++) {
            Funcionario func = new Funcionario(nomes[i], sobrenomes[i], salarios[i]);
            System.out.println("Nome: " + func.getPrimeiroNome() + " " + func.getSobrenome() + " -> Salário: " + func.getSalario());
            totalFolha += func.getSalario();
        }
        return totalFolha;
    }

    private static double listaAtualizada(String[] nomes, String[] sobrenomes, double[] salarios, double[] ajustes, double totalFolha) {
        for (int i = 0; i < 10; i++) {
            Funcionario func = new Funcionario(nomes[i], sobrenomes[i], salarios[i]);
            func.aumentaSalario(ajustes[i]);
            System.out.println("Nome: " + func.getPrimeiroNome() + " " + func.getSobrenome() + " -> Salário: " + func.getSalario());
            totalFolha += func.getSalario();
        }
        return totalFolha;
    }
}
