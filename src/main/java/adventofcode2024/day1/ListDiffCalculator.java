package adventofcode2024.day1;

import java.util.ArrayList;

import static java.lang.Math.abs;

public class ListDiffCalculator {

    public static int calculateTotalListDifference(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        int total = 0;
        int difference;
        for (int i = 0; i < listOne.size(); i++) {
            difference = abs(listOne.get(i) - listTwo.get(i));
            total += difference;
        }
        return total;
    }
}
