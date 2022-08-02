package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringArrayTest {

    @Test
    @DisplayName("Given an array and return a sorted array")
    public void returnASortedArray(){
        String[] givenArray = {"orange", "pink", "black"};
        String[] expectedArray = {"black", "orange", "pink"};
        String[] answer = StringArray.bubbleSort(givenArray);
        Assertions.assertArrayEquals(expectedArray, answer);
    }

    @Test
    @DisplayName("Given an array and return the last word")
    public void returnLastWord(){
        String[] givenArray = {"red", "white", "green"};
        String expectedAnswer = "white";
        String answer = StringArray.returnTheLastWord(givenArray);
        Assertions.assertEquals(expectedAnswer, answer);
    }
}
