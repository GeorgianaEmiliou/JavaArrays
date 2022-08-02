package com.sparta.ge;
import java.util.Random;

public class IntArray {

    static Random rand = new Random();

    public static void main(String[] args) {
        /*int[] ages = getRandomArray(50);
        System.out.println("Length " + ages.length);
        System.out.println("Values are " + Arrays.toString(ages));
        System.out.println("Biggest in the ages list is " + returnTheBiggest(ages));
        System.out.println("Sorted values are " + Arrays.toString(bubbleSort(ages)));*/
    }

    static int[] getRandomArray(int requiredLength){
        int[] randomArray = new int[requiredLength];
        for(int i=0; i<requiredLength; i++) {
            randomArray[i] = rand.nextInt(100);
            System.out.println(randomArray[i]);
        }
        return randomArray;
    }


    static int returnTheBiggest(int[] arrayToSearch){
        int temp;
        for(int i =0 ; i< arrayToSearch.length - 1; i++){
            if (arrayToSearch[i] > arrayToSearch[i+1]) {
                temp = arrayToSearch[i];
                arrayToSearch[i] = arrayToSearch[i+1];
                arrayToSearch[i+1] = temp;
            }
        }

        return arrayToSearch[arrayToSearch.length - 1];
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
        //System.out.println("Sorted values are " + Arrays.toString(arrayToSort));
        return arrayToSort;
    }
}

