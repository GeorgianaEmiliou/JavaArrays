package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntArrayTest {
    @Test
    @DisplayName("Given an array and return the sorted array")
    public void givenAnArrayAndSortIt(){
        int[] givenArray = {3, 7, 1, 9, 2};
        int[] expectedArray = {1, 2, 3, 7, 9};
        int[] answer = IntArray.bubbleSort(givenArray);
        Assertions.assertArrayEquals(expectedArray, answer);
    }

    @Test
    @DisplayName("Given an array and return the biggest value")
    public void givenAnArrayAndReturnTheBiggestValue(){
        int[] givenArray = {3, 7, 10, 5, 12};
        int expectedAnswer = 12;
        int answer = IntArray.returnTheBiggest(givenArray);
        Assertions.assertEquals(expectedAnswer, answer);
    }
}
