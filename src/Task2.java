import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.print("Please enter any data to String 1:");
        Scanner str = new Scanner(System.in);
        String string1 = str.nextLine();
        System.out.print("Please enter any data to String 2:");
        String string2 = str.nextLine();
        System.out.print("Please enter any data to String 3:");
        String string3 = str.nextLine();
        System.out.println(string1 + string3);
        System.out.println(string3 + string2 + string1);
        System.out.println(string1 + string2 + string3);

    }
}
