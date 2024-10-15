package com.array;

import java.util.Arrays;

import static java.util.Arrays.*;

public class FindGreatestArray {
    static int bruteForce(int arr[]) {
          sort(arr);
          return arr[arr.length-1];
    }

    static int optimise(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3, 0};
//        System.out.println(bruteForce(arr));
        System.out.println(optimise(arr));
    }
}
