# Lab 1 Comparable and Comparator Interfaces

## Exercise 1: Student Sorting 🧑‍🎓

During Exercise 1, the Student class was implemented, and both the Comparable and Comparator interfaces were used to sort students based on their name and age. The importance of object comparison in programming was underscored by this exercise.

**Key Takeaways:**

* I learned the significance of the Comparable interface when it comes to providing a default way to compare objects of the same class. It allowed me to sort students based on their name effortlessly.
* Implementing the Comparator interface gave me the flexibility to define multiple ways of comparing objects, which is useful when dealing with different criteria.
## Exercise 2: Binary Search 🔍

**Key Takeaways:**

* Binary search is a powerful algorithm for finding elements in sorted lists. It divides the search range in half at each step, resulting in fast and efficient searches.
* I gained a deeper understanding of how to implement search algorithms and handle edge cases when the target element is not found.

**Notes for Time Complexity for Binary Search:**

* Best Case: O(1) - The target element is found in the first comparison.
* Worst Case: O(log(n)) - The target element is at the middle of the list or not in the list. Binary search efficiently reduces the search space by half in each step.

This exercise reminded me of the significance of choosing the right search algorithm for specific scenarios and how well-optimized algorithms can significantly improve program performance.

## Exercise 3: Sorting Algorithms 🔄

Exercise 3 challenged me to write a Java program that sorts an array of integers using various sorting algorithms. It was an opportunity to explore the practical aspects of sorting and the user's role in choosing the sorting algorithm.

**Key Takeaways:**

* The user interface component, where the user selects the sorting algorithm, provided a valuable lesson in user interaction and program customization.
* Implementing different sorting algorithms, including Bubble Sort, Quick Sort, Insertion Sort, and Selection Sort, deepened my understanding of the mechanics behind these algorithms.

**Notes for Time Complexity for Sorting Algorithms:**

- Bubble Sort:
	- Best Case: O(n) - When the array is already sorted.
	- Worst Case: O(n^2) - When the array is sorted in reverse order.

- Quick Sort:
	- Best Case: O(n*log(n)) - Achieved when the pivot choice consistently divides the array into nearly equal parts.
	
	- Worst Case: O(n^2) - Occurs when the pivot choice is poor, and the array is almost sorted.

- Insertion Sort:
	- Best Case: O(n) - When the array is already sorted.
	- Worst Case: O(n^2) - When the array is sorted in reverse order.

- Selection Sort:
	- Best Case: O(n^2) - Regardless of the input, as it always makes n swaps.
	- Worst Case: O(n^2) - Similar to the best case.

I found that each sorting algorithm has its strengths and weaknesses, making it suitable for different scenarios. The ability to choose the appropriate sorting algorithm based on specific requirements is a crucial skill in programming.

In conclusion, Lab 1 expanded my knowledge of sorting and searching algorithms, object comparison, and the importance of user interaction in program design. These skills are fundamental for any programmer and will undoubtedly prove valuable in future projects. 🚀


## Learning Resources

Here are some additional resources that I found helpful during my learning journey:

- Bubble Sort [Bubble Sort in Plain English](https://youtu.be/uJLwnsLn0_Q?si=WC2gzM7OGI1I6K7o)
- Quick Sort [Learn Quick Sort in 13 minutes](https://youtu.be/Vtckgz38QHs?si=jZmJvsNAgxYgoBtq)
- Insertion Sort [Insertion Sort Algorithm Made Simple](https://youtu.be/nKzEJWbkPbQ?si=6Z1h-w0fh6MdJJsr)
- Selection Sort [Selection Sort Tutorial in Java: The Snail's Guide to Sorting](https://www.youtube.com/watch?v=dsqsnngsoD8)


These resources provided valuable insights and further explanations on the topics covered in this document.

**Author:** Roselyn Chan

*Document assisted by ChatGPT, a language model developed by OpenAI.*
