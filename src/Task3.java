import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {

        System.out.print("Please enter X:");
        Scanner n = new Scanner (System.in);
        int number1 = Integer.parseInt(n.nextLine());
        System.out.print("Please enter Y:");
        int number2 = Integer.parseInt(n.nextLine());

        System.out.print("Simple operations results: \n");
        System.out.print("X+Y="+(number1+number2)+"\n");
        System.out.print("Y-X="+(number2-number1)+"\n");
        System.out.print("Y/X="+(number2/number1)+"\n");
        System.out.print("Y*Y="+(number2*number2)+"\n");
        System.out.print("(X+Y)%X="+((number1+number2)%number1)+"\n");
    }
}
