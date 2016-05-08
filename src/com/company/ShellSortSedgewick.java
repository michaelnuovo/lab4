package com.company;

/**
 * Created by micha on 5/6/2016.
 */
public class ShellSortSedgewick implements SortInterface {

    /**
     * Shellsort, using a sequence suggested by Sedgewick.
     * @param a an array of Comparable items.
     */
    public void sort( Comparable [ ] a )
    {
        //Get the Sedgewick sequence
        int[] sedgewickSequence = getSedgewickSequence(a.length);

        //Set k to the last index of the Sedgewick sequence
        int k = sedgewickSequence.length - 1;

        for( int gap = sedgewickSequence[k]; k >= 0; gap = sedgewickSequence[--k]){

            for( int i = gap; i < a.length; i++ )
            {
                Comparable tmp = a[ i ];
                int j = i;

                for( ; j >= gap && tmp.compareTo( a[ j - gap ] ) < 0; j -= gap )
                    a[ j ] = a[ j - gap ];
                a[ j ] = tmp;
            }

            //Prevents out of bounds error at SedgewickSequence[--k]
            //when k = -1
            if(k==0)
                break;
        }
    }

    /**
     * The Sedgewick sequence is the result of interleaving
     * or merging two different sequences.
     * We can get these sequences and merge them
     * to get the Sedgewick sequence.
     * @param length
     * @return
     */
    public static int[] getSedgewickSequence(int length){

        int[] firstSequence = getFirstSequence(length);
        int[] secondSequence = getSecondSequence(length);

        int[] sedgewickSequence = merge(firstSequence, secondSequence);

        return sedgewickSequence;
    }


    /**
     * We want the first array to be big enough
     * to fit the sequence, but not too large.
     * I calculate what the minimum size should be.
     * Refer to documentation for proof of concept.
     * @param length
     * @return
     */
    public static int[] getFirstSequence(int length) {

        int[] firstSequence = new int[(int) (

                        Math.log10((1.0/2)*(Math.sqrt(4*length+5)+ 3))
                                /
                        Math.log10(2)
                )];

        for(int i=0; i < firstSequence.length; i++){

            if(i == 0){

                //The first item in the sequence is 1
                firstSequence[i] = 1;

            } else {

                //4 ^ i – 3 * 2 ^ i + 1
                firstSequence[i] = (int) Math.pow(4,i+1) - 3 * (int) Math.pow(2,i+1) + 1;

            }
        }

        return firstSequence;
    }

    /**
     * We want the second array to be big enough
     * to fit the sequence, but not too large.
     * I calculate what the minimum size should be.
     * Refer to documentation for proof of concept.
     * @param length
     * @return
     */
    public static int[] getSecondSequence(int length) {

        int[] secondSequence = new int[(int) (

                Math.log10((1.0/6)*(Math.sqrt(4*length+5)+ 3))
                        /
                Math.log10(2)
        )];

        for(int i=0; i < secondSequence.length; i++){

                //9 * 4 i – 9 * 2 i + 1
                secondSequence[i] = 9 * (int) Math.pow(4,i+1) - 9 * (int) Math.pow(2,i+1) + 1;
        }

        return secondSequence;
    }

    /**
     * Merges the first and second array.
     * @param firstSequence
     * @param secondSequence
     * @return
     */
    private static int[] merge(int[] firstSequence, int[] secondSequence){

        //Initialize an array big enough to hold firstSequence and secondSequence.
        int[] sedgewickSequence = new int[firstSequence.length + secondSequence.length];

        int leftPos = 0;
        int leftEnd = firstSequence.length - 1;
        int rightPos = 0;
        int rightEnd = secondSequence.length - 1;
        int tmpPos = 0;

        //We merge the arrays into the sedgewickSequence array
        while(leftPos <= leftEnd && rightPos <= rightEnd)
            if(firstSequence[leftPos] < secondSequence[rightPos])
                sedgewickSequence[tmpPos++] = firstSequence[leftPos++];
            else
                sedgewickSequence[tmpPos++] = secondSequence[rightPos++];

        //If secondSequence is exhausted, this happens, and the rest of the
        //firstSequence is copied over to sedgewickSequence.
        while(leftPos <= leftEnd)
            sedgewickSequence[tmpPos++] = firstSequence[leftPos++];

        //If firstSequence is exhausted, this happens, and the rest of the
        //secondSequence is copied over to sedgewickSequence.
        while(rightPos<=rightEnd)
            sedgewickSequence[tmpPos++] = secondSequence[rightPos++];

        return sedgewickSequence;
    }
}
