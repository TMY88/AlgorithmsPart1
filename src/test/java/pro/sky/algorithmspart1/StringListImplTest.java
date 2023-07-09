package pro.sky.algorithmspart1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringListImplTest {
    private final StringListImpl out = new StringListImpl(5);

    private final String[] arr = {"one", "two", "three", "four", "five"};

    @Test
    void ShouldAddElement() {

        String expectedList = arr[3];
        String actualList = out.add("four");

        Assertions.assertEquals(expectedList,actualList);
    }

    @Test
    void ShouldAddElementAndIndexSize() {

        String expectedList = arr[2];
        String actualList = out.add(0,"three");

        Assertions.assertEquals(expectedList,actualList);

        int expectedSize = 1;
        int actualSize = out.size();

        Assertions.assertEquals(expectedSize, actualSize);

    }

    @Test
    void ShouldSetItem() {

        String expectedSet = arr[1];
        String actualSet = out.set(0, arr[1]);

        Assertions.assertEquals(expectedSet, actualSet);
    }

    @Test
    void ShouldRemoveItem() {
        out.add(arr[0]);
        out.add(arr[1]);

        String expectedItem = arr[0];
        String actualItem = out.remove(arr[0]);

        Assertions.assertEquals(expectedItem, actualItem);
    }

    @Test
    void ShouldRemoveItemByIndex() {
        out.add(arr[0]);
        out.add(arr[1]);

        String expectedItem = arr[0];
        String actualItem = out.remove(0);

        Assertions.assertEquals(expectedItem, actualItem);
    }

    @Test
    void ShouldFindIfContainsItem() {
        out.add(arr[4]);

        boolean expected = true;
        boolean actual = out.contains("five");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldReturnIndexOfItem() {
        out.add(arr[0]);
        int expectedIfContains = 0;
        int expectedIfDoesntContain = -1;

        int actualContains = out.indexOf(arr[0]);
        int actualDoesntContain = out.indexOf(arr[1]);

        Assertions.assertEquals(expectedIfContains, actualContains);
        Assertions.assertEquals(expectedIfDoesntContain, actualDoesntContain);
    }

    @Test
    void ShouldReturnLastIndexOfItem() {
        out.add(arr[0]);
        out.add(arr[2]);
        out.add(arr[3]);
        out.add(arr[4]);

        int expectedIfContains = 3;
        int expectedIfDoesntContain = -1;

        int actualContains = out.lastIndexOf(arr[4]);
        int actualDoesntContain = out.lastIndexOf(arr[1]);

        Assertions.assertEquals(expectedIfContains, actualContains);
        Assertions.assertEquals(expectedIfDoesntContain, actualDoesntContain);
    }

    @Test
    void ShouldGetItem() {
        out.add(arr[0]);
        out.add(arr[3]);

        String expected = arr[3];
        String actual = out.get(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldTestEqualsOfItems() {
        out.add(arr[0]);
        out.add(arr[3]);

        StringListImpl test = new StringListImpl(5);
        test.add(arr[0]);
        test.add(arr[3]);

        boolean expected = true;
        boolean actual = out.equals(test);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldReturnCorrectSize() {
        out.add(arr[0]);
        out.add(arr[1]);
        out.add(arr[2]);

        int expected = 3;
        int actual = out.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldCheckIsEmpty() {
        boolean expectedIfEmpty = true;
        boolean actualIfEmpty = out.isEmpty();

        Assertions.assertEquals(expectedIfEmpty, actualIfEmpty);

        out.add(arr[1]);

        boolean expectedIfNotEmpty = false;
        boolean actualIfNotEmpty = out.isEmpty();

        Assertions.assertEquals(expectedIfNotEmpty, actualIfNotEmpty);
    }

    @Test
    void ShouldClearItems() {
        out.add(arr[0]);
        out.add(arr[1]);

        out.clear();
        boolean expectedIfEmpty = true;
        boolean actualIfEmpty = out.isEmpty();
        Assertions.assertEquals(expectedIfEmpty, actualIfEmpty);
    }

    @Test
    void ShouldPresentToArray() {
        out.add(arr[0]);
        out.add(arr[1]);
        out.add(arr[2]);
        String[] expected = new String[]{arr[0], arr[1], arr[2]};
        String[] actual = out.toArray();
        Assertions.assertArrayEquals(expected, actual);
    }
}
