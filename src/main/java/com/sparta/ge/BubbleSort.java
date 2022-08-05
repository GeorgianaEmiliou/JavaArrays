package com.sparta.ge;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arrayToSort = {3, 7, 1, -8, 0};
        System.out.println("Given array: " + Arrays.toString(arrayToSort));
        System.out.println("Sorted array: " +Arrays.toString(bubbleSort(arrayToSort)));
    }

    static int[] oneIterationSort(int[] arrayToSearch){
        int temp;
        for(int i =0 ; i< arrayToSearch.length - 1; i++){
            if (arrayToSearch[i] > arrayToSearch[i+1]) {
                temp = arrayToSearch[i];
                arrayToSearch[i] = arrayToSearch[i+1];
                arrayToSearch[i+1] = temp;
            }
        }
        return arrayToSearch;
    }

    static int[] bubbleSort(int[] arrayToSort){
        for(int i=0 ; i<arrayToSort.length-1; i++) {
            arrayToSort = oneIterationSort(arrayToSort);
        }
        return arrayToSort;
    }
}
