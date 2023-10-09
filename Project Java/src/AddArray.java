import java.util.ArrayList;
import java.util.Scanner;

public class AddArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int array[];
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int value = sc.nextInt();
            array.add(value);
        }
        System.out.println(array);
    }
}

