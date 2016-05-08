package com.company;

/**
 * A class which contains StatsObjects
 * and other statistical information.
 * This information will provide
 * the basis for my dashboards
 * in the final output.
 */
public class StatsObjectContainer {

    StatsObject mergeSortStats = new StatsObject("Merge Sort");
    StatsObject heapSortStats = new StatsObject("Heap Sort");
    StatsObject quickSortStats = new StatsObject("Quick Sort");
    StatsObject shellSort2GapStats = new StatsObject("Shell Sort 2-Gap");
    StatsObject shellSortGonnetStats = new StatsObject("Shell Sort Gonnet");
    StatsObject shellSortHibbardStats = new StatsObject("Shell Sort Hibbard");
    StatsObject shellSortKnuthStats = new StatsObject("Shell Sort Knuth");
    StatsObject shellSortSedgewickStats = new StatsObject("Shell Sort Sedgewick");

    Integer minimumSampleSize = null;

    StatsObject[] statsObjectsArray = {
            mergeSortStats, heapSortStats,quickSortStats,
            shellSort2GapStats,shellSortGonnetStats,shellSortHibbardStats,
            shellSortKnuthStats, shellSortSedgewickStats
    };
}
