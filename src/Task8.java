public class Task8 {

    public static void main(String... args) {

        // while
        int n = 10;
        while (n <= 20) {
            System.out.println(n);
            n++;
        }
        System.out.println("----------------------------");

        // do while
        n = 10;
        do {
            System.out.println(n);
            n++;
        } while (n <= 20);
        System.out.println("----------------------------");

        // for
        for (n = 10; n <= 20; n++) {
            System.out.println(n);
        }
        System.out.println("----------------------------");

        //foreach
        int[] a = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int x : a){
            System.out.println(x);
        }
    }


}
