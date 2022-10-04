import java.util.Arrays;

public class workThree {

    public static void main(String[] args) {

    //задание №1
        int[] arrayOne = {0, 0, 1, 0, 1, 1, 0, 0, 0, 1};
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(i + "-" + arrayOne[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arrayOne.length; i++)
            if (arrayOne[i] == 1) {
                arrayOne[i] = 0;
            } else arrayOne[i] = 1;
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(i + "-" + arrayOne[i] + " ");

        }

        System.out.println();

    //задание №2
        int[] arrayHundred = new int[100];
        int n = 1;
        for (int i = 0; i < arrayHundred.length; i++) {
            arrayHundred[i] = n++;
        }
        System.out.println(Arrays.toString(arrayHundred));


    //задание №3
        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < 6) {
                arrayThree[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrayThree));


    //задание №4
        int[][] arrayFour = new int[4][4];
        for (int i = 0; i < arrayFour.length; i++) {
            for (int j = 0, x = arrayFour[i].length - 1; j < arrayFour[i].length; j++, x--) {
                if (i == j || i == x) arrayFour[i][j] = 1;
                else arrayFour[i][j] = 0;
                System.out.print(arrayFour[i][j] + " ");
            }
            System.out.println();
        }
    //задание №6
        int [] loc = {25, 11, 250, 5};
        int max = loc[0];
        int min = loc[0];
        for(int i = 0; i != loc.length; i ++){
            if(loc[i] > max){
                max = loc[i];
            }
            if(loc[i] < min){
                min = loc[i];
            }
        }
        System.out.println(min + " " + max);



























    }


}
