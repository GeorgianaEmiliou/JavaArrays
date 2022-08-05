package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergedArraysTest {
    @Test
    @DisplayName("Give two int arrays of the length and merge them")
    public void mergedIntArraysWithTheSameLength(){
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {0, 4, 8, 9};
        int[] expectedAnswer = {0, 1, 3, 4, 5, 7, 8, 9};
        int[] answer = MergedArrays.returnMergedArrays(array1, array2);
        Assertions.assertArrayEquals(expectedAnswer, answer);
    }

    @Test
    @DisplayName("Give two int arrays of different length and merge them")
    public void mergedIntArraysWithDifferentLength(){
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 6};
        int[] expectedAnswer = {1, 2, 3, 5, 6, 7};
        int[] answer = MergedArrays.returnMergedArrays(array1, array2);
        Assertions.assertArrayEquals(expectedAnswer, answer);
    }

    @Test
    @DisplayName("Give two int arrays with negative values and merge them")
    public void mergedIntArraysWithNegativeValues(){
        int[] array1 = {-91, -28, 87, 110};
        int[] array2 = {-32, -1, 0, 54, 650, 911};
        int[] expectedAnswer = {-91, -32, -28, -1, 0, 54, 87, 110, 650, 911};
        int[] answer = MergedArrays.returnMergedArrays(array1, array2);
        Assertions.assertArrayEquals(expectedAnswer, answer);
    }

}
