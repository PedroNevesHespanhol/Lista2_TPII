public class Exercicio4 {

    public static void main(String[] args) {

        Integer[] gols = {8,4,6,10,9,7,8,12,5,8,3};
        Integer[] discrepancia = new Integer[11];
        Integer[] variancia = new Integer[11];
        Integer media = 0;

        System.out.println("Calc Dos valores");

        for (int i = 0; i < 11; i ++) {
            // variavel j utilizada para a contagem do vetor iniciar como e  terminar como 20
            int j = i + 1;

            media += gols[i];
            discrepancia[i] = gols[i] - media;
            variancia[i] = (discrepancia[i] * discrepancia[i]);

            System.out.println("Jogador|" + "   Acertos(Xi)  |" + "  xi  |" + "  xi*2");
            System.out.println( j + "               " + gols[i] + "         " + discrepancia[i] + "       " + variancia[i]);
        }
    }

}