package com.company;

/**
 * An object that contains statistics on
 * an individual algorithm.
 * This information will provide
 * the basis for my dashboards
 * in the final output.
 */
public class StatsObject {

    String name;

    Integer minimumSampleSize = null;

    Long S1Average;
    Long S2Average;
    Long S3Average;

    int sampleSize1;
    int sampleSize2;
    int sampleSize3;

    public StatsObject(String name){
        this.name = name;
    }

    public void calculateAverages(){
        S1Average = (S1R1 + S1R2 + S1R3) / 3;
        S2Average = (S2R1 + S2R2 + S2R3) / 3;
        S3Average = (S3R1 + S3R2 + S3R3) / 3;
    }

    //First sample stats

        //S is for stats, R is for run
        Long S1R1;Long S1R2;Long S1R3;

    //Second sample stats

        //S is for stats, R is for run
        Long S2R1;Long S2R2;Long S2R3;

    //Second sample stats

        //S is for stats, R is for run
        Long S3R1;Long S3R2;Long S3R3;
}
