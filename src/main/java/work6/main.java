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


    System.out.println("����� ����� ���������: " + cat.getAnimalDistanceRun() +
            " �. \n������ ����� ���������: " + dog.getAnimalDistanceRun() + " �.");

    System.out.println("������� ��������� ��� ����:");
    double distance = scanner.nextDouble();

    System.out.println("����� �������� ��������� run(" + distance + "). ���������: " + cat.run(distance));
    System.out.println("������ �������� ��������� run(" + distance + "). ���������: " + dog.run(distance));
    System.out.println("\n****************\n");


    System.out.println("����� ����� ��������: " + cat.getAnimalDistanceSwim() +
            " �. \n������ ����� ��������: " + dog.getAnimalDistanceSwim() + " �.");

    System.out.println("������� ��������� ��� ��������:");
    distance = scanner.nextDouble();

    System.out.println("����� �������� ��������� swim(" + distance + "). ���������: " + cat.swim(distance));
    System.out.println("������ �������� ��������� swim(" + distance + "). ���������: " + dog.swim(distance));

}


}
