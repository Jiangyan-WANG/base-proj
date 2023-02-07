package com.wjy.sort;

import junit.framework.TestCase;

import static com.wjy.utils.CodeUtil.*;

public class CodeSortCmptorTest extends TestCase {

    public void testSwap() {
        int a[] = {3,4,6,34,1,99,6798};

        Code01SelectSort.swap(a, 0,4);
        assertEquals(1, a[0]);
        assertEquals(3, a[4]);

        Code01SelectSort.swap(a, -1, 4);
        assertEquals(1, a[0]);
        assertEquals(3, a[4]);

        Code01SelectSort.swap(a, 1, 5);
        assertEquals(99, a[1]);
        assertEquals(4, a[5]);

    }

    public void testSelectionSort() {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            Code01SelectSort.selectionSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

    }

    public void testBubbleSort() {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            Code02BubbleSort.bubbleSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

    }

    public void testInsertSort() {

        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            Code03InsertSort.insertSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

    }
}