package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergedArraysTest {
    @Test
    @DisplayName("Give two int arrays and merge them")
    public void mergedIntArrays(){
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {-2, 4, 8};
        int[] expectedAnswer = {-2, 1, 3, 4, 5, 7, 8};
        int[] answer = MergedArrays.returnMergedArrays(array1, array2);
        Assertions.assertArrayEquals(expectedAnswer, answer);
    }



}
