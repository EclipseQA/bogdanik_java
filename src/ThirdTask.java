import java.util.*;
import java.util.stream.Collectors;

public class ThirdTask {

    public static void main(String[] args) {

        int defaultArraySize = 10;
        Random random = new Random();
        List<Integer> resultListOfArray;
        int[] intArray = new int[defaultArraySize];
        int modulusNumber = 3;
        int modulusResult = 0;

        for (int i = 0; i < defaultArraySize; i++) {
            intArray[i] = random.nextInt();
        }

        resultListOfArray = Arrays.stream(intArray)
                .filter(currNum -> currNum % modulusNumber == modulusResult)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Элементы кратные 3 в массиве: " + resultListOfArray);
    }
}
