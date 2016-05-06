package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // These reference will hold sort-times.
        Long heapSortTime;
        Long mergeSortTime;
        Long quickSortTime;
        Long shellSort2gapTime;
        Long shellSortGonnetTime;
        Long shellTimeSortHibbardTime;
        Long shellSortSedgewickTime;
        Long shellSortKnuthTime;

        Comparable[] ar1 = {5,4,3,2,1,4,2,5,1,7,5,4,2,7,9,3,2,6,5,2,7,4,45,12,67,3,2,4,3,2,1,4,2,5,1,7,5,4,2,7,9,3,2,6,5,2,7,4,45,12,67,3,2};
        ShellSort2Gap.shellsort(ar1);
        printArray(ar1);

        Comparable[] ar2 = {5,4,3,2,1,4,2,5,1,7,5,4,2,7,9,3,2,6,5,2,7,4,45,12,67,3,2,4,3,2,1,4,2,5,1,7,5,4,2,7,9,3,2,6,5,2,7,4,45,12,67,3,2};
        ShellSortGonnet.shellsort(ar2);
        printArray(ar2);

        Comparable[] ar3 = {5,4,3,2,1,4,2,5,1,7,5,4,2,7,9,3,2,6,5,2,7,4,45,12,67,3,2,4,3,2,1,4,2,5,1,7,5,4,2,7,9,3,2,6,5,2,7,4,45,12,67,3,2};
        ShellSortHibbard.shellsort(ar3);
        printArray(ar3);

        Comparable[] ar4 = {5,4,3,2,1,4,2,5,1,7,5,4,2,7,9,3,2,6,5,2,7,4,45,12,67,3,2,4,3,2,1,4,2,5,1,7,5,4,2,7,9,3,2,6,5,2,7,4,45,12,67,3,2};
        ShellSortSedgewick.shellsort(ar4);
        printArray(ar4);

        System.out.println("Sedgewick sequences are");
        //{1, 5, 19, 41, 109, 209, 505, 929, 2161, 3905}
        printArray(ShellSortSedgewick.getSedgewickSequence(1000000));
        printArray(ShellSortSedgewick.getSecondSequence(1000000));

        // Records sort-times for individual algorithms.
        //heapSortTime = heapSortTime();
        //mergeSortTime = mergeSortTime();
        //quickSort = quickSort2GapTime();

        // Prints sort-time statistics.
        //printSortTimeStatistics(heapSortTime, mergeSortTime, quickSort);
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
     * Private method prints a Comparable array for debugging purposes.
     * @param comparableArray
     */
    private static void printArray(Comparable[] comparableArray){

        for(Comparable x : comparableArray)
            System.out.print(x+", ");

        System.out.println();
    }

    /**
     * Public method prints a Comparable array for debugging purposes.
     * @param comparableArray
     */
    public static void printArray(int[] comparableArray){

        for(int x : comparableArray)
            System.out.print(x+", ");

        System.out.println();
    }
}
