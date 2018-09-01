import java.util.Arrays;


public class Task5 {
    public static void main(String[] args) {

        int[] massive = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int x = massive[massive.length - 1];
        massive[massive.length - 1] = massive[0];
        massive[0] = x;
        System.out.println(Arrays.toString(massive));
    }
}
