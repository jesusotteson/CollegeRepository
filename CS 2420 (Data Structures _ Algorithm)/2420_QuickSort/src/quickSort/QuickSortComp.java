/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickSort;

import java.util.Random;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Quick3way;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 *
 * @author dhunter3
 */
public class QuickSortComp {

    /**
     * @param args the command line arguments
     */
    private static Integer[] randomIntegers(int n, int numberOfDigits) {
        Integer[] list = new Integer[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list[i] = random.nextInt(numberOfDigits);
        }
        return list;
    }

    public static void main(String[] args) {
        //make random array
        Integer[] theNumbers = randomIntegers(100000000, 10000);
        //quick sort
        long startTime = System.nanoTime();        
        quickdemo(theNumbers);
        long endTime = System.nanoTime();        
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.print("3 way Quicksort: " );
        StdOut.println(duration/1000000);
        StdRandom.shuffle(theNumbers);
        //selection sort
        startTime = System.nanoTime();
        selectiondemo(theNumbers);
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.print("Selection Sort: " );
        StdOut.println(duration/1000000);
        StdRandom.shuffle(theNumbers);
        //insertion sort
        startTime = System.nanoTime();
        insertiondemo(theNumbers);
        endTime = System.nanoTime();
        duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.print("Insertion Sort: " );
        StdOut.println(duration/1000000);
    }

    private static void quickdemo(Integer[] array_ints) {
    	Quick3way.sort(array_ints);
    }

    private static void selectiondemo(Integer[] array_ints) {
    	Selection.sort(array_ints);
    }

    private static void insertiondemo(Integer[] array_ints) {
    	Insertion.sort(array_ints);
    }

}