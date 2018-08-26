import java.util.SortedMap;

public class Task11 {
    public static void main(String... args){
        int array[]={100,20,26,20,1000};
        int sum = 0;
        for (int i=1; i<=array.length-2; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}

