import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String args[]) {

        int range = 4;

        System.out.println("Enter 4 number here:");
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[range];

        for (int i = 0; i < range; i++) {
            array[i] = scanner.nextInt();
        }

        int array1[] = new int[range / 2];
        System.arraycopy(array, 0, array1, 0, range / 2);

        int array2[] = new int[range / 2];
        System.arraycopy(array, range / 2, array2, 0, range / 2);

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

    }
}





