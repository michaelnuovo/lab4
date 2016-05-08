package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by micha on 5/7/2016.
 */
public class PrintData {

    /**
     * The only public method in this class.
     * The method prints all data by calling private print methods.
     * @param statsObjectContainer
     */
    public static void printSortTimeStatistics(StatsObjectContainer statsObjectContainer){

        //Column and decimal format variables
        DecimalFormat decimalFormatter = new DecimalFormat("#,###");
        String columnFormat = "%-25s%-15s%-15s%-15s%n";

        //Print a message to the user.
        System.out.println(
                "Elapsed time is measured in nano seconds\n" +
                        "Minimum sample size is "
                        + decimalFormatter.format(
                        statsObjectContainer.minimumSampleSize.intValue())
        );

        //Print first sample stats
        printSample1Stats(statsObjectContainer, "Sample 1", decimalFormatter, columnFormat);

        //Print first sample stats
        printSample2Stats(statsObjectContainer, "Sample 2", decimalFormatter, columnFormat);

        //Print first sample stats
        printSample2Stats(statsObjectContainer, "Sample 3", decimalFormatter, columnFormat);

        //Print averages
        printAverages(statsObjectContainer, decimalFormatter, columnFormat);

        //Create the final data matrix
        Entry[][] m = createMatix(statsObjectContainer);

        //Sort the matrix
        sortMatrix(m);

        //print the matrix
        printMatrix(m);
    }



    /**
     * Prints first table for sample 3.
     * @param statsObjectContainer
     * @param sampleTitle
     * @param decimalFormatter
     * @param columnFormat
     */
    private static void printSample1Stats(StatsObjectContainer statsObjectContainer,
                                           String sampleTitle, DecimalFormat decimalFormatter,
                                          String columnFormat
    ){
        printSampleHeader(sampleTitle, columnFormat);
        for(int i = 0; i < statsObjectContainer.statsObjectsArray.length; i++){
            System.out.println();
            System.out.printf(
                    columnFormat,
                    statsObjectContainer.statsObjectsArray[i].name,
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S1R1),
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S1R2),
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S1R3)
            );
        }
    }

    /**
     * Print second table for sample 2.
     * @param statsObjectContainer
     * @param sampleTitle
     * @param decimalFormatter
     * @param columnFormat
     */
    private static void printSample2Stats(StatsObjectContainer statsObjectContainer,
                                          String sampleTitle, DecimalFormat decimalFormatter,
                                          String columnFormat
    ){
        printSampleHeader(sampleTitle, columnFormat);
        for(int i = 0; i < statsObjectContainer.statsObjectsArray.length; i++){
            System.out.println();
            System.out.printf(
                    columnFormat,
                    statsObjectContainer.statsObjectsArray[i].name,
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S2R1),
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S2R2),
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S2R3)
            );
        }
    }

    /**
     * Print's third table for sample 3.
     * @param statsObjectContainer
     * @param sampleTitle
     * @param decimalFormatter
     * @param columnFormat
     */
    private static void printSample3Stats(StatsObjectContainer statsObjectContainer,
                                          String sampleTitle, DecimalFormat decimalFormatter,
                                          String columnFormat
    ){
        printSampleHeader(sampleTitle, columnFormat);
        for(int i = 0; i < statsObjectContainer.statsObjectsArray.length; i++){
            System.out.println();
            System.out.printf(
                    columnFormat,
                    statsObjectContainer.statsObjectsArray[i].name,
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S3R1),
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S3R2),
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S3R3)
            );
        }
    }

    /**
     * Print fourth table.
     * This table contains average sort-time for each run.
     * @param statsObjectContainer
     * @param decimalFormatter
     * @param columnFormat
     */
    private static void printAverages(
            StatsObjectContainer statsObjectContainer,
            DecimalFormat decimalFormatter,
            String columnFormat){

        printAveragesHeader(columnFormat);
        for(int i = 0; i < statsObjectContainer.statsObjectsArray.length; i++){
            System.out.println();
            System.out.printf(
                    columnFormat,
                    statsObjectContainer.statsObjectsArray[i].name,
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S1Average),
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S2Average),
                    decimalFormatter.format(statsObjectContainer.statsObjectsArray[i].S3Average)
            );
        }
    }

    /**
     * Prints fifth table.
     * This table stack faster algorithm on top of slower ones.
     * It is a sorted table that provide a side of side comparison
     * of different algorithms.
     * @param m
     */
    private static void printMatrix(Entry[][] m){

        DecimalFormat f = new DecimalFormat("#,###");
        String columnFormat = "%-40s%-40s%-40s%n";

        printMatrixHeader(columnFormat);

        System.out.printf(
                columnFormat,
                m[0][0].name+" ("+f.format(m[0][0].time)+")",
                m[0][1].name+" ("+f.format(m[0][1].time)+")",
                m[0][2].name+" ("+f.format(m[0][2].time)+")"
        );

        System.out.printf(
                columnFormat,
                m[1][0].name+" ("+f.format(m[1][0].time)+")",
                m[1][1].name+" ("+f.format(m[1][1].time)+")",
                m[1][2].name+" ("+f.format(m[1][2].time)+")"
        );

        System.out.printf(
                columnFormat,
                m[2][0].name+" ("+f.format(m[2][0].time)+")",
                m[2][1].name+" ("+f.format(m[2][1].time)+")",
                m[2][2].name+" ("+f.format(m[2][2].time)+")"
        );

        System.out.printf(
                columnFormat,
                m[3][0].name+" ("+f.format(m[3][0].time)+")",
                m[3][1].name+" ("+f.format(m[3][1].time)+")",
                m[3][2].name+" ("+f.format(m[3][2].time)+")"
        );

        System.out.printf(
                columnFormat,
                m[4][0].name+" ("+f.format(m[4][0].time)+")",
                m[4][1].name+" ("+f.format(m[4][1].time)+")",
                m[4][2].name+" ("+f.format(m[4][2].time)+")"
        );

        System.out.printf(
                columnFormat,
                m[5][0].name+" ("+f.format(m[5][0].time)+")",
                m[5][1].name+" ("+f.format(m[5][1].time)+")",
                m[5][2].name+" ("+f.format(m[5][2].time)+")"
        );

        System.out.printf(
                columnFormat,
                m[6][0].name+" ("+f.format(m[6][0].time)+")",
                m[6][1].name+" ("+f.format(m[6][1].time)+")",
                m[6][2].name+" ("+f.format(m[6][2].time)+")"
        );

        System.out.printf(
                columnFormat,
                m[7][0].name+" ("+f.format(m[7][0].time)+")",
                m[7][1].name+" ("+f.format(m[7][1].time)+")",
                m[7][2].name+" ("+f.format(m[7][2].time)+")"
        );

    }

    /**
     * Prints header for each sample
     */
    private static void printSampleHeader(String sampleNumber, String columnFormat){

        System.out.println();
        System.out.println("-----------------------------------------------------------------------");

        System.out.printf(
                columnFormat,
                sampleNumber,
                "Run 1",
                "Run 2",
                "Run 3"
        );

        System.out.println("-----------------------------------------------------------------------");
    }

    /**
     * Print averages table header
     * @param columnFormat
     */
    private static void printAveragesHeader(String columnFormat){
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");

        System.out.printf(
                columnFormat,
                "AVERAGE",
                "Sample 1",
                "Sample 2",
                "Sample 3"
        );

        System.out.println("-----------------------------------------------------------------------");
    }

    private static void printMatrixHeader(String columnFormat){

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------");

        System.out.printf(
                columnFormat,
                "Sample 1 Average",
                "Sample 2 Average",
                "Sample 3 Average"
        );

        System.out.println("------------------------------------------------------------------------------------------------------------");

    }

    public static class Entry{

        String name;
        Long time;

        public Entry(String name, Long time){
            this.name = name;
            this.time = time;
        }
    }

    private static Entry[][]  createMatix(StatsObjectContainer o){

        Entry[][] m = new Entry[8][3];

        m[0][0] = new Entry("Merge",o.mergeSortStats.S1Average);
        m[0][1] = new Entry("Merge",o.mergeSortStats.S2Average);
        m[0][2] = new Entry("Merge",o.mergeSortStats.S3Average);

        m[1][0] = new Entry("Heap",o.heapSortStats.S1Average);
        m[1][1] = new Entry("Heap",o.heapSortStats.S2Average);
        m[1][2] = new Entry("Heap",o.heapSortStats.S3Average);

        m[2][0] = new Entry("Quick",o.quickSortStats.S1Average);
        m[2][1] = new Entry("Quick",o.quickSortStats.S2Average);
        m[2][2] = new Entry("Quick",o.quickSortStats.S3Average);

        m[3][0] = new Entry("2Gap",o.shellSort2GapStats.S1Average);
        m[3][1] = new Entry("2Gap",o.shellSort2GapStats.S2Average);
        m[3][2] = new Entry("2Gap",o.shellSort2GapStats.S3Average);

        m[4][0] = new Entry("Gonnet",o.shellSortGonnetStats.S1Average);
        m[4][1] = new Entry("Gonnet",o.shellSortGonnetStats.S2Average);
        m[4][2] = new Entry("Gonnet",o.shellSortGonnetStats.S3Average);

        m[5][0] = new Entry("Hibbard",o.shellSortHibbardStats.S1Average);
        m[5][1] = new Entry("Hibbard",o.shellSortHibbardStats.S2Average);
        m[5][2] = new Entry("Hibbard",o.shellSortHibbardStats.S3Average);

        m[6][0] = new Entry("Knuth",o.shellSortKnuthStats.S1Average);
        m[6][1] = new Entry("Knuth",o.shellSortKnuthStats.S2Average);
        m[6][2] = new Entry("Knuth",o.shellSortKnuthStats.S3Average);

        m[7][0] = new Entry("Sedgewick",o.shellSortSedgewickStats.S1Average);
        m[7][1] = new Entry("Sedgewick",o.shellSortSedgewickStats.S2Average);
        m[7][2] = new Entry("Sedgewick",o.shellSortSedgewickStats.S3Average);

        return m;
    }

    //Bubble sorts the matrix so that
    //columns are in ascending order
    private static void sortMatrix(Entry[][] m){
        int i;
        for(i=0;i<3;i++){
            int length = 8;
            Entry temp;
            for (int j = 0; j < length; j++) {
                for (int k = 1; k < length - j; k++) {
                    if (m[k - 1][i].time > m[k][i].time) {
                        temp = m[k - 1][i];
                        m[k - 1][i] = m[k][i];
                        m[k][i] = temp;
                    }
                }
            }
        }
    }
}
