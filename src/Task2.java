import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {

        System.out.print("Please enter any data to String 1:");
        Scanner str1 = new Scanner (System.in);
        String string1 = str1.nextLine();
        System.out.print("Please enter any data to String 2:");
        Scanner str2 = new Scanner (System.in);
        String string2 = str2.nextLine();
        System.out.print("Please enter any data to String 3:");
        Scanner str3 = new Scanner (System.in);
        String string3 = str3.nextLine();
       System.out.println(string1+string3);
        System.out.println(string3+string2+string1);
        System.out.println(string1+string2+string3);

    }
}
