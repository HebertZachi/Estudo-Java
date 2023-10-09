import java.util.Scanner;

public class averageSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "S"; // Inicialize com "S" ou "s" para entrar no loop pelo menos uma vez
        int cont = 0;
        float salary = 0;

        while (exit.equalsIgnoreCase("S")) { // Use equalsIgnoreCase para comparar strings sem diferenciação de maiúsculas/minúsculas
            System.out.print("Enter a salary: ");
            salary += sc.nextFloat();
            cont++;

            System.out.print("Do you want to enter another salary? [S/n]: ");
            exit = sc.next();
        }

        System.out.println("Average salary: " + (salary / cont));
    }
}

