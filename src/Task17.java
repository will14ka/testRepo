import java.util.Arrays;

public class Task17 {

    static int[] sumArray(int array1[], int array2[]) {

        int sum[] = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            sum[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum[i + array1.length] = array2[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] array1 = {23456, 434, 3, 343, 0, 34, 5, 2, 2, 10};

        int[] array2 = {45, 2, 3, 843, 9, 4, 5, 2, 2, 0, 8, 65};

        System.out.println(Arrays.toString(sumArray(array1, array2)));
    }
}
