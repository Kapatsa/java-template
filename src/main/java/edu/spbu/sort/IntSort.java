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

      int first = 0;
      int last = array.length - 1;
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
              i++;
              j--;
          }
      }
      //Using recursion here
      if (first < j)
          sort(Arrays.copyOfRange(array, first, j));

      if (i < last);
          sort(Arrays.copyOfRange(array, i, last));

  }


  public static void sort (List<Integer> list) {
    Collections.sort(list);
  }
}
