package com.company;

/**
 * Created by micha on 5/6/2016.
 */
public class ShellSortHibbard implements SortInterface {

    /**
     * Shellsort, using a sequence suggested by Hibbard.
     * @param a an array of Comparable items.
     */
    public void sort( Comparable [ ] a )
    {
        //Get the Hibbard sequence
        int[] hibbardSequence = getHibbardSequence(a.length);

        //Set k to the last index of the Hibbard sequence
        int k = hibbardSequence.length - 1;

        for( int gap = hibbardSequence[k]; k >= 0; gap = hibbardSequence[--k]){

            for( int i = gap; i < a.length; i++ )
            {
                Comparable tmp = a[ i ];
                int j = i;

                for( ; j >= gap && tmp.compareTo( a[ j - gap ] ) < 0; j -= gap )
                    a[ j ] = a[ j - gap ];
                a[ j ] = tmp;
            }

            //Prevents out of bounds error at hibbardSequence[--k]
            //when k = -1
            if(k==0)
                break;
        }
    }

    /**
     * We want the hibbardSequence array to be big enough
     * to fit the sequence, but not too large.
     * I calculate what the minimum size should be.
     * Refer to documentation for proof of concept.
     * @param length
     * @return
     */
    private static int[] getHibbardSequence(int length){

        int[] hibbardSequence = new int[(int) Math.log(length)];

        for(int i=0; i < hibbardSequence.length; i++){
            if(i == 0){

                hibbardSequence[i] = 1;

            } else {

                //2^2-1
                hibbardSequence[i] = (int) Math.pow(2,i+1) - 1;

            }
        }

        return hibbardSequence;
    }
}
