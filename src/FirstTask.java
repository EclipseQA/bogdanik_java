import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        String welcomeText = "Введите число";
        String failText = "Вы ввели не число";
        String hello = "Привет";
        int enteredNumber = 0;
        int algorithmNumber = 7;

        System.out.println(welcomeText);
        try (Scanner scanner = new Scanner(System.in)) {
            enteredNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(failText);
        }
        if (enteredNumber > algorithmNumber) {
            System.out.println(hello);
        }
    }
}
