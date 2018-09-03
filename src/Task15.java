import java.util.Arrays;

public class Task15 {

    private static int sizeof(int[] a) {
        //return a.length * 4;
        return Integer.BYTES * a.length;
    }

    public static void main(String... args) {
        int[] array = {1, 2, 3, 4, 15, 0};
        System.out.println(sizeof(array));
    }
}