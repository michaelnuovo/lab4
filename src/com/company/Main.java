package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //DecimalFormat formatter = new DecimalFormat("#,###");
        //formatter.format(endTime - startTime)

        Long heapTime;
        Long mergeSortTime;

        Long QuickSortTime_Original;
        Long QuickSortTime_Gonnet;
        Long QuickSortTime_Hibbard;
        Long QuickSortTime_Sedgewick;
        Long QuickSortTime_Knuth;

        heapTime = heapSort();



    }

    private static void printTime(){

    }

    private static void mergeSort(){

        DecimalFormat formatter = new DecimalFormat("#,###");



    }

    /**
     * Heap sort initializes a Heap object with a random array.
     * The time it takes the heap object to initialize is equivalent
     * to the time it takes to sort the array.
     */
    private static Long heapSort(){

        // Build heap time is equivalent to sorting time.
        Long startTime = System.nanoTime();

        // Builds the heap.
        PriorityQueue<Comparable> priorityQueue = new PriorityQueue(returnRandomArray());

        // Returns build heap time.
        return System.nanoTime() - startTime;
    }

    /**
     * Returns an array of random numbers.
     */
    private static Comparable[] returnRandomArray(){

        Comparable[] comparableArray = new Comparable[100];

        return populateArray(comparableArray);
    }

    /**
     * Populates an array with random numbers.
     */
    private static Comparable[] populateArray(Comparable[] comparableArray){

        Random rnd = new Random();

        for(int i  = 0; i <= comparableArray.length - 1; i++)
            comparableArray[i] = rnd.nextInt(100);

        return comparableArray;
    }

    /**
     * prints a Comparable array for debugging purposes.
     */
    private static void printArray(Comparable[] comparableArray){

        for(Comparable x : comparableArray)
            System.out.println(x);
    }
}
