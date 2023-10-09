import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temperature[][] = new float[2][3];
        for (int i = 0; i < temperature.length; i++) {
            for (int j = 0; j < temperature.length; j++) {
                System.out.println();
                System.out.printf("%d %d Digite um valor de temperatura para armazenar em: ", i, j);
                temperature[i][j] = sc.nextFloat();   
            }

        }
        System.out.println(temperature);
    }
}
