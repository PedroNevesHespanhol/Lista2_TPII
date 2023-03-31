public class Exercicio2 {
    
    public static void main(String[] args) {
        
        int[] array = new int[15];

        for(int i = 0; i < array.length; i++){

            array[i] = i * 3;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". " + array[i] + " é ");

            if (array[i] % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("ímpar");
            }
        }
    }
}
