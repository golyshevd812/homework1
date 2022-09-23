import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Aplee");
    }

    private static void chekSumSign() {
        int a = ThreadLocalRandom.current().nextInt(-5, 6);
        int b = ThreadLocalRandom.current().nextInt(-5, 6);
//        System.out.println(a + b);
        if (a + b >= 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }

    private static void printColor() {
        int value = ThreadLocalRandom.current().nextInt(-50, 150);
//        System.out.println(value);
        if (value <= 0) {
            System.out.println("�������");
        }
        if (value > 0 && value <= 100 ) {
            System.out.println("������");
        }
        if (value > 100) {
            System.out.println("�������");
        }
    }

    private static void compareNumbers() {
        int a = ThreadLocalRandom.current().nextInt(-5, 5);
        int b = ThreadLocalRandom.current().nextInt(-5, 5);
//        System.out.println("������ ����� a= " + a + ", ������ ����� ����� b=" + b);
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }
}
