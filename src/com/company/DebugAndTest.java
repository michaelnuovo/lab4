package com.company;

import java.text.DecimalFormat;

/**
 * Created by micha on 5/7/2016.
 */
public class DebugAndTest {

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
     * Print sorted array
     */
    public static void testSorts(){

        System.out.println("HeapSort");
        Comparable[] a1 = {5,4,3,2,1,23,2,3,5,23,42353,3,4,1,0};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(a1);
        printArray(a1);

        System.out.println("MergeSort");
        Comparable[] a2 = {5,4,3,2,1,23,2,3,5,23,42353,3,4,1,0};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(a2);
        printArray(a2);

        System.out.println("QuickSort");
        Comparable[] a3 = {5,4,3,2,1,23,2,3,5,23,42353,3,4,1,0};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a3);
        printArray(a3);

        System.out.println("ShellSort2Gap");
        Comparable[] a4 = {5,4,3,2,1,23,2,3,5,23,42353,3,4,1,0};
        ShellSort2Gap shellSort2Gap = new ShellSort2Gap();
        shellSort2Gap.sort(a4);
        printArray(a4);

        System.out.println("ShellSortGonnet");
        Comparable[] a5 = {5,4,3,2,1,23,2,3,5,23,42353,3,4,1,0};
        ShellSortGonnet shellSortGonnet = new ShellSortGonnet();
        shellSortGonnet.sort(a5);
        printArray(a5);

        System.out.println("ShellSortHibbard");
        Comparable[] a6 = {5,4,3,2,1,23,2,3,5,23,42353,3,4,1,0};
        ShellSortHibbard shellSortHibbard = new ShellSortHibbard();
        shellSortHibbard.sort(a6);
        printArray(a6);

        System.out.println("ShellSortKnuth");
        Comparable[] a7 = {5,4,3,2,1,23,2,3,5,23,42353,3,4,1,0};
        ShellSortKnuth shellSortKnuth = new ShellSortKnuth();
        shellSortKnuth.sort(a7);
        printArray(a7);

        System.out.println("ShellSortSedgewick");
        Comparable[] a8 = {5,4,3,2,1,23,2,3,5,23,42353,3,4,1,0};
        ShellSortSedgewick shellSortSedgewick = new ShellSortSedgewick();
        shellSortSedgewick.sort(a8);
        printArray(a8);
    }
}
