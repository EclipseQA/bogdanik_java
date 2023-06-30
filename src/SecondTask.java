import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {

        String enteredName;
        String targetName = "Вячеслав";
        String welcomeText = "Введите имя";
        String helloName = "Привет, " + targetName;
        String failText = "Нет такого имени";

        System.out.println(welcomeText);
        try (Scanner scanner = new Scanner(System.in)) {
            enteredName = scanner.nextLine();
        }
        if (enteredName.equals(targetName)) {
            System.out.println(helloName);
        } else {
            System.out.println(failText);
        }
    }
}
