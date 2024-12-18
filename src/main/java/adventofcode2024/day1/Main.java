package adventofcode2024.day1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filePath = "day1.txt";
        ArrayList<Integer> fullList = ReadFile.readFile(filePath);
        ListSorter listSorter = new ListSorter();
        listSorter.splitList(fullList);
        ArrayList<Integer> listOne = listSorter.getListOne();
        ArrayList<Integer> listTwo = listSorter.getListTwo();
        System.out.println(ListDiffCalculator.calculateTotalListDifference(listOne, listTwo));
    }
}

/*
Plan
1. Read data into two lists
2. Sort lists
3. Create method to compare the entries and add to a running total
 */