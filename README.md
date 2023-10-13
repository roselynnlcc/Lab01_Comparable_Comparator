# Lab 1: Comparable and Comparator Interfaces

## Background

In this assignment, ways to sort objects are explored using the Comparable and Comparator interfaces.

- The Comparable interface provides a default way to compare two objects of the same type, by implementing the compareTo method.
- The Comparator interface allows objects to be compared in multiple ways, by implementing the compare method.
  
Note: that the `compareTo` method should only be used to sort instances of the same class, while the `compare` method can be used to compare instances of different classes.

## Exercise 1

### Task

1. A class `Student` has been implemented with the fields `name` and `age`.
2. The Comparable and Comparator interfaces have been implemented to compare students based on their `name` and `age`.
   - Both the Comparable and Comparator interfaces are implemented in the `Student` class to allow for two different ways to compare students.
   - The `compareTo` method, defined by the Comparable interface, compares students based on their `name`.
   - The `compare` method, defined by the Comparator interface, compares students based on their `age`. If the ages are equal, it is then compared based on their `name`.
3. To test the implementation, a list of Student objects is created and sorted using the `Collections.sort` method.

## Exercise 2

### Task

A static method `binarySearch` has been implemented that takes a sorted list of integer objects and an integer target and returns the index of the target in the list if it exists, or -1 if it doesn't.

## Exercise 3

### Task

A Java program has been written to sort an array of integers using one of four different sorting algorithms (Bubble Sort, Quick Sort, Insertion Sort, or Selection Sort).

- The program first presents a prompt for the user to choose a sorting algorithm from a list of four options.
- The selected algorithm then sorts the given array of integers.
- Before and after sorting, the contents of the array are output in the form of a string.

## Author

- Roselyn Chan