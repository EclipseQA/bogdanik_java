import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThirdTask {

    public static void main(String[] args) {

        int defaultArraySize = 10;
        Random random = new Random();
        List<Integer> resultListOfArray = new ArrayList<>();
        int[] intArray = new int[defaultArraySize];
        int modulusNumber = 3;
        int modulusResult = 0;

        for (int i = 0; i < defaultArraySize; i++) {
            intArray[i] = random.nextInt();
        }

        for (int currentValue : intArray) {
            if (currentValue % modulusNumber == modulusResult) {
                resultListOfArray.add(currentValue);
            }
        }
        System.out.println("Элементы кратные 3 в массиве: " + resultListOfArray);
    }
}
