package JetBrains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CorrectOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOne = Integer.parseInt(scanner.next());
        int heightTwo = Integer.parseInt(scanner.next());
        int heightThree = Integer.parseInt(scanner.next());

        List<Integer> heightList = new ArrayList<>();
        heightList.add(heightOne);
        heightList.add(heightTwo);
        heightList.add(heightThree);

        List<Integer> heightListSorted = new ArrayList<>(heightList);
        Collections.sort(heightListSorted);

        List<Integer> heightListSortedReverse = new ArrayList<>(heightListSorted);
        Collections.reverse(heightListSortedReverse);

        if (heightListSorted.equals(heightList)){
            System.out.println(true);
        } else System.out.println(heightListSortedReverse.equals(heightList));
    }
}
