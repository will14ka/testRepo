import java.util.Scanner;

public class Task13 {

    static long multiplication(int x, int y) {

        long multi = (long) x * y;
        return multi;
    }

    public static void main(String... args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number1:");
        int a = n.nextInt();
        System.out.println("Enter number2:");
        int b = n.nextInt();
        System.out.println("number1 * number2 = " + multiplication(a, b));

    }

}
