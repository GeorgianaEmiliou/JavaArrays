package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergedArraysTest {
    @Test
    @DisplayName("Give two int arrays and merge them")
    public void mergedIntArrays(){
        int[] array1 = {2, 3, 4, 5};
        int[] array2 = {6, 7, 8};
        int[] expectedAnswer = {2, 3, 4, 5, 6, 7, 8};
        int[] answer = MergedArrays.returnMergedArrays(array1, array2);
        Assertions.assertArrayEquals(expectedAnswer, answer);
    }



}
