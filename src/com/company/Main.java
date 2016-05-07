package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {

    /**
     * The main method calls getTime() methods
     * for individual algorithms respectively, and
     * feeds this information into the
     * printTimeStatistics() method.
     * @param args
     */
    public static void main(String[] args) {

        // MetaStats object holds stats objects for individual algorithms.
        // It records information about each algorithm and will
        // ultimately be passed to printSortTimeStatistics().
        MetaStats metaStats = new MetaStats();

        // Initializes stats fields for MetaStats objects
        getHeapSortTime(metaStats);
        getMergeSortTime(metaStats);
        getQuickSortTime(metaStats);
        getShellSort2gapTime(metaStats);
        getShellSortGonnetTime(metaStats);
        getShellTimeSortHibbardTime(metaStats);
        getShellSortSedgewickTime(metaStats);
        getShellSortKnuthTime(metaStats);

        //Prints sort-time statistics.
        printSortTimeStatistics(metaStats);
    }

    private static void printSortTimeStatistics(MetaStats metaStats){

        DecimalFormat formatter = new DecimalFormat("#,###");


        System.out.println("heapSortTime is " + formatter.format(heapSortTime));
        System.out.println("mergeSortTime is " + formatter.format(mergeSortTime));
        System.out.println("quickSort2GapTime is " + formatter.format(quickSort2GapTime));

    }

    /**
     * Shell sort using Weiss version with 2 Gaps. Returns sorting time.
     * @return
     */
    private static Long getShellSort2gapTime(MetaStats metaStats){

        // Log start time.
        Long startTime = System.nanoTime();

        // Sort a random array.
        ShellSort2Gap.shellsort(returnRandomArray());

        // Returns merge-sort sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Shell sort using Weiss version with Gonnet Gaps. Returns sorting time.
     * @return
     */
    private static Long getShellSortGonnetTime(MetaStats metaStats){

        // Log start time.
        Long startTime = System.nanoTime();

        // Sort a random array.
        ShellSortGonnet.shellsort(returnRandomArray());

        // Returns merge-sort sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Shell sort using Weiss version with Hibbard sequence. Returns sorting time.
     * @return
     */
    private static Long getShellTimeSortHibbardTime(MetaStats metaStats){

        // Log start time.
        Long startTime = System.nanoTime();

        // Sort a random array.
        ShellSortHibbard.shellsort(returnRandomArray());

        // Returns merge-sort sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Shell sort using Weiss version with Sedgewick sequence. Returns sorting time.
     * @return
     */
    private static Long getShellSortSedgewickTime(MetaStats metaStats){

        // Log start time.
        Long startTime = System.nanoTime();

        // Sort a random array.
        ShellSortSedgewick.shellsort(returnRandomArray());

        // Returns merge-sort sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Shell sort using Weiss version with Knuth sequence. Returns sorting time.
     * @return
     */
    private static Long getShellSortKnuthTime(MetaStats metaStats){

        // Log start time.
        Long startTime = System.nanoTime();

        // Sort a random array.
        ShellSortKnuth.shellsort(returnRandomArray());

        // Returns merge-sort sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Quick sort using Weiss version. Returns sorting time.
     * @return
     */
    private static Long getQuickSortTime(MetaStats metaStats){

        // Log start time.
        Long startTime = System.nanoTime();

        // Sort a random array.
        QuickSort.quicksort(returnRandomArray());

        // Returns merge-sort sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Merge sort using Weiss version. Returns sorting time.
     * @return
     */
    private static Long getMergeSortTime(MetaStats metaStats){

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
    private static Long getHeapSortTime(MetaStats metaStats){

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
