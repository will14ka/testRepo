import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int range = args.length;
        int array[] = new int[range];
        for (int i = 0; i < range; i++) {
            try {
                array[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException Error) {
                System.out.println("The arguments must be an integer.");
                System.exit(1);
            }
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
