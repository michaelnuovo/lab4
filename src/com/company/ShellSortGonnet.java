package com.company;

/**
 * Created by micha on 5/6/2016.
 */
public class ShellSortGonnet implements SortInterface {

    /**
     * Shellsort, using a sequence suggested by Gonnet.
     * @param a an array of Comparable items.
     */
    public void sort( Comparable [ ] a )
    {
        for( int gap = a.length / 2; gap > 0;
             gap = gap == 2 ? 1 : (int) ( gap / 2.2 ) )
            for( int i = gap; i < a.length; i++ )
            {
                Comparable tmp = a[ i ];
                int j = i;

                for( ; j >= gap && tmp.compareTo( a[ j - gap ] ) < 0; j -= gap )
                    a[ j ] = a[ j - gap ];
                a[ j ] = tmp;
            }
    }
}
