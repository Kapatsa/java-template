package edu.spbu.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntSort {

  public static void swap (int array[], int i, int j)  {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
  }

    public static void sort (int array[]) {

        if (array ==null || array.length==0){
            return;
        }
        int r = array.length - 1;
        quicksort(0, r, array);
    }

  public static void quicksort (int first, int last, int array[]) {

      if ( first >= last )
      {
          return;
      }

      int pivot = array[first + (last - first)/2];
      int i = first, j = last;
      //Divide into two sets
      while (i <= j) {
          while (array[i] < pivot) {
              ++i;
          }
          while (array[j] > pivot) {
              --j;
          }
          //Swapping the elements
          if (i <= j) {
              swap(array, i, j);
              ++i;
              --j;
          }
      }
      //Using recursion here
      if (first < j) {
          quicksort(first, j, array);
      }

      if (i < last) {
          quicksort(i, last, array);
      }
  }



  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}
