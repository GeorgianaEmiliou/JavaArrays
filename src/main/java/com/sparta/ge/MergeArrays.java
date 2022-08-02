package com.sparta.ge;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        System.out.println(Arrays.toString(returnMergedArrays(array1, array2)));
    }


    public static int[] returnMergedArrays(int[] array1, int[] array2){
        int array1Length = array1.length;
        int array2Length = array2.length;
        int mergeArrayLength = array1Length + array2Length;
        int[] mergedArray = new int[mergeArrayLength];
        for(int i=0; i<array1Length; i++){
            mergedArray[i] = mergedArray[i] + array1[i];
        }
        for(int i=0; i<array2Length; i++){
            mergedArray[i+array1Length] = array2[i];
        }
        return mergedArray;
    }
}
