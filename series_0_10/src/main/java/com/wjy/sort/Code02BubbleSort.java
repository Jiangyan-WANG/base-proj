package com.wjy.sort;

public class Code02BubbleSort {
    public static void swap(int[] arr, int i, int j){
        if(i==j) return;
        if(i>=arr.length || j>= arr.length) return;
        if(i<0 || j<0) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr){
        if(arr==null || arr.length < 2) return;
        int len = arr.length;
        while(len>1){
            for(int i=0; i<len-1; ++i){

                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
            --len;
        }
    }
}
