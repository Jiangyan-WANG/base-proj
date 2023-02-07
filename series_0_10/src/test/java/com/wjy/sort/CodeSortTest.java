package com.wjy.sort;

import junit.framework.TestCase;

public class CodeSortTest extends TestCase {

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
        int a[] = {6798,3,4,99,6,34,1,99,6798};
        Code01SelectSort.selectionSort(a);
        int a_excepted[] = {1,3,4,6,34,99,99,6798,6798};
        for(int i=0;i<a.length;++i){
            assertEquals(a_excepted[i], a[i]);
        }
    }

    public void testBubbleSort() {
        int a[] = {6798,3,4,99,6,34,1,99,6798};
        Code02BubbleSort.bubbleSort(a);
        int a_excepted[] = {1,3,4,6,34,99,99,6798,6798};
        for(int i=0;i<a.length;++i){
            assertEquals(a_excepted[i], a[i]);
        }
    }

    public void testInsertSort() {
        int a[] = {6798,3,4,99,6,34,1,99,6798};
        Code03InsertSort.insertSort(a);
        int a_excepted[] = {1,3,4,6,34,99,99,6798,6798};
        for(int i=0;i<a.length;++i){
            assertEquals(a_excepted[i], a[i]);
        }
    }
}