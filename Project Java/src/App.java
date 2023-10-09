import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int n =0;
        for (int i=0; i<5; i++) {
            // String test = "Hello";
            System.out.printf("%s Digite um número: ", i);
            n += sc.nextInt();
        }
        System.out.println("Total: " + n);
        sc.close();   
    }
}
