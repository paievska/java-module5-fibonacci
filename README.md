# Fibonacci sequence
In mathematics, **the Fibonacci sequence** is a sequence in which each number is the sum of the two preceding ones. 
Numbers that are part of the Fibonacci sequence are known as Fibonacci numbers, commonly denoted Fn .
The sequence commonly starts from 0 and 1, although some authors start the sequence from 1 and 1 or sometimes (as did Fibonacci) from 1 and 2.
Starting from 0 and 1, the first few values in the sequence are:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
## FibonacciDP class (dymanic method)
* **Space Complexity:** O(n), where n is the input parameter.
  This is because the memoization table *memo* takes up space to store values for each Fibonacci number up to n.
* **Time Complexity:** Typically O(n), but can be less if many values have already been computed and stored in *memo*.
  
![image](https://github.com/paievska/java-module5-finobacci/assets/71642076/f9801552-8473-4e5d-9dc1-a3d7e8c84558)
## FibonacciIterative class (iterative method)
* **Space Complexity:** O(1). In this approach, only a few variables are used to compute the current Fibonacci number.
* **Time Complexity:** O(n), where n is the input parameter. Each Fibonacci number in this version is computed in a fixed number of operations, depending on n.
  
![image](https://github.com/paievska/java-module5-finobacci/assets/71642076/4b4fe877-e599-49ad-b5db-4fd6feff16a5)
## FibonacciRecursive class (recursive method)
* **Space Complexity:** Typically O(n) due to the call stack, where n is the input parameter.
  Each recursive call requires saving context, thus increasing the number of stored stack frames.
* **Time Complexity:** Generally worse compared to other approaches. The time complexity of this version is typically the highest among the three since
  calculating each Fibonacci number involves repeated calculations for the same subproblems.
  The exact time complexity depends on the implementation and optimization strategies used.
  
![image](https://github.com/paievska/java-module5-finobacci/assets/71642076/060cf3f6-bb86-4af4-a90c-d3ef4085682e)
## UML classes diagram
![image](https://github.com/paievska/java-module5-finobacci/assets/71642076/75679a25-0197-443d-86df-c43dffef11c8)
