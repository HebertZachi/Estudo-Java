public class fibonaci {

    public static void main(String[] args) {
        int atual = 1;
        int ant = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(atual);

            int proximo = atual + ant;
            ant = atual;
            atual = proximo;
        }
    }
}