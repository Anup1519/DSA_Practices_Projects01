package com.anup.array;

import java.util.Arrays;

public class FindMaximumElementToArray {

    private int[] items;
    private int currentIndex;

    public FindMaximumElementToArray(int initialSize) {
        this.items = new int[initialSize];
        this.currentIndex = 0;
    }

    public void insert(int value) {
        //Dynamic Array
        if (currentIndex == items.length) {
            int[] temp = new int[items.length * 2];
            for (int i = 0; i < currentIndex; i++) {
                temp[i] = items[i];
            }
            items = temp;

        }

        //Static array
        this.items[currentIndex] = value;
        currentIndex++;
    }

    // Find Max Element to Array
    public int max() {
        int result = items[0];
        for (int i = 1; i < this.currentIndex; i++) {
            if (items[i] > result) {
                result = items[i];
            }
        }
        return result;
    }

    public int min() {
        int result = items[0];
        for (int i = 1; i < this.currentIndex; i++) {
            if (items[i] < result) {
                result = items[i];
            }
        }
        return result;
    }

    public void reverseArray() {
        int i = 0;
        int j = this.currentIndex - 1;

        while (i < j) {
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
            i++;
            j--;
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int num : this.items) {
            str.append(num + ", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }
}
