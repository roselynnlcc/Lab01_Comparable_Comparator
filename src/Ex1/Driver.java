package Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Candy", 18));
		studentList.add(new Student("Eric", 19));
		studentList.add(new Student("Nadia", 26));
		studentList.add(new Student("Todd", 19));
		studentList.add(new Student("Sally", 22));
		
		// Before sorting
		System.out.println("Before sorting: ");
		for(Student s: studentList) {
			System.out.println("\t" + s);
		}
		
		// Using Comparable compareTo() method to compare students based on their name
		System.out.println("\nSort by name using Comparable compareTo()");
		Collections.sort(studentList);
		for(Student s: studentList) {
			System.out.println("\t" + s.toString());
		}
		
		// Using Comparator compare() method to compare students based on their ages
				System.out.println("\nSort by age using Comparator compare()");
				AgeCompare ac = new AgeCompare();
				Collections.sort(studentList, ac);
				for(Student s: studentList) {
					System.out.println("\t" + s.toString());
				}
				// If the ages are equal, it then compares based on their name.
				// It is observable from students of age 19: 
				// Eric comes before Todd.
	}
	
}
