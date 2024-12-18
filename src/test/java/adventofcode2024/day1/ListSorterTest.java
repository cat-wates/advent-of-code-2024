package adventofcode2024.day1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ListSorterTest {

    @Test
    public void shouldTakeTwoElementsAndAddThemToSeparateLists() {
//        Given
        ArrayList<Integer> fullList = new ArrayList<>();
        fullList.add(40094);
        fullList.add(37480);
        fullList.add(52117);
        fullList.add(14510);
//        When
        ListSorter ls = new ListSorter();
        ls.splitList(fullList);
//        Then
        assertThat(ls.getListOne()).containsExactly(40094, 52117);
        assertThat(ls.getListTwo()).contains(37480, 14510);
        assertThat(ls.getListOne().size()).isEqualTo(2);
        assertThat(ls.getListTwo().size()).isEqualTo(2);
    }
}
