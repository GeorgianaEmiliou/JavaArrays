package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    @DisplayName("Give an array with positive values and sort it")
    public void sortAnArrayOfPositiveValues(){
        int[] givenArray = {7, 1, 5, 9, 2};
        int[] expectedArray = {1, 2, 5, 7, 9};
        int[] answer = BubbleSort.bubbleSort(givenArray);
        Assertions.assertArrayEquals(expectedArray, answer);
    }

    @Test
    @DisplayName("Give an array with negative values and sort it")
    public void sortAnArrayOfNegativeValues(){
        int[] givenArray = {8, 6, 9, -2, 0, -4};
        int[] expectedArray = {-4, -2, 0, 6, 8, 9};
        int[] answer = BubbleSort.bubbleSort(givenArray);
        Assertions.assertArrayEquals(expectedArray, answer);
    }

    @Test
    @DisplayName("Give an array with duplicate values and sort it")
    public void sortAnArrayOfDuplicateValues(){
        int[] givenArray = {7, 7, -5, 9, 2, -5};
        int[] expectedArray = {-5, -5, 2, 7, 7, 9};
        int[] answer = BubbleSort.bubbleSort(givenArray);
        Assertions.assertArrayEquals(expectedArray, answer);
    }
}
