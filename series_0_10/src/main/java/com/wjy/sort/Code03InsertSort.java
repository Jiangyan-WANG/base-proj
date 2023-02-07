package com.wjy.sort;

public class Code03InsertSort {
    public static void swap(int[] arr, int i, int j){
        if(i==j) return;
        if(i>=arr.length || j>= arr.length) return;
        if(i<0 || j<0) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertSort(int[] arr){
        if(arr==null || arr.length < 2) return;
        int len = arr.length;
        for(int i=1; i<len; ++i){
            for(int j=i; j>0; --j){
                if(arr[j]>arr[j-1]) break;
                swap(arr,j,j-1);
            }
        }
    }
}
