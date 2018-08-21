import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
    public static void main (String[] args) {

        System.out.print("Enter massive from 10 elements, each element should be a number \n");
        System.out.print("Ex. 9 5 6 4 3 1 2 7 8 10 \n");
        Scanner element = new Scanner (System.in);
        int[] a = new int [10];
        a[0]=element.nextInt();
        a[1]=element.nextInt();
        a[2]=element.nextInt();
        a[3]=element.nextInt();
        a[4]=element.nextInt();
        a[5]=element.nextInt();
        a[6]=element.nextInt();
        a[7]=element.nextInt();
        a[8]=element.nextInt();
        a[9]=element.nextInt();

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        element.close();
    }
}
