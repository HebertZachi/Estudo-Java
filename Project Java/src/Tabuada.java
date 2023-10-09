import java.util.Scanner;

/**
 * Tabuada
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a tabuada que deseja: ");
        int tabuada = sc.nextInt();
        
        for(int i=0; i<=12; i++) {
            int result = i*tabuada;
            System.out.println("");
            System.out.printf("%d x %d = %d",tabuada, i,result);
        }
        sc.close();
    }
}