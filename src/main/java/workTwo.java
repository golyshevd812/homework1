public class workTwo {
    public static void main(String[] args) {

        boolean reply = number(20,5);
        System.out.println(reply);

        isPositiveOeNegative(-6);

        boolean replyTwo = isPositiveOeNegativeTwo(-5);
        System.out.println(replyTwo);

        printWordNTimes("Hellow", 7);

        boolean replyThree = isLeapYearOrNot(800);
        System.out.println(replyThree);

    }


    private static boolean number(int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        if (sum < 10 || sum > 20) {
            return false;
        } else {
            return true;
        }
    }

    private static void isPositiveOeNegative(int number) {
        if (number > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean isPositiveOeNegativeTwo(int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void printWordNTimes(String name, int times) {
        for(int i = 0; i < times; i++){
            System.out.println(name);
        }
    }

    private static boolean isLeapYearOrNot(int years) {
//        if (years % 4 == 0 || years % 100 == 0 || years % 400 != 0) {
        if (years % 4 != 0 || years % 400 !=0 && years % 100 ==0) {
            return false;
        } else {
            return true;
        }
    }
}

