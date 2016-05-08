package com.company;

import java.util.Random;

public class Main {

    /**
     * The main method initializes a container
     * that contains objects related to each
     * algorithm's performance statistics.
     * This object is passed to PrintData class.
     */
    public static void main(String[] args) {

        //StatsObjectContainer contains a statsObject reference for each algorithm object.
        StatsObjectContainer statsObjectContainer = new StatsObjectContainer();

        //Populate statsObjects in StatsObjectContainer
        generateStats(statsObjectContainer);

        //Prints sort-time statistics.
        PrintData.printSortTimeStatistics(statsObjectContainer);
    }

    /**
     * This method will use a new sample for each run.
     * Each algorithm will use the same sample for the same run.
     * @param statsObjectContainer
     */
    public static void generateStats(StatsObjectContainer statsObjectContainer){

        int sampleSize = 1000;
        Comparable[] sample;

        //Record minimum sample size
        if(statsObjectContainer.minimumSampleSize == null)
            statsObjectContainer.minimumSampleSize = sampleSize;

        //Sample 1

            //Run 1
            sample = returnRandomArray(sampleSize);
            statsObjectContainer.mergeSortStats.S1R1 = getRunTime(new MergeSort(), returnDeepCopy(sample));
            statsObjectContainer.heapSortStats.S1R1 = getRunTime(new HeapSort(), returnDeepCopy(sample));
            statsObjectContainer.quickSortStats.S1R1 = getRunTime(new QuickSort(), returnDeepCopy(sample));
            statsObjectContainer.shellSort2GapStats.S1R1 = getRunTime(new ShellSort2Gap(), returnDeepCopy(sample));
            statsObjectContainer.shellSortGonnetStats.S1R1 = getRunTime(new ShellSortGonnet(), returnDeepCopy(sample));
            statsObjectContainer.shellSortHibbardStats.S1R1 = getRunTime(new ShellSortHibbard(), returnDeepCopy(sample));
            statsObjectContainer.shellSortKnuthStats.S1R1 = getRunTime(new ShellSortKnuth(), returnDeepCopy(sample));
            statsObjectContainer.shellSortSedgewickStats.S1R1 = getRunTime(new ShellSortSedgewick(), returnDeepCopy(sample));

            //Run 2
            sample = returnRandomArray(sampleSize);
            statsObjectContainer.mergeSortStats.S1R2 = getRunTime(new MergeSort(), returnDeepCopy(sample));
            statsObjectContainer.heapSortStats.S1R2 = getRunTime(new HeapSort(), returnDeepCopy(sample));
            statsObjectContainer.quickSortStats.S1R2 = getRunTime(new QuickSort(), returnDeepCopy(sample));
            statsObjectContainer.shellSort2GapStats.S1R2 = getRunTime(new ShellSort2Gap(), returnDeepCopy(sample));
            statsObjectContainer.shellSortGonnetStats.S1R2 = getRunTime(new ShellSortGonnet(), returnDeepCopy(sample));
            statsObjectContainer.shellSortHibbardStats.S1R2 = getRunTime(new ShellSortHibbard(), returnDeepCopy(sample));
            statsObjectContainer.shellSortKnuthStats.S1R2 = getRunTime(new ShellSortKnuth(), returnDeepCopy(sample));
            statsObjectContainer.shellSortSedgewickStats.S1R2 = getRunTime(new ShellSortSedgewick(), returnDeepCopy(sample));


            //Run 3
            sample = returnRandomArray(sampleSize);
            statsObjectContainer.mergeSortStats.S1R3 = getRunTime(new MergeSort(), returnDeepCopy(sample));
            statsObjectContainer.heapSortStats.S1R3 = getRunTime(new HeapSort(), returnDeepCopy(sample));
            statsObjectContainer.quickSortStats.S1R3 = getRunTime(new QuickSort(), returnDeepCopy(sample));
            statsObjectContainer.shellSort2GapStats.S1R3 = getRunTime(new ShellSort2Gap(), returnDeepCopy(sample));
            statsObjectContainer.shellSortGonnetStats.S1R3 = getRunTime(new ShellSortGonnet(), returnDeepCopy(sample));
            statsObjectContainer.shellSortHibbardStats.S1R3 = getRunTime(new ShellSortHibbard(), returnDeepCopy(sample));
            statsObjectContainer.shellSortKnuthStats.S1R3 = getRunTime(new ShellSortKnuth(), returnDeepCopy(sample));
            statsObjectContainer.shellSortSedgewickStats.S1R3 = getRunTime(new ShellSortSedgewick(), returnDeepCopy(sample));

            sampleSize *= 2;

        //Sample 2

            //Run 1
            sample = returnRandomArray(sampleSize);
            statsObjectContainer.mergeSortStats.S2R1 = getRunTime(new MergeSort(), returnDeepCopy(sample));
            statsObjectContainer.heapSortStats.S2R1 = getRunTime(new HeapSort(), returnDeepCopy(sample));
            statsObjectContainer.quickSortStats.S2R1 = getRunTime(new QuickSort(), returnDeepCopy(sample));
            statsObjectContainer.shellSort2GapStats.S2R1 = getRunTime(new ShellSort2Gap(), returnDeepCopy(sample));
            statsObjectContainer.shellSortGonnetStats.S2R1 = getRunTime(new ShellSortGonnet(), returnDeepCopy(sample));
            statsObjectContainer.shellSortHibbardStats.S2R1 = getRunTime(new ShellSortHibbard(), returnDeepCopy(sample));
            statsObjectContainer.shellSortKnuthStats.S2R1 = getRunTime(new ShellSortKnuth(), returnDeepCopy(sample));
            statsObjectContainer.shellSortSedgewickStats.S2R1 = getRunTime(new ShellSortSedgewick(), returnDeepCopy(sample));


            //Run 2
            sample = returnRandomArray(sampleSize);
            statsObjectContainer.mergeSortStats.S2R2 = getRunTime(new MergeSort(), returnDeepCopy(sample));
            statsObjectContainer.heapSortStats.S2R2 = getRunTime(new HeapSort(), returnDeepCopy(sample));
            statsObjectContainer.quickSortStats.S2R2 = getRunTime(new QuickSort(), returnDeepCopy(sample));
            statsObjectContainer.shellSort2GapStats.S2R2 = getRunTime(new ShellSort2Gap(), returnDeepCopy(sample));
            statsObjectContainer.shellSortGonnetStats.S2R2 = getRunTime(new ShellSortGonnet(), returnDeepCopy(sample));
            statsObjectContainer.shellSortHibbardStats.S2R2 = getRunTime(new ShellSortHibbard(), returnDeepCopy(sample));
            statsObjectContainer.shellSortKnuthStats.S2R2 = getRunTime(new ShellSortKnuth(), returnDeepCopy(sample));
            statsObjectContainer.shellSortSedgewickStats.S2R2 = getRunTime(new ShellSortSedgewick(), returnDeepCopy(sample));


            //Run 3
            sample = returnRandomArray(sampleSize);
            statsObjectContainer.mergeSortStats.S2R3 = getRunTime(new MergeSort(), returnDeepCopy(sample));
            statsObjectContainer.heapSortStats.S2R3 = getRunTime(new HeapSort(), returnDeepCopy(sample));
            statsObjectContainer.quickSortStats.S2R3 = getRunTime(new QuickSort(), returnDeepCopy(sample));
            statsObjectContainer.shellSort2GapStats.S2R3 = getRunTime(new ShellSort2Gap(), returnDeepCopy(sample));
            statsObjectContainer.shellSortGonnetStats.S2R3 = getRunTime(new ShellSortGonnet(), returnDeepCopy(sample));
            statsObjectContainer.shellSortHibbardStats.S2R3 = getRunTime(new ShellSortHibbard(), returnDeepCopy(sample));
            statsObjectContainer.shellSortKnuthStats.S2R3 = getRunTime(new ShellSortKnuth(), returnDeepCopy(sample));
            statsObjectContainer.shellSortSedgewickStats.S2R3 = getRunTime(new ShellSortSedgewick(), returnDeepCopy(sample));

            sampleSize *= 2;

        //Sample 3

            //Run 1
            sample = returnRandomArray(sampleSize);
            statsObjectContainer.mergeSortStats.S3R1 = getRunTime(new MergeSort(), returnDeepCopy(sample));
            statsObjectContainer.heapSortStats.S3R1 = getRunTime(new HeapSort(), returnDeepCopy(sample));
            statsObjectContainer.quickSortStats.S3R1 = getRunTime(new QuickSort(), returnDeepCopy(sample));
            statsObjectContainer.shellSort2GapStats.S3R1 = getRunTime(new ShellSort2Gap(), returnDeepCopy(sample));
            statsObjectContainer.shellSortGonnetStats.S3R1 = getRunTime(new ShellSortGonnet(), returnDeepCopy(sample));
            statsObjectContainer.shellSortHibbardStats.S3R1 = getRunTime(new ShellSortHibbard(), returnDeepCopy(sample));
            statsObjectContainer.shellSortKnuthStats.S3R1 = getRunTime(new ShellSortKnuth(), returnDeepCopy(sample));
            statsObjectContainer.shellSortSedgewickStats.S3R1 = getRunTime(new ShellSortSedgewick(), returnDeepCopy(sample));


            //Run 2
            sample = returnRandomArray(sampleSize);
            statsObjectContainer.mergeSortStats.S3R2 = getRunTime(new MergeSort(), returnDeepCopy(sample));
            statsObjectContainer.heapSortStats.S3R2 = getRunTime(new HeapSort(), returnDeepCopy(sample));
            statsObjectContainer.quickSortStats.S3R2 = getRunTime(new QuickSort(), returnDeepCopy(sample));
            statsObjectContainer.shellSort2GapStats.S3R2 = getRunTime(new ShellSort2Gap(), returnDeepCopy(sample));
            statsObjectContainer.shellSortGonnetStats.S3R2 = getRunTime(new ShellSortGonnet(), returnDeepCopy(sample));
            statsObjectContainer.shellSortHibbardStats.S3R2 = getRunTime(new ShellSortHibbard(), returnDeepCopy(sample));
            statsObjectContainer.shellSortKnuthStats.S3R2 = getRunTime(new ShellSortKnuth(), returnDeepCopy(sample));
            statsObjectContainer.shellSortSedgewickStats.S3R2 = getRunTime(new ShellSortSedgewick(), returnDeepCopy(sample));


            //Run 3
            sample = returnRandomArray(sampleSize);
            statsObjectContainer.mergeSortStats.S3R3 = getRunTime(new MergeSort(), returnDeepCopy(sample));
            statsObjectContainer.heapSortStats.S3R3 = getRunTime(new HeapSort(), returnDeepCopy(sample));
            statsObjectContainer.quickSortStats.S3R3 = getRunTime(new QuickSort(), returnDeepCopy(sample));
            statsObjectContainer.shellSort2GapStats.S3R3 = getRunTime(new ShellSort2Gap(), returnDeepCopy(sample));
            statsObjectContainer.shellSortGonnetStats.S3R3 = getRunTime(new ShellSortGonnet(), returnDeepCopy(sample));
            statsObjectContainer.shellSortHibbardStats.S3R3 = getRunTime(new ShellSortHibbard(), returnDeepCopy(sample));
            statsObjectContainer.shellSortKnuthStats.S3R3 = getRunTime(new ShellSortKnuth(), returnDeepCopy(sample));
            statsObjectContainer.shellSortSedgewickStats.S3R3 = getRunTime(new ShellSortSedgewick(), returnDeepCopy(sample));

        //Calculate averages
        statsObjectContainer.mergeSortStats.calculateAverages();
        statsObjectContainer.heapSortStats.calculateAverages();
        statsObjectContainer.quickSortStats.calculateAverages();
        statsObjectContainer.shellSort2GapStats.calculateAverages();
        statsObjectContainer.shellSortGonnetStats.calculateAverages();
        statsObjectContainer.shellSortHibbardStats.calculateAverages();
        statsObjectContainer.shellSortKnuthStats.calculateAverages();
        statsObjectContainer.shellSortSedgewickStats.calculateAverages();
    }

    /**
     * Returns deep copy of the sample array.
     * @param a
     * @return
     */
    private static Comparable[] returnDeepCopy(Comparable[] a){

        Comparable[] deepCopy = new Comparable[a.length];
        for(int i = 0; i < a.length; i++)
            deepCopy[i] = a[i];

        return deepCopy;
    }

    /**
     * Get's algorithm run time with System.nano
     * @param algorithmObject
     * @param sample
     * @param <A>
     * @return
     */
    private static
    <A extends SortInterface>
    Long getRunTime(A algorithmObject, Comparable[] sample){

        // Log start time.
        Long startTime = System.nanoTime();

        // Sort a random array.
        algorithmObject.sort(sample);

        // Returns merge-sort sort-time.
        return System.nanoTime() - startTime;
    }

    /**
     * Returns an array of random numbers.
     * @return
     */
    private static Comparable[] returnRandomArray(int sampleSize){

        // Initialize a Comparable array.
        Comparable[] comparableArray = new Comparable[sampleSize];

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
}
