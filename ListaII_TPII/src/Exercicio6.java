import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 1, b = 1, c;
        
        System.out.print("Digite o valor de n: ");
        n = sc.nextInt();
        
        System.out.print("Os " + n + " primeiros números da sequência de Fibonacci são: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}
