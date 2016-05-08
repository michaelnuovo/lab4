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

        //StatsObjectContainer contains a statsObject reference
        //for each algorithm object.
        StatsObjectContainer statsObjectContainer = new StatsObjectContainer();

        //Populate statsObjects in StatsObjectContainer
        generateStats(statsObjectContainer.mergeSortStats, new MergeSort());
        generateStats(statsObjectContainer.priorityQueueStats, new MergeSort());
        generateStats(statsObjectContainer.quickSortStats, new MergeSort());
        generateStats(statsObjectContainer.shellSort2GapStats, new MergeSort());
        generateStats(statsObjectContainer.shellSortGonnetStats, new MergeSort());
        generateStats(statsObjectContainer.shellSortHibbardStats, new MergeSort());
        generateStats(statsObjectContainer.shellSortKnuthStats, new MergeSort());
        generateStats(statsObjectContainer.shellSortSedgewickStats, new MergeSort());

        //Prints sort-time statistics.
        PrintData.printSortTimeStatistics(statsObjectContainer);
    }

    private static <A extends SortInterface>
    void generateStats(
            StatsObject statsObject,
            A algorithmObject){

        //The reference to the sample
        Comparable[] sample;

        //Sample size is 1 million
        int sampleSize = 1000000;

        //Record minimum sample size
        if(statsObject.minimumSampleSize == null)
            statsObject.minimumSampleSize = sampleSize;

        //Outer loop generates the sample
        for(int i = 1; i <= 3; i++){

            //Successive samples should be twice as large as the previous
            sample = returnRandomArray(sampleSize);
            sampleSize *= 2;

            //Inner loops generates the run
            for(int j = 1; j <= 3; j++){

                //Sample 1

                    //Run 1
                    if(i == 1 && j == 1)
                        statsObject.S1R1 = getRunTime(algorithmObject, returnDeepCopy(sample));
                    //Run 2
                    if(i == 1 && j == 2)
                        statsObject.S1R2 = getRunTime(algorithmObject, returnDeepCopy(sample));
                    //Run 3
                    if(i == 1 && j == 3)
                        statsObject.S1R3 = getRunTime(algorithmObject, returnDeepCopy(sample));

                //Sample 2

                    //Run 1
                    if(i == 2 && j == 1)
                        statsObject.S2R1 = getRunTime(algorithmObject, returnDeepCopy(sample));
                    //Run 2
                    if(i == 2 && j == 2)
                        statsObject.S2R2 = getRunTime(algorithmObject, returnDeepCopy(sample));
                    //Run 3
                    if(i == 2 && j == 3)
                        statsObject.S2R3 = getRunTime(algorithmObject, returnDeepCopy(sample));

                //Sample 3

                    //Run 1
                    if(i == 3 && j == 1)
                        statsObject.S3R1 = getRunTime(algorithmObject, returnDeepCopy(sample));
                    //Run 2
                    if(i == 3 && j == 2)
                        statsObject.S3R2 = getRunTime(algorithmObject, returnDeepCopy(sample));
                    //Run 3
                    if(i == 3 && j == 3)
                        statsObject.S3R3 = getRunTime(algorithmObject, returnDeepCopy(sample));
            }
        }

        //Calculate averages
        statsObject.calculateAverages();

    }

    private static Comparable[] returnDeepCopy(Comparable[] a){

        Comparable[] deepCopy = new Comparable[a.length];
        for(int i = 0; i < a.length; i++)
            deepCopy[i] = a[i];

        return deepCopy;
    }

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
