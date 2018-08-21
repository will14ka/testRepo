import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {

        System.out.print("Please enter number1:");
        Scanner n1 = new Scanner (System.in);
        int number1 = Integer.parseInt(n1.nextLine());
        System.out.print("Please enter number2:");
        Scanner n2 = new Scanner (System.in);
        int number2 = Integer.parseInt(n2.nextLine());
        System.out.print("Simple operations results: \n");
        System.out.print("number1+number2=");
        System.out.println(number1+number2);
        System.out.print("number2-number1=");
        System.out.println(number2-number1);
        System.out.print("number2/number1=");
        System.out.println(number2/number1);
        System.out.print("number2*number2=");
        System.out.println(number2*number2);
        System.out.print("(number1+number2)%number1=");
        System.out.println((number1+number2)%number1);

    }
}
