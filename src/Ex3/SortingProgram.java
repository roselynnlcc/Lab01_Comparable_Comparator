package Ex3;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

public class SortingProgram {

	public static void main(String[] args) {
		int[] numbers = { 3, 1, 2, 7, 15, 8, 4, 6, -1, 19 };
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(numbers));
		System.out.println("Choose a sorting algorithm:");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Quick Sort");
		System.out.println("3. Insertion Sort");
		System.out.println("4. Selection Sort");

		try (Scanner scanner = new Scanner(System.in)) {
			int choice;

			while (true) {
				try {
					choice = scanner.nextInt();
					if (choice >= 1 && choice <= 4) {
						break;
					} else {
						System.out.println("Please enter a valid choice: ");
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a valid choice: ");
					scanner.nextLine();
				}
			}

			switch (choice) {
			case 1:
				bubbleSort(numbers);
				break;
			case 2:
				quickSort(numbers);
				break;
			case 3:
				insertionSort(numbers);
				break;
			case 4:
				selectionSort(numbers);
				break;
			}
			System.out.println("After sorting: ");
			System.out.println(Arrays.toString(numbers));
		}

	}

	public static void bubbleSort(int[] givenArray) {
		for (int i = 0; i < givenArray.length; i++) {
			for (int j = 0; j < givenArray.length - i - 1; j++) {
				if (givenArray[j] > givenArray[j + 1]) {
					swap(givenArray, j, j + 1);
				}
			}
		}
	}

	// recursive function for quickSort
	// given an array, put low as 0 and high as (length of array - 1)
	public static void quickSort(int[] givenArray) {
		quickSort(givenArray, 0, givenArray.length - 1);
	}

	public static void quickSort(int[] givenArray, int lowIndex, int highIndex) {
		int pivotIndex;
		if (lowIndex < highIndex) {
			pivotIndex = partition(givenArray, lowIndex, highIndex);
			quickSort(givenArray, lowIndex, pivotIndex - 1);
			quickSort(givenArray, pivotIndex + 1, highIndex);
		}
	}

	private static int partition(int[] arr, int lowIndex, int highIndex) {
		int middleIndex = (lowIndex + highIndex) / 2; // use middle element as pivot
		int pivotValue = arr[middleIndex];

		swap(arr, middleIndex, highIndex); // swap the middle element to with the last element

		int i = lowIndex - 1;
		for (int j = lowIndex; j <= highIndex; j++) {
			if (arr[j] < pivotValue) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, highIndex);
		return (i + 1);
	}

	public static void insertionSort(int[] givenArray) {
		for (int i = 1; i < givenArray.length; i++) {
			int key = givenArray[i];
			int j = i - 1;

			while (j >= 0 && givenArray[j] > key) {
				givenArray[j + 1] = givenArray[j];
				j--;
			}
			givenArray[j + 1] = key;
		}
	}

	public static void selectionSort(int[] givenArray) {
		for (int i = 0; i < givenArray.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < givenArray.length; j++) {
				if (givenArray[minIndex] > givenArray[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(givenArray, i, minIndex);
			}
		}
	}

	// swapping function for general use
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
