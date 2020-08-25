package JetBrains;

import java.util.*;
import java.util.stream.Collectors;

public class HigherDivisibleValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 1; i <= 13; i++) {
            listOfNumbers.add(scanner.nextInt());
        }

        Integer result = listOfNumbers
                .stream()
                .filter(e -> e % 4 == 0)
                .collect(Collectors.summarizingInt(Integer::intValue)).getMax();

        System.out.println(result);


    }
}
