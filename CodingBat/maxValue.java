package CodingBat;


import java.util.*;
import java.util.stream.Collectors;

public class maxValue {
    public static void main(String[] args) {
        System.out.println(getMax(1, 2, 3));
    }

    private static int getMax(int a, int b, int c) {
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(a);
        listOfNumbers.add(b);
        listOfNumbers.add(c);

        int maxValue = listOfNumbers
                .stream()
                .collect(Collectors
                .summarizingInt(Integer::intValue))
                .getMax();

        return maxValue;

    }
}
