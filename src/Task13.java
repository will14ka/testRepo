import java.util.Scanner;

public class Task13 {

public static void main(String... args) {

    }

    public static long Multiplication(int a, int b){

        System.out.println("Enter number 1:");
        Scanner scanner = new Scanner(System.in);
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number 2:");
        b = Integer.parseInt(scanner.nextLine());
        int Multi = a*b;
        System.out.println(a*b);
        return Multi;
    // long multiplication = Multi.longValue();
    }
}
