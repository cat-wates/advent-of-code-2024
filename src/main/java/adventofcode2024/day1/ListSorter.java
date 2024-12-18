package adventofcode2024.day1;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorter {

    private ArrayList<Integer> listOne = new ArrayList<>();
    private ArrayList<Integer> listTwo = new ArrayList<>();

    public void splitList(ArrayList<Integer> fullList) {
        for (int i = 0; i < fullList.size(); i++) {
            if (i % 2 == 0) {
                listOne.add(fullList.get(i));
            }
            else {
                listTwo.add(fullList.get(i));
            }
        }
        orderLists(listOne, listTwo);
    }

    private void orderLists(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        Collections.sort(listOne);
        Collections.sort(listTwo);
    }

    public ArrayList<Integer> getListOne() {
        return listOne;
    }

    public ArrayList<Integer> getListTwo() {
        return listTwo;
    }
}
