public class Exercicio7 {
    public static void main(String[] args) {
        int ano = 2000; // ano inicial
        int popA = 5000000; // população do país A em 2000
        int popB = 7000000; // população do país B em 2000
        double taxaA = 0.03; // taxa de natalidade do país A (3%)
        double taxaB = 0.02; // taxa de natalidade do país B (2%)

        // enquanto a população do país A for menor ou igual à população do país B
        while (popA <= popB) {
            // cálculo das novas populações
            popA += (int)(popA * taxaA);
            popB += (int)(popB * taxaB);
            ano++; // avança um ano

            // exibição das informações
            System.out.println("Ano: " + ano);
            System.out.printf("População do país A: %d (%.2f%% da população total)\n", popA, 100.0 * popA / (popA + popB));
            System.out.printf("População do país B: %d (%.2f%% da população total)\n", popB, 100.0 * popB / (popA + popB));
        }

        // exibição do resultado final
        System.out.printf("A população do país A ultrapassará a população do país B em %d anos.\n", ano - 2000);
    }
}
