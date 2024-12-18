package adventofcode2024.day1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class ListDiffCalculatorTest {

    @Test
    public void shouldCalculateDifferenceBetweenElementsWithTheSameIndex() {
//        Given
        ArrayList<Integer> listOne = new ArrayList<>();
        listOne.add(123);
        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(124);
//        When
        int total = ListDiffCalculator.calculateTotalListDifference(listOne, listTwo);
//        Then
        assertThat(total).isEqualTo(1);
    }

}