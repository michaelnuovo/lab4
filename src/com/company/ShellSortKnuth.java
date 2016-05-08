package com.company;

/**
 * Created by micha on 5/6/2016.
 */
public class ShellSortKnuth implements SortInterface {

    /**
     * Shellsort, using a sequence suggested by Knuth.
     * @param a an array of Comparable items.
     */
    public void sort( Comparable [ ] a )
    {
        //Get the Knuth sequence
        int[] knuthSequence = getKnuthSequence(a.length);

        //Set k to the last index of the Knuth sequence
        int k = knuthSequence.length - 1;

        for( int gap = knuthSequence[k]; k >= 0; gap = knuthSequence[--k]){

            //System.out.println("using gap " + gap);
            //System.out.println("k is " + k);

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
     * We want the Knuth array to be big enough
     * to fit the sequence, but not too large.
     * I calculate what the minimum size should be.
     * Refer to documentation for proof of concept.
     * @param length
     * @return
     */
    private static int[] getKnuthSequence(int length){

        int[] knuthSequence = new int[(int)(
                (Math.log10(6*length + 1))/Math.log10(3) - 1)];

        for(int i=0; i < knuthSequence.length; i++){

            if(i == 0){
                knuthSequence[0] = 1;
            } else {

                //3n+1
                //{1, 4, 13, 40, 121, …}
                knuthSequence[i] = 3*knuthSequence[i-1]+1;
            }
        }

        return knuthSequence;
    }
}
