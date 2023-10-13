package Ex2;

import java.util.Collections;
import java.util.ArrayList;

public class BinarySearchExample {

	public static int binarySearch(ArrayList<Integer> sortedList, int targetNum) {
		int minIndex = 0;
		int maxIndex = sortedList.size();
		while (minIndex < maxIndex) {
			int middleIndex = (minIndex + maxIndex) / 2;
			if (targetNum == sortedList.get(middleIndex)) {
				return middleIndex;
			}
			else if (targetNum < sortedList.get(middleIndex)){
				maxIndex = middleIndex - 1;
			}
			else if (targetNum > sortedList.get(middleIndex)) {
				minIndex = middleIndex + 1;
			}
		}
		return -1; 
		// if no index is return in the loop, it means targetNum not in the sortedList
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(5);
		integerList.add(4);
		integerList.add(1);
		integerList.add(8);
		integerList.add(6);
		integerList.add(9);
		integerList.add(10);
		integerList.add(4);
		
		Collections.sort(integerList);
		System.out.println("Sorted List before passing to binarySearch():");
		System.out.println(integerList);
		System.out.println();
		
		int targetNum1 = 4; //Expected to return 1 when passing to binarySearch();
		System.out.println("If target number is " + targetNum1);
		System.out.println("Expected value: 1");
		System.out.println("binarySearch result: " + binarySearch(integerList, targetNum1) + "\n");
		
		int targetNum2 = 6; //Expected to return 4 when passing to binarySearch();
		System.out.println("When target number is " + targetNum2);
		System.out.println("Expected value: 4");
		System.out.println("binarySearch result: " + binarySearch(integerList, targetNum2) + "\n");
		
		int targetNum3 = 3; //Expected to return -1 when passing to binarySearch();
		System.out.println("When target number is " + targetNum3);
		System.out.println("Expected value: -1");
		System.out.println("binarySearch result: " + binarySearch(integerList, targetNum3) + "\n");
	}

}
