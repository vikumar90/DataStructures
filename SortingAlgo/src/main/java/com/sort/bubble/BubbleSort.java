package com.sort.bubble;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 12, 15, 17, 19, 33, 3, 14, 9 };
		bubbleSort(arr);
		print(arr);
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j);
				}
			}
		}

	}

	private static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	}

	public static void print(int[] arr) {
		Arrays.stream(arr).forEach(att -> System.out.println(att));
	}

}
