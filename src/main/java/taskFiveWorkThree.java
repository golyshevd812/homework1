import java.util.Arrays;
import java.util.Scanner;

public class taskFiveWorkThree {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int initialValue = in.nextInt();
        int[] arrayFive = new int[len];
        for (int i = 0; i < arrayFive.length; i++) {
            arrayFive[i] = initialValue;
        }
        System.out.println(Arrays.toString(arrayFive));


    }
}
