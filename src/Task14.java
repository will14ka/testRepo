import java.util.Arrays;

public class Task14 {
    static void method1(int array[]) {
        assert array.length != 0;
        array[0] = array[0] + 1;
    }

    public static void main(String... args) {
        int array0[] = {};
        method1(array0);
        System.out.println(Arrays.toString(array0));
        int array10[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        method1(array10);
        System.out.println(Arrays.toString(array10));
    }
}
