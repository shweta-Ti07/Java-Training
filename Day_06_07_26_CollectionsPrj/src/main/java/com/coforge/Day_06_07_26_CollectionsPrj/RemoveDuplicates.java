package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Arrays;

public class RemoveDuplicates {
    static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int k = 0; k < j; k++)
                if (temp[k] == arr[i])
                    found = true;
            if (!found)
                temp[j++] = arr[i];
        }
        return Arrays.copyOf(temp, j);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("After removing duplicates: " + Arrays.toString(removeDuplicates(arr)));
    }
}