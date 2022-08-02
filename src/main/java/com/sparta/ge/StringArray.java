package com.sparta.ge;

import java.util.Arrays;
import java.util.Random;

public class StringArray {

    static String name;
    static String newName;
    static Random rand = new Random();

    public static void main(String[] args) {
        /*name = "c";
        newName = "b";
        //If the first value is less than the second value --> returns a negative value
        //If the first value is equals with the second value --> returns 0
        //If the first values is greater than the second values --> returns a positive value
        System.out.println(name.compareTo(newName));
        //if (stringList[1].compareTo(stringList[2]) == 1)
        System.out.println(name.equals(newName));
        System.out.println(name.hashCode());
        System.out.println(newName.hashCode());*/


        String[] colors = {"orange", "pink", "black", "yellow", "white", "red", "green"};
        /*System.out.println("Length " + colors.length);
        System.out.println("Values are " + Arrays.toString(colors));
        System.out.println("Last word is " + returnTheLastWord(colors));
        System.out.println("Sorted values are " + Arrays.toString(bubbleSort(colors)));*/

        String[] words = {"is","had","has","could","did","take","say","want","must","move","found","keep","might","got","took","eat","being","was","were","will","look","been","get","know","help","show","ask","try","study","start","close","run","carry","watch","leave","are","can","would","write","call","come","live","tell","set","went","change","learn","thought","seem","walk","hear","let","be","said","make","go","am","made","give","follow","put","read","play","should","saw","open","began","stop","cut","have","use","like","see","find","may","think","came","does","need","spell","add","turn","begin","grow","miss","talk"};
        System.out.println("Length " + words.length);
        System.out.println("Values are " + Arrays.toString(words));
        System.out.println("Last word is " + returnTheLastWord(words));
        System.out.println("Sorted values are " + Arrays.toString(bubbleSort(words)));
    }

   /*static String[] getRandomArray(int requiredLength){
        String[] randomArray = new String[requiredLength];
        for(int i=0; i<requiredLength; i++) {
            randomArray[i] = rand.toString();
            System.out.println(randomArray[i]);
        }
        return randomArray;
    }*/



    static String returnTheLastWord(String[] arrayToSearch){
        String temp;
        for(int i =0 ; i< arrayToSearch.length - 1; i++){
            if (arrayToSearch[i].compareTo(arrayToSearch[i + 1]) > 0) {
                temp = arrayToSearch[i];
                arrayToSearch[i] = arrayToSearch[i+1];
                arrayToSearch[i+1] = temp;
            }
        }

        return arrayToSearch[arrayToSearch.length - 1];
    }

    static String[] oneIterationSort(String[] arrayToSort){
        String temp;
        for(int i =0 ; i< arrayToSort.length - 1; i++){
            if (arrayToSort[i].compareTo(arrayToSort[i + 1]) > 0) {
                temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i+1];
                arrayToSort[i+1] = temp;
            }
        }
        return arrayToSort;
    }

    static String[] bubbleSort(String[] arrayToSort){
        for(int i=0 ; i<arrayToSort.length-1; i++) {
            arrayToSort = oneIterationSort(arrayToSort);
        }
        //System.out.println("Sorted values are " + Arrays.toString(arrayToSort));
        return arrayToSort;
    }
}
