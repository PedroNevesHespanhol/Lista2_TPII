import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int val1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int val2 = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int val3 = sc.nextInt();

        int menor, medio, maior;

        if (val1 < val2 && val1 < val3) {
            menor = val1;
            if (val2 < val3) {
                medio = val2;
                maior = val3;
            } else {
                medio = val3;
                maior = val2;
            }
        } else if (val2 < val1 && val2 < val3) {
            menor = val2;
            if (val1 < val3) {
                medio = val1;
                maior = val3;
            } else {
                medio = val3;
                maior = val1;
            }
        } else {
            menor = val3;
            if (val1 < val2) {
                medio = val1;
                maior = val2;
            } else {
                medio = val2;
                maior = val1;
            }
        }

        System.out.println("Valores em ordem crescente: " + menor + ", " + medio + ", " + maior);

        sc.close();
    }
}