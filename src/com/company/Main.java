package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Declares references to sort-times.
        Long heapSortTime;
        Long mergeSortTime;
        Long quickSort2GapTime;
        Long quickSortGonnetTime;
        Long quickSortHibbardTime;
        Long quickSortSedgewickTime;
        Long quickSortKnuthTime;

        // Records sort-times for individual algorithms.
        heapSortTime = heapSortTime();
        mergeSortTime = mergeSortTime();
        quickSort2GapTime = quickSort2GapTime();

        // Prints sort-time statistics.
        printSortTimeStatistics(heapSortTime, mergeSortTime, quickSort2GapTime);
    }

    private static void printSortTimeStatistics(Long heapSortTime,
                                                Long mergeSortTime,
                                                Long quickSort2GapTime){

        DecimalFormat formatter = new DecimalFormat("#,###");


        System.out.println("heapSortTime is " + formatter.format(heapSortTime));
        System.out.println("mergeSortTime is " + formatter.format(mergeSortTime));
        System.out.println("quickSort2GapTime is " + formatter.format(quickSort2GapTime));

    }

    /**
     * Quick sort using 2-gap Weiss version. Returns sorting time.
     * @return
     */
    private static Long quickSort2GapTime(){

        // Log start time.
        Long startTime = System.nanoTime();

        // Sort a random array.
        QuickSort2Gap.quicksort(returnRandomArray());

        // Returns merge-sort sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Merge sort using Weiss version. Returns sorting time.
     * @return
     */
    private static Long mergeSortTime(){

        // Log start time.
        Long startTime = System.nanoTime();

        // Sort a random array.
        MergeSort.mergeSort(returnRandomArray());

        // Returns merge-sort sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Heap sort using Weiss version. Returns sorting time.
     * Build heap time is equivalent to sorting time.
     * @return
     */
    private static Long heapSortTime(){

        // Log start time.
        Long startTime = System.nanoTime();

        // Builds the heap.
        PriorityQueue<Comparable> priorityQueue = new PriorityQueue(returnRandomArray());

        // Returns build-heap sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Returns an array of random numbers.
     * @return
     */
    private static Comparable[] returnRandomArray(){

        // Initialize a Comparable array.
        Comparable[] comparableArray = new Comparable[100];

        // Return array populated with random numbers.
        return populateArray(comparableArray);
    }

    /**
     * Populates an array with random numbers.
     * @param comparableArray
     * @return
     */
    private static Comparable[] populateArray(Comparable[] comparableArray){

        // Initialize Random object.
        Random rnd = new Random();

        // Populate array with Random.next()
        for(int i  = 0; i <= comparableArray.length - 1; i++)
            comparableArray[i] = rnd.nextInt(100);

        // Returns the array
        return comparableArray;
    }

    /**
     * Prints a Comparable array for debugging purposes.
     * @param comparableArray
     */
    private static void printArray(Comparable[] comparableArray){

        for(Comparable x : comparableArray)
            System.out.println(x);
    }
}
