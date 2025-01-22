package org.example;
import java.util.Arrays;

public class InsertionSort {
    //Sorts the array using Insertion Sort.
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            insert(i, a);
        }
    }

    private void insert(int i, Comparable[] a) {
        Comparable key = a[i];
        int j = i - 1;
        while (j >= 0 && a[j].compareTo(key) > 0) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = key;
    }

    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

       public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Before sorting: " + Arrays.toString(array));
        sorter.sort(array);
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}
