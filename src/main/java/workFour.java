import java.util.Random;
import java.util.Scanner;

public class workFour {
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '_';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private static final char[][] MAP = new char[SIZE][SIZE];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    public static final String SPACE_MAP_SYMBOL = " ";
    public static final String HEADER_FIRST_SYMBOL = "$";

    private static int turenCaunt = 0;

    public static void main(String[] args) {
        turnGame();

    }

    private static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        extracted();
    }

    private static void extracted() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP_SYMBOL);
    }


    private static void playGame() {
        while (true) {
            humanTurn();  //ход игрока
            printMap(); //вывод текущего поля
            if (checkEnd(DOT_HUMAN)) { //прверка на конец игры
                break;
            }

            aiTurn(); //ход компбютера
            printMap(); //вывод текущего поля
            if (checkEnd(DOT_AI)) { //прверка на конец игры
                break;
            }
        }
    }

    private static void humanTurn() {
        System.out.println("\nХод ЧЕЛОВЕКА");
        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Ввеедите координату строки: ");
            rowNumber = in.nextInt() - 1;
            System.out.print("Ввеедите координату столбца: ");
            columnNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("Ошибка! Ячейка с координатой %s:%s уже используются%n", rowNumber + 1, columnNumber + 1);
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turenCaunt++;

    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void aiTurn() {
        System.out.println("\nХод Компьютера");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turenCaunt++;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("Ура вы победили");
            } else {
                System.out.println("Вы проиграли");
            }

            return true;
        } //победа

        if (checkDrow()) { //ничья
            System.out.println("Ничья");
            return true;
        }


        return false;
    }

    private static boolean checkWin(char symbol) {
        if(MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) return
                true;
        if(MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) return
                true;
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) return
                true;
        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) return
                true;
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) return
                true;
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) return
        true;
        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return
                true;
        if (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) return
                true;

        return false;
    }

    private static boolean checkDrow() {

        return turenCaunt >= SIZE * SIZE;

    }
}
