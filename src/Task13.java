import java.util.Scanner;

public class Task13 {


    static void MultiLong() {

        Scanner n = new Scanner(System.in);
        System.out.println("Enter number1:");
        int a = n.nextInt();
        System.out.println("Enter number2:");
        int b = n.nextInt();
        int multi = a * b;
        long multiLong = multi;
        System.out.println("number1 * number2 = "+multiLong);
    }

    public static void main(String... args) {
        MultiLong();
    }

}
