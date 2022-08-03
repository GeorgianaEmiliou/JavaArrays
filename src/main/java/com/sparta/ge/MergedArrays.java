package com.sparta.ge;

import java.util.Arrays;

public class MergedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 6, 9};
        int[] array2 = {2, 4, 5, 7, 8};

        System.out.println(Arrays.toString(returnMergedArrays(array1, array2)));
    }


    public static int[] returnMergedArrays(int[] array1, int[] array2){
        int array1Length = array1.length;
        int array2Length = array2.length;
        int mergeArrayLength = array1Length + array2Length;
        int[] mergedArray = new int[mergeArrayLength];
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        while(counter1 < array1Length && counter2 < array2Length){
            if(array1[counter1] < array2[counter2]){
                mergedArray[counter3++] =array1[counter1++];
            }
            else{
                mergedArray[counter3++] = array2[counter2++];
            }
        }

        while(counter1 < array1Length){
            mergedArray[counter3++] = array1[counter1++];
        }

        while(counter2 < array2Length){
            mergedArray[counter3++] = array2[counter2++];
        }

        return mergedArray;
    }
}
