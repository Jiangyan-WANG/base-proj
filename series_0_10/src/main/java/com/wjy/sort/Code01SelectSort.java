package com.wjy.sort;

public class Code01SelectSort {
    public static void swap(int[] arr, int i, int j){
        if(i==j) return;
        if(i>=arr.length || j>= arr.length) return;
        if(i<0 || j<0) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr){
        if(arr==null || arr.length < 2) return;
        int len = arr.length;
        int min = 0;
        for(int i=0; i<len; ++i){
            min=i;
            for(int j=i+1;j<len;++j){
                if(arr[j]<arr[min]){
                    min =j;
                }
            }
            if(min!=i){
                swap(arr,i,min);
            }
        }
    }
}
