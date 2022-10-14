package work6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main { public static void main(String[] args) throws InputMismatchException {

    Scanner scanner = new Scanner(System.in);

    double distanceRun = Math.random() * 500;
    double distanceSwim = Math.random() * 0;
    Cat cat = new Cat(distanceRun, distanceSwim);

    distanceRun = Math.random()*2000;
    distanceSwim = Math.random()*100;
    Animal dog = new Dog(distanceRun, distanceSwim);


    System.out.println("Кошка может пробежать: " + cat.getAnimalDistanceRun() +
            " м. \nСобака может пробежать: " + dog.getAnimalDistanceRun() + " м.");

    System.out.println("Введите дистанцию для бега:");
    double distance = scanner.nextDouble();

    System.out.println("Кошка пытается выполнить run(" + distance + "). Результат: " + cat.run(distance));
    System.out.println("Собака пытается выполнить run(" + distance + "). Результат: " + dog.run(distance));
    System.out.println("\n****************\n");


    System.out.println("Кошка может проплыть: " + cat.getAnimalDistanceSwim() +
            " м. \nСобака может проплыть: " + dog.getAnimalDistanceSwim() + " м.");

    System.out.println("Введите дистанцию для плавания:");
    distance = scanner.nextDouble();

    System.out.println("Кошка пытается выполнить swim(" + distance + "). Результат: " + cat.swim(distance));
    System.out.println("Собака пытается выполнить swim(" + distance + "). Результат: " + dog.swim(distance));

}


}
