# Data Structures and Algorithms in Java

[![Java](https://img.shields.io/badge/Language-Java_8%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](#)
[![Practiced Entries](https://img.shields.io/badge/Practiced_Entries-92-00599C?style=for-the-badge)](#)
[![Topics](https://img.shields.io/badge/Topics-9_Categories-4CAF50?style=for-the-badge)](#)
[![Status](https://img.shields.io/badge/Status-Active_Learning-orange?style=for-the-badge)](#)

A collection of Java-based Data Structures and Algorithms implementations, problem-solving exercises and practice solutions. This repository documents my learning journey, different algorithmic approaches, and understanding of time and space complexity.

> [!NOTE]
> This repository contains Java implementations, problem-solving exercises and data structure demonstrations collected from multiple sources, including LeetCode, GeeksforGeeks, Java fundamentals, standard DSA exercises, coursework and independent practice. Not every implementation is associated with an online coding platform.

---

## 📌 About This Repository

This repository documents **92 indexed practice entries** organized across **9 foundational topics**. Rather than exclusively featuring competitive coding platform questions, these entries encompass a balanced learning blend including:
- **Coding platform problems** (verified challenges from LeetCode and GeeksforGeeks).
- **Custom data structure implementations** (handcrafted linked lists, doubly linked lists, and stacks).
- **Java fundamentals** (array manipulation, string immutability, and 2D matrices).
- **Java Collections Framework exercises** (utilizing standard classes like `ArrayList` and `LinkedList`).
- **Standard DSA exercises** (classic recursion recurrences, searching routines, and backtracking explorations).
- **Independent practice** (personal exercises and experimental implementations).

It represents an active learning log focused on understanding how algorithms work under the hood, analyzing time/space trade-offs, and practicing clean Java programming.

### Key Highlights
- **Hands-On Data Structure Implementations:** Custom implementations of foundational structures (such as custom Singly Linked Lists, Doubly Linked Lists, and Stacks via Linked List / ArrayList) alongside standard Java Collections Framework (`java.util.*`) practice.
- **Exploring Multiple Approaches:** Compares different problem-solving strategies where helpful (e.g., contrasting Kadane's algorithm with prefix sum and brute-force approaches for maximum subarray sum).
- **Complexity Aware:** Each entry is analyzed for its theoretical Time Complexity and Auxiliary Space Complexity to build stronger analytical habits.
- **Active Learning Progress:** A living log of practical problem-solving that evolves as new topics and challenges are explored.

---

## 📂 Repository Structure

```text
DATASTRUCTURES_AND_ALGORITHMS/
├── ARRAYLIST/              # Dynamic arrays, two-pointer techniques, container problems (9 files)
├── ARRAYS/                 # 1D/2D arrays, matrix transformations, Kadane's algorithm, rain water (19 files)
├── BACKTRACKING/           # N-Queens, Sudoku solver, subsets, permutations, grid paths (6 files)
├── LINKEDLIST/             # Singly & doubly linked lists, Floyd's cycle detection, merge sort (14 files)
├── RECURSION/              # Recursive recurrence, binary strings, divide-and-conquer power (13 files)
├── Searching_Algorithms/   # Binary search, linear search, 2D staircase search (3 files)
├── Sorting_Algorithms/     # Bubble, insertion, selection, merge sort, quick sort, counting sort (6 files)
├── STACKS/                 # Monotonic stacks, histogram area, stock span, path simplification (13 files)
├── STRINGS/                # String compression, palindrome, uppercase conversion, displacement (9 files)
└── .vscode/                # VS Code workspace settings
```

---

## 📊 Progress Tracker

| Topic | Category Folder | Practiced Entries | Status |
| :--- | :--- | :---: | :---: |
| ArrayList & Dynamic Arrays | [`ARRAYLIST/`](#arraylist) | 9 | Practiced |
| Arrays & Multi-Dimensional Matrices | [`ARRAYS/`](#arrays) | 19 | Practiced |
| Backtracking & State Exploration | [`BACKTRACKING/`](#backtracking) | 6 | Practiced |
| Linked Lists (Singly & Doubly) | [`LINKEDLIST/`](#linkedlist) | 14 | Practiced |
| Recursion & Divide and Conquer | [`RECURSION/`](#recursion) | 13 | Practiced |
| Stacks & Monotonic Stacks | [`STACKS/`](#stacks) | 13 | Practiced |
| Strings & Character Manipulation | [`STRINGS/`](#strings) | 9 | Practiced |
| Searching Algorithms | [`Searching_Algorithms/`](#searching_algorithms) | 3 | Covered |
| Sorting Algorithms | [`Sorting_Algorithms/`](#sorting_algorithms) | 6 | Covered |
| **Total** | **9 Categories** | **92 Entries** | **Active Learning** |

*Note: The 92 practiced entries include a blend of coding platform challenges, custom data structure implementations, and foundational Java language exercises.*

---

## 🚀 Upcoming Topics

The following topics represent the next milestones in my ongoing DSA roadmap:

- **Binary Trees and Binary Search Trees**
- **Heaps and Priority Queues**
- **Hashing**
- **Tries**
- **Graph Algorithms**
- **Greedy Algorithms**
- **Dynamic Programming**

> *Note: These subjects are planned for upcoming learning and implementation as my problem-solving journey progresses. They are not yet indexed in this repository.*

---

## 🎯 Learning Objectives

- **Algorithmic Patterns:** Build working intuition for foundational patterns including Two Pointers, Monotonic Stacks, Fast & Slow Pointers (Floyd's algorithm), Divide & Conquer, Backtracking, and Prefix Sums.
- **Complexity Trade-Offs:** Compare time and auxiliary space trade-offs between brute force explorations and optimized techniques.
- **Memory & Object Models:** Gain practical understanding of Java heap allocations, recursion depth on the call stack, and node pointer manipulation.
- **Consistent Problem Solving:** Develop disciplined coding habits, edge-case consideration, and clean implementation practices for technical interviews.

---

## 🧭 Topic Navigation

[ArrayList & Dynamic Arrays](#arraylist) • [Arrays & Multi-Dimensional Matrices](#arrays) • [Backtracking & State Exploration](#backtracking) • [Linked Lists (Singly & Doubly)](#linkedlist) • [Recursion & Divide and Conquer](#recursion) • [Stacks & Monotonic Stacks](#stacks) • [Strings & Character Manipulation](#strings) • [Searching Algorithms](#searching_algorithms) • [Sorting Algorithms](#sorting_algorithms)

---

## 📖 Comprehensive Problem Index

<a id="arraylist"></a>
### 📁 ArrayList & Dynamic Arrays (`ARRAYLIST/`)

Total Entries: **9**

| # | Problem / Concept | Source File | Source / Reference | Approach | Time Complexity | Auxiliary Space | Brief Explanation |
| :-: | :--- | :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | **ArrayList Operations & CRUD Fundamentals** | [Arraylist.java](ARRAYLIST/Arraylist.java) | Java Collections Framework | Dynamic array demonstration (add, get, remove, set, contains, size) | `O(1) amortized add/get/set; O(n) remove/contains` | `O(n) auxiliary` | Demonstrates internal dynamics of Java ArrayList, contrasting dynamic sizing with primitive arrays, and illustrates common CRUD operations. |
| 2 | **Find Maximum in ArrayList** | [FindMaximum.java](ARRAYLIST/FindMaximum.java) | Standard DSA Exercise | Linear scan with running maximum update | `O(n)` | `O(1)` | Iterates through the ArrayList updating the maximum element using Math.max(). |
| 3 | **Multi-Dimensional ArrayList (2D Dynamic Array)** | [MultiDimensional.java](ARRAYLIST/MultiDimensional.java) | Java Collections Framework | Nested ArrayLists (ArrayList<ArrayList<Integer>>) | `O(N * M) traversal` | `O(N * M) auxiliary` | Demonstrates creating, nesting, and traversing a 2D dynamic grid of elements using nested ArrayLists. |
| 4 | **Print ArrayList in Reverse Order** | [PrintReverse.java](ARRAYLIST/PrintReverse.java) | Standard DSA Exercise | Backward iteration from size-1 down to 0 | `O(n)` | `O(1)` | Traverses the ArrayList in reverse index order and prints each element to standard output. |
| 5 | **Sorting ArrayList (Ascending & Descending)** | [Sorting.java](ARRAYLIST/Sorting.java) | Java Collections Framework | Collections.sort() and Collections.reverseOrder() | `O(n log n)` | `O(n) auxiliary (TimSort buffer)` | Applies standard Collections.sort() for ascending order and Collections.reverseOrder() comparator for descending sorting. |
| 6 | **Swap Two Elements in ArrayList** | [SwapTwo.java](ARRAYLIST/SwapTwo.java) | Standard DSA Exercise | Index-based temporary variable swap using get() and set() | `O(1)` | `O(1)` | Exchanges elements at two specific index positions in an ArrayList using get() and set(). |
| 7 | **Container With Most Water** | [containerwith_mostWater.java](ARRAYLIST/containerwith_mostWater.java) | LeetCode #11 | Two Pointers (inward convergence) | `O(n)` | `O(1)` | Initializes two boundary pointers and greedily shifts the pointer with the smaller height while updating maximum trapped area. |
| 8 | **Pair Sum in Sorted ArrayList (Two Sum II)** | [pairSum_I.java](ARRAYLIST/pairSum_I.java) | LeetCode #167 | Two Pointers on sorted ArrayList | `O(n)` | `O(1)` | Uses left and right boundary pointers; increments left if sum is smaller than target and decrements right if sum exceeds target. |
| 9 | **Pair Sum in Sorted and Rotated ArrayList** | [pairSum_II.java](ARRAYLIST/pairSum_II.java) | GeeksforGeeks | Two Pointers with modular circular indexing after finding pivot | `O(n)` | `O(1)` | Locates pivot index where rotation breaks, then applies circular two-pointer traversal using modulo arithmetic. |

[Back to Top](#-topic-navigation)

<a id="arrays"></a>
### 📁 Arrays & Multi-Dimensional Matrices (`ARRAYS/`)

Total Entries: **19**

| # | Problem / Concept | Source File | Source / Reference | Approach | Time Complexity | Auxiliary Space | Brief Explanation |
| :-: | :--- | :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | **Array Basics & I/O Manipulation** | [Arrays.java](ARRAYS/Arrays.java) | Java Core | Declaration, Scanner input, direct indexing and update | `O(1) access/update` | `O(n) allocated buffer` | Demonstrates fixed-size primitive array allocation, taking user inputs via Scanner, and mutating array cells. |
| 2 | **Best Time to Buy and Sell Stock** | [Buy_Sell_stocks.java](ARRAYS/Buy_Sell_stocks.java) | LeetCode #121 | Single-pass Greedy / Running Minimum | `O(n)` | `O(1)` | Maintains lowest buy price observed so far and calculates maximum profit achievable by selling on each day. |
| 3 | **Matrix Diagonal Sum** | [DiagonalSum.java](ARRAYS/DiagonalSum.java) | LeetCode #1572 / Standard DSA Exercise | Single-loop primary and secondary diagonal accumulation | `O(n)` | `O(1)` | Computes sum of primary and secondary diagonals in an N x N matrix in a single loop, avoiding duplicate addition of center element. |
| 4 | **Check for Duplicates in Array** | [Duplicates_in_Array.java](ARRAYS/Duplicates_in_Array.java) | Independent Practice | Nested loop pair comparison | `O(n^2)` | `O(1)` | Explores adjacent/nested comparisons to detect whether any element appears more than once in the array. |
| 5 | **Find Largest and Smallest in Array** | [Largest_in_array.java](ARRAYS/Largest_in_array.java) | Standard DSA Exercise | Single-pass linear scan | `O(n)` | `O(1)` | Tracks both the minimum and maximum elements in a single traversal through the array. |
| 6 | **Maximum Subarray Sum - Brute Force** | [MaxSubArraySumI.java](ARRAYS/MaxSubArraySumI.java) | Standard DSA Exercise | Three nested loops (all subarrays generation) | `O(n^3)` | `O(1)` | Generates all possible subarrays and calculates the sum of each subarray using an innermost loop to track the maximum sum. |
| 7 | **Maximum Subarray Sum - Prefix Sum** | [MaxSubArraySumII.java](ARRAYS/MaxSubArraySumII.java) | Standard DSA Exercise | Prefix sum array precomputation | `O(n^2)` | `O(n)` | Precomputes prefix sums to query any subarray sum in O(1) time across two nested loops. |
| 8 | **Maximum Subarray Sum - Kadane's Algorithm** | [MaxSubArraySumIII.java](ARRAYS/MaxSubArraySumIII.java) | LeetCode #53 / Standard Algorithm | Kadane's Dynamic Programming Algorithm | `O(n)` | `O(1)` | Maintains a running current sum, resets negative running sums to 0, and updates overall maximum in a single pass. |
| 9 | **Print All Pairs in Array** | [Pairsin_Array.java](ARRAYS/Pairsin_Array.java) | Standard DSA Exercise | Two nested loops pair generation | `O(n^2)` | `O(1)` | Generates and prints all unique unordered pairs (arr[i], arr[j]) where i < j. |
| 10 | **Count Specific Number in 2D Array** | [PrintNumberof_Ns_inTDArray.java](ARRAYS/PrintNumberof_Ns_inTDArray.java) | Standard DSA Exercise | 2D matrix traversal with frequency counter | `O(rows * cols)` | `O(1)` | Traverses row by row through a 2D matrix to count occurrences of a target integer (e.g., 7). |
| 11 | **Reverse an Array In-Place** | [ReverseArray.java](ARRAYS/ReverseArray.java) | Standard DSA Exercise | Two pointers in-place swapping | `O(n)` | `O(1)` | Swaps elements from outermost positions moving inward until pointers meet. |
| 12 | **Search in Rotated Sorted Array** | [SearchRotatedSortedArray.java](ARRAYS/SearchRotatedSortedArray.java) | LeetCode #33 | Modified binary search with sorted half check | `O(log n)` | `O(1)` | Determines which half of the array is sorted and adjusts binary search bounds based on target position. |
| 13 | **Spiral Matrix Traversal** | [SpiralMatrix.java](ARRAYS/SpiralMatrix.java) | LeetCode #54 | Boundary simulation (top, right, bottom, left) | `O(m * n)` | `O(1)` | Prints 2D matrix in clockwise spiral order by contracting four boundary pointers (startRow, endRow, startCol, endCol). |
| 14 | **Print All Subarrays** | [SubArrays.java](ARRAYS/SubArrays.java) | Standard DSA Exercise | Three nested loops | `O(n^3)` | `O(1)` | Generates all contiguous subarrays from start index to end index and prints their elements. |
| 15 | **Sum of Elements in Second Row of Matrix** | [SumofNums_inSecondRow.java](ARRAYS/SumofNums_inSecondRow.java) | Standard DSA Exercise | Single-row 2D array traversal | `O(cols)` | `O(1)` | Sums all elements situated in index row 1 (the second row) of a 2D matrix. |
| 16 | **3Sum (Zero Sum Triplets)** | [ThreeSum.java](ARRAYS/ThreeSum.java) | LeetCode #15 | Three nested loops with HashSet deduplication | `O(n^3)` | `O(k) where k is unique triplets` | Finds all distinct triplets that sum to zero by generating candidate triplets, sorting them, and storing in a HashSet. |
| 17 | **Transpose of a Matrix** | [Transpose_of_Matrix.java](ARRAYS/Transpose_of_Matrix.java) | Standard DSA Exercise | Index reversal mapping (transpose[j][i] = matrix[i][j]) | `O(rows * cols)` | `O(rows * cols)` | Constructs and displays a new matrix where rows and columns of original matrix are swapped. |
| 18 | **Trapping Rain Water** | [TrappingRainWater.java](ARRAYS/TrappingRainWater.java) | LeetCode #42 | Prefix & suffix maximum boundary arrays | `O(n)` | `O(n)` | Precomputes left_max and right_max boundary heights, computing trapped water per column as min(left_max, right_max) - height. |
| 19 | **2D Matrix Creation & Linear Cell Search** | [TwoDimentionalArraysCreation.java](ARRAYS/TwoDimentionalArraysCreation.java) | Java Core | Nested loop cell-by-cell matrix search | `O(rows * cols)` | `O(rows * cols) allocation` | Reads 2D array dimensions and elements from Scanner and searches for target key cell by cell. |

[Back to Top](#-topic-navigation)

<a id="backtracking"></a>
### 📁 Backtracking & State Exploration (`BACKTRACKING/`)

Total Entries: **6**

| # | Problem / Concept | Source File | Source / Reference | Approach | Time Complexity | Auxiliary Space | Brief Explanation |
| :-: | :--- | :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | **Backtracking on Arrays (State Restoration)** | [BT_on_Arrays.java](BACKTRACKING/BT_on_Arrays.java) | Standard DSA Exercise | Recursive assignment with backtracking decrement | `O(n)` | `O(n) call stack` | Fills array recursively from 1 to n, and on backtracking unrolls by subtracting 2 from each cell. |
| 2 | **Permutations of a String** | [FindPermutations.java](BACKTRACKING/FindPermutations.java) | Standard DSA Exercise | Recursive backtracking by character extraction | `O(n * n!)` | `O(n) call stack` | Generates all permutations of a string by selecting each character and recursing on the remaining substring. |
| 3 | **Find All Subsets (Power Set)** | [FindSubsets.java](BACKTRACKING/FindSubsets.java) | Standard DSA Exercise | Pick / don't pick recursive branching | `O(2^n)` | `O(n) call stack` | At each character index, explores two recursive branches: including the character in current answer and excluding it. |
| 4 | **Grid Unique Paths** | [GridWays.java](BACKTRACKING/GridWays.java) | Standard DSA Exercise / LeetCode #62 | Recursive exploration (down and right paths) | `O(2^(n+m))` | `O(n+m) call stack` | Recursively counts total paths from top-left (0,0) to bottom-right (n-1, m-1) moving only down or right. |
| 5 | **N-Queens Problem** | [NQueens.java](BACKTRACKING/NQueens.java) | LeetCode #51 / Classic Problem | Backtracking with directional safety checks (vertical & diagonals) | `O(N!)` | `O(N^2) board + O(N) call stack` | Places queens row by row, checking column and diagonal safety constraints, backtracking when conflicts arise. |
| 6 | **Sudoku Solver** | [Sudoku.java](BACKTRACKING/Sudoku.java) | LeetCode #37 / Classic Problem | Backtracking with 3-way constraint validation (row, column, 3x3 grid) | `O(9^(empty cells))` | `O(1) auxiliary board + O(81) call stack` | Attempts placing digits 1-9 in empty cells, verifies row/col/grid safety, and backtracks upon encountering invalid configurations. |

[Back to Top](#-topic-navigation)

<a id="linkedlist"></a>
### 📁 Linked Lists (Singly & Doubly) (`LINKEDLIST/`)

Total Entries: **14**

| # | Problem / Concept | Source File | Source / Reference | Approach | Time Complexity | Auxiliary Space | Brief Explanation |
| :-: | :--- | :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | **Delete N Nodes After M Nodes** | [DeleteNafterM.java](LINKEDLIST/DeleteNafterM.java) | GeeksforGeeks | Pointer traversal with skip-M and delete-N logic | `O(L) where L is total nodes` | `O(1)` | Traverses M nodes, deletes following N nodes by updating next pointers, repeating until end of list. |
| 2 | **Detect Cycle in Linked List** | [DetectCycle.java](LINKEDLIST/DetectCycle.java) | LeetCode #141 | Floyd's Cycle Finding Algorithm (Tortoise & Hare) | `O(n)` | `O(1)` | Uses slow pointer moving 1 step and fast pointer moving 2 steps; if they meet, a cycle exists. |
| 3 | **Doubly Linked List Implementation & Reversal** | [DoublyLinkedList.java](LINKEDLIST/DoublyLinkedList.java) | Data Structures Implementation | Two-way node links (next & prev), head/tail pointers, pointer-reversal loop | `O(1) add/remove at ends; O(n) reversal` | `O(1)` | Implements full Doubly Linked List with addFirst, addLast, removeFirst, removeLast, and in-place reversal. |
| 4 | **Remove Nth Node From End of List** | [Find_RemoveNthNode.java](LINKEDLIST/Find_RemoveNthNode.java) | LeetCode #19 | Size calculation and forward traversal to (size - n)th node | `O(L)` | `O(1)` | Calculates list size, navigates to the predecessor of the target node, and unlinks it. |
| 5 | **Intersection of Two Linked Lists** | [IntersectionofTwoLL.java](LINKEDLIST/IntersectionofTwoLL.java) | LeetCode #160 | Nested traversal / node reference matching | `O(m * n)` | `O(1)` | Iterates through list 1 and compares each node reference with nodes of list 2 to locate first shared node. |
| 6 | **Singly Linked List Implementation & Core Operations** | [LinkedList.java](LINKEDLIST/LinkedList.java) | Data Structures Implementation | Pointer linking, iterative/recursive search, 3-pointer in-place reversal | `O(1) add/remove first; O(n) search/reverse` | `O(1) auxiliary` | Custom Singly Linked List supporting insertion at head/tail/index, removal, iterative and recursive search, and in-place reversal. |
| 7 | **Java Collections Framework LinkedList Usage** | [LinkedList_inJFC.java](LINKEDLIST/LinkedList_inJFC.java) | Java Collections Framework | Standard library java.util.LinkedList API demonstration | `O(1) addFirst/addLast/removeFirst/removeLast` | `O(n)` | Demonstrates built-in doubly-linked list class operations from java.util.LinkedList. |
| 8 | **Merge k Sorted Lists** | [MergeKsortedLists.java](LINKEDLIST/MergeKsortedLists.java) | LeetCode #23 | Iterative pairwise 2-list merge | `O(k * N) where N is total nodes` | `O(1) auxiliary` | Iteratively merges array of k sorted linked lists two at a time using two-pointer sorted merging. |
| 9 | **Merge Sort on Linked List** | [MergeSort_LL.java](LINKEDLIST/MergeSort_LL.java) | LeetCode #148 / Standard Algorithm | Divide and Conquer (fast/slow midpoint + recursive sorted merge) | `O(n log n)` | `O(log n) call stack` | Splits linked list at mid using fast and slow pointers, sorts sublists recursively, and merges them in sorted order. |
| 10 | **Segregate Even and Odd Nodes (by Value)** | [OddEvenLL.java](LINKEDLIST/OddEvenLL.java) | GeeksforGeeks | Separate pointer chains for even and odd values with concatenation | `O(n)` | `O(1)` | Partitions list into even-valued nodes and odd-valued nodes based on value parity (val % 2 == 0), linking the two chains together. |
| 11 | **Palindrome Linked List** | [Palindrome.java](LINKEDLIST/Palindrome.java) | LeetCode #234 | Midpoint search (slow/fast), reverse second half, two-pointer comparison | `O(n)` | `O(1)` | Finds midpoint, reverses second half in-place, and checks symmetry by comparing left and right halves. |
| 12 | **Detect and Remove Loop in Linked List** | [RemoveCycle.java](LINKEDLIST/RemoveCycle.java) | GeeksforGeeks / LeetCode #142 variation | Floyd's Cycle Finding + Loop origin detection and unlinking | `O(n)` | `O(1)` | Detects cycle using fast/slow pointers, finds cycle starting node by resetting slow to head, and breaks the cycle loop. |
| 13 | **Swap Two Nodes by Value (without swapping data)** | [SwappingNodesLL.java](LINKEDLIST/SwappingNodesLL.java) | GeeksforGeeks | Locating node pointers and rewiring predecessors and next links | `O(n)` | `O(1)` | Locates two target nodes (x, y) along with their previous pointers, and rewires their next pointers to swap their positions without touching data. |
| 14 | **Reorder List (Zig-Zag Reorder)** | [ZigZagLL.java](LINKEDLIST/ZigZagLL.java) | LeetCode #143 / Standard DSA Exercise | Midpoint split, reverse second half, alternating merge | `O(n)` | `O(1)` | Splits list at center, reverses second half, and interweaves nodes alternately from left and right halves. |

[Back to Top](#-topic-navigation)

<a id="recursion"></a>
### 📁 Recursion & Divide and Conquer (`RECURSION/`)

Total Entries: **13**

| # | Problem / Concept | Source File | Source / Reference | Approach | Time Complexity | Auxiliary Space | Brief Explanation |
| :-: | :--- | :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | **Binary Strings without Consecutive 1s** | [BinaryStrings.java](RECURSION/BinaryStrings.java) | Standard DSA Exercise | Recursive branching with last-placed bit state tracking | `O(2^n)` | `O(n) call stack` | Generates all binary strings of length n where '1' is never followed by another '1'. |
| 2 | **Check if Array is Sorted Recursively** | [CheckSortedArray.java](RECURSION/CheckSortedArray.java) | Standard DSA Exercise | Recursive linear scan comparing adjacent indices | `O(n)` | `O(n) call stack` | Validates if arr[i] <= arr[i+1] and recursively evaluates rest of array. |
| 3 | **Factorial of a Number** | [Factorial.java](RECURSION/Factorial.java) | Standard DSA Exercise | Classic linear recursion: n * Fact(n - 1) | `O(n)` | `O(n) call stack` | Calculates factorial of non-negative integer n with base case Fact(0) = 1. |
| 4 | **Nth Fibonacci Number** | [Fibonacci.java](RECURSION/Fibonacci.java) | Standard DSA Exercise | Multiple tree recursion: fib(n-1) + fib(n-2) | `O(2^n)` | `O(n) call stack` | Calculates the nth Fibonacci number using straightforward tree recursion. |
| 5 | **Sum of First N Natural Numbers** | [FirstNnaturalnum.java](RECURSION/FirstNnaturalnum.java) | Standard DSA Exercise | Linear recursion: n + SumOfN(n - 1) | `O(n)` | `O(n) call stack` | Recursively computes sum from 1 up to n. |
| 6 | **First Occurrence of Key in Array** | [FirstOccurence.java](RECURSION/FirstOccurence.java) | Standard DSA Exercise | Forward recursive search from index 0 | `O(n)` | `O(n) call stack` | Checks if element matches key at current index, recursing forward if not found. |
| 7 | **Friends Pairing Problem** | [FriendsPairing.java](RECURSION/FriendsPairing.java) | GeeksforGeeks | Recursive recurrence: f(n) = f(n-1) + (n-1)*f(n-2) | `O(2^n)` | `O(n) call stack` | Finds number of ways n friends can remain single or be paired up. |
| 8 | **Last Occurrence of Key in Array** | [LastOccurence.java](RECURSION/LastOccurence.java) | Standard DSA Exercise | Look-ahead recursion (evaluates remainder of array first) | `O(n)` | `O(n) call stack` | Recurses down to end of array first; if found later, returns that index, otherwise inspects current index. |
| 9 | **Print Numbers in Decreasing Order (N down to 1)** | [PrintDecreasingOrder.java](RECURSION/PrintDecreasingOrder.java) | Standard DSA Exercise | Tail-recursive printing before recursive call | `O(n)` | `O(n) call stack` | Prints current number n and recurses with n - 1 until reaching base case 1. |
| 10 | **Print Numbers in Increasing Order (1 up to N)** | [PrintIncreasingOrder.java](RECURSION/PrintIncreasingOrder.java) | Standard DSA Exercise | Head-recursive printing after recursive call | `O(n)` | `O(n) call stack` | Recurses down to base case 1 first and prints values on the unwinding stack. |
| 11 | **Remove Duplicate Characters from String** | [RemoveDuplicates.java](RECURSION/RemoveDuplicates.java) | Standard DSA Exercise | Recursion with boolean lookup array of size 26 | `O(n)` | `O(n) call stack + O(1) map` | Recurses over string building StringBuilder, skipping characters marked true in boolean presence array. |
| 12 | **Tiling Problem (2 x n Board with 2 x 1 Tiles)** | [Tiling.java](RECURSION/Tiling.java) | GeeksforGeeks / Standard DSA Exercise | Recursive divide and conquer: f(n) = f(n-1) + f(n-2) | `O(2^n)` | `O(n) call stack` | Counts combinations to tile a 2 x n floor with 2 x 1 tiles placed vertically or horizontally. |
| 13 | **Power of a Number (Pow(x, n))** | [xPowern.java](RECURSION/xPowern.java) | Standard DSA Exercise / LeetCode #50 | O(n) linear recursion and O(log n) binary exponentiation | `O(log n) for OptimizedPower; O(n) for power` | `O(log n) call stack` | Implements both brute-force linear recursion and optimized divide-and-conquer exponentiation (half-power squaring). |

[Back to Top](#-topic-navigation)

<a id="stacks"></a>
### 📁 Stacks & Monotonic Stacks (`STACKS/`)

Total Entries: **13**

| # | Problem / Concept | Source File | Source / Reference | Approach | Time Complexity | Auxiliary Space | Brief Explanation |
| :-: | :--- | :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | **Check Palindrome LinkedList Using Stack** | [checkPalindrome.java](STACKS/checkPalindrome.java) | Standard DSA Exercise | Two-pass comparison using Stack LIFO property | `O(n)` | `O(n)` | Pushes all characters of LinkedList onto a Stack, then iterates again comparing list elements with stack top. |
| 2 | **Decode String (k[encoded_string])** | [Decode.java](STACKS/Decode.java) | LeetCode #394 / GeeksforGeeks | Single Character Stack (Stack<Character>) with bracket expansion | `O(N) where N is decoded string length` | `O(N) stack` | Uses a single character stack to push characters until ']', then pops to reconstruct substring and multiplier count, pushing expanded characters back onto the stack. |
| 3 | **Find Duplicate Parentheses** | [DuplicateParentheses.java](STACKS/DuplicateParentheses.java) | GeeksforGeeks | Character Stack counting intermediate elements between brackets | `O(n)` | `O(n)` | Pushes characters until ')', then pops until matching '('. If popped count < 1, duplicate parentheses exist. |
| 4 | **Largest Rectangle in Histogram** | [MaxAreaInHistogram.java](STACKS/MaxAreaInHistogram.java) | LeetCode #84 | Monotonic Stack (Next Smaller Left & Next Smaller Right arrays) | `O(n)` | `O(n)` | Calculates boundaries using monotonic stacks to find nearest smaller bars to left and right, deriving width and maximum area. |
| 5 | **Next Greater Element (to the Right)** | [NextGreaterElement.java](STACKS/NextGreaterElement.java) | GeeksforGeeks / Standard DSA Exercise | Monotonic Decreasing Stack (Right to Left traversal) | `O(n)` | `O(n)` | Traverses array from right to left, popping smaller elements from stack so top always holds next greater element. |
| 6 | **Push at Bottom of Stack** | [PushAtBottom.java](STACKS/PushAtBottom.java) | Standard DSA Exercise | Call stack recursion to reach empty stack, then push | `O(n)` | `O(n) call stack` | Pops all elements recursively, pushes the target element when empty, and pushes back popped elements upon return. |
| 7 | **Reverse a Stack Using Recursion** | [ReverseStack.java](STACKS/ReverseStack.java) | Standard DSA Exercise / GeeksforGeeks | Recursion with PushAtBottom helper | `O(n^2)` | `O(n) call stack` | Pops top element, recursively reverses remaining stack, and inserts popped element at the bottom. |
| 8 | **Reverse a String Using Stack** | [ReverseString.java](STACKS/ReverseString.java) | Standard DSA Exercise | Push characters onto Stack, pop into StringBuilder | `O(n)` | `O(n)` | Pushes all string characters onto stack and unloads them in reverse order. |
| 9 | **Simplify Path (Canonical Unix Path)** | [SimplifyPath.java](STACKS/SimplifyPath.java) | LeetCode #71 | String split by '/' with Stack directory navigation | `O(n)` | `O(n)` | Splits path by '/', ignores '.' and empty tokens, pops for '..', pushes directory names, and constructs canonical string. |
| 10 | **Stack Implementation via ArrayList** | [StackArrayList.java](STACKS/StackArrayList.java) | Data Structures Implementation | Dynamic array wrapper with top index at list.size() - 1 | `O(1) amortized push, pop, peek` | `O(n)` | Builds custom generic-ready Stack class using internal ArrayList for dynamic capacity. |
| 11 | **Stack Implementation via Singly Linked List** | [StackLL.java](STACKS/StackLL.java) | Data Structures Implementation | Linked List with head as top of stack | `O(1) push, pop, peek` | `O(n)` | Implements custom Stack data structure where push inserts at head and pop deletes from head in O(1). |
| 12 | **Online Stock Span** | [StockSpan.java](STACKS/StockSpan.java) | LeetCode #901 / GeeksforGeeks | Monotonic Stack storing day indices | `O(n)` | `O(n)` | Uses stack of indices to find previous day with higher price, calculating span as current_index - prev_high_index. |
| 13 | **Valid Parentheses** | [ValidParentheses.java](STACKS/ValidParentheses.java) | LeetCode #20 | Stack of opening brackets with matching closing validation | `O(n)` | `O(n)` | Pushes opening brackets '(', '{', '[' and verifies that closing brackets match corresponding top element. |

[Back to Top](#-topic-navigation)

<a id="strings"></a>
### 📁 Strings & Character Manipulation (`STRINGS/`)

Total Entries: **9**

| # | Problem / Concept | Source File | Source / Reference | Approach | Time Complexity | Auxiliary Space | Brief Explanation |
| :-: | :--- | :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | **Count Lowercase Vowels in String** | [CountLowerCaseVowels.java](STRINGS/CountLowerCaseVowels.java) | Standard DSA Exercise | Single-pass character iteration and vowel condition check | `O(n)` | `O(1)` | Iterates through string checking whether character equals 'a', 'e', 'i', 'o', or 'u', incrementing counter. |
| 2 | **Lexicographically Largest String** | [LargestString.java](STRINGS/LargestString.java) | Standard DSA Exercise | Linear scan with String.compareTo() | `O(N * L) where L is string length` | `O(1)` | Finds lexicographically greatest string in an array using Java compareTo() method. |
| 3 | **Valid Palindrome String** | [Palindrome.java](STRINGS/Palindrome.java) | Standard DSA Exercise | Two pointers from boundaries comparing symmetric characters | `O(n)` | `O(1)` | Compares charAt(i) with charAt(n - 1 - i) up to n/2; returns false on mismatch. |
| 4 | **Shortest Path / Displacement from Direction String** | [ShortestPath.java](STRINGS/ShortestPath.java) | Standard DSA Exercise | Cartesian coordinate tracking (X, Y) and Euclidean distance formula | `O(n)` | `O(1)` | Simulates displacement along Cartesian coordinates from 'N', 'S', 'E', 'W' steps and computes sqrt(x^2 + y^2). |
| 5 | **String Compression (Run-Length Encoding)** | [StringCompression.java](STRINGS/StringCompression.java) | LeetCode #443 / Standard DSA Exercise | Two Pointers / consecutive character count aggregation | `O(n)` | `O(n) for resulting string` | Counts contiguous identical characters and appends character and count (if > 1) to result string. |
| 6 | **String Basics, Immutability & Operations** | [StringDeclaration.java](STRINGS/StringDeclaration.java) | Java Core | Declaration, concatenation, length, char array conversion | `O(1) to O(n) concatenation` | `O(n)` | Demonstrates string creation, immutability concepts, concatenation, and indexing in Java. |
| 7 | **Custom Substring Implementation** | [Substring.java](STRINGS/Substring.java) | Java Core / Standard DSA Exercise | Character collection from start index to end index - 1 | `O(k) where k = ei - si` | `O(k)` | Implements manual substring extraction from index si to ei and contrasts with Java standard str.substring(). |
| 8 | **Convert Letters to Uppercase (Title Case / Capitalize Words)** | [UppercaseConvertion.java](STRINGS/UppercaseConvertion.java) | Standard DSA Exercise | StringBuilder with character lookahead following spaces | `O(n)` | `O(n)` | Capitalizes first letter of every word separated by spaces using StringBuilder. |
| 9 | **StringBuilder Fundamentals & Append Demonstration** | [stringbuilder.java](STRINGS/stringbuilder.java) | Java Core | Mutable char buffer appending 'a' through 'z' | `O(26) ≈ O(1)` | `O(1) auxiliary` | Demonstrates efficient string building without creating intermediate immutable string objects. |

[Back to Top](#-topic-navigation)

<a id="searching_algorithms"></a>
### 📁 Searching Algorithms (`Searching_Algorithms/`)

Total Entries: **3**

| # | Problem / Concept | Source File | Source / Reference | Approach | Time Complexity | Auxiliary Space | Brief Explanation |
| :-: | :--- | :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | **Binary Search** | [BinarySearch.java](Searching_Algorithms/BinarySearch.java) | Standard Algorithm | Divide and Conquer / Iterative two-pointer half elimination | `O(log n)` | `O(1)` | Iteratively divides search interval in half by comparing middle element with target on sorted array. |
| 2 | **Linear Search** | [LinearSearch.java](Searching_Algorithms/LinearSearch.java) | Standard Algorithm | Sequential scan through array elements | `O(n)` | `O(1)` | Iterates from index 0 to n-1 checking equality with target key; returns index or -1 if not found. |
| 3 | **Search in Row-wise & Column-wise Sorted Matrix (Staircase Search)** | [Searching_in_Sortedmatrix.java](Searching_Algorithms/Searching_in_Sortedmatrix.java) | LeetCode #240 / Standard Algorithm | Staircase search (top-right corner start) | `O(n + m)` | `O(1)` | Starts at top-right corner (0, m-1); moves left if key is smaller and down if key is greater. |

[Back to Top](#-topic-navigation)

<a id="sorting_algorithms"></a>
### 📁 Sorting Algorithms (`Sorting_Algorithms/`)

Total Entries: **6**

| # | Problem / Concept | Source File | Source / Reference | Approach | Time Complexity | Auxiliary Space | Brief Explanation |
| :-: | :--- | :--- | :--- | :--- | :---: | :---: | :--- |
| 1 | **Bubble Sort with Early Exit Optimization** | [BubbleSort.java](Sorting_Algorithms/BubbleSort.java) | Standard Algorithm | Adjacent element swapping with swapped-flag early exit | `O(n^2) worst/avg, O(n) best case` | `O(1)` | Repeatedly steps through list, swaps adjacent out-of-order elements, terminating early if pass made zero swaps. |
| 2 | **Counting Sort** | [CountingSort.java](Sorting_Algorithms/CountingSort.java) | Standard Algorithm | Non-comparative frequency counting array | `O(n + k) where k is max element value` | `O(k)` | Finds maximum value, tallies frequency of each element in a count array, and overwrites input array in order. |
| 3 | **Insertion Sort** | [InsertionSort.java](Sorting_Algorithms/InsertionSort.java) | Standard Algorithm | Incremental insertion into sorted prefix | `O(n^2) worst/avg, O(n) best case` | `O(1)` | Picks elements one by one and inserts them into their correct position in already sorted subarray to the left. |
| 4 | **Merge Sort** | [MergeSort.java](Sorting_Algorithms/MergeSort.java) | Standard Algorithm | Divide and Conquer (recursive split & two-pointer merge) | `O(n log n)` | `O(n) auxiliary merge buffer` | Divides array into halves at midpoint, recursively sorts halves, and merges sorted sub-arrays into temporary array. |
| 5 | **Quick Sort** | [QuickSort.java](Sorting_Algorithms/QuickSort.java) | Standard Algorithm | Divide and Conquer with Lomuto Partition Scheme (last element pivot) | `O(n log n) average, O(n^2) worst case` | `O(log n) call stack` | Selects last element as pivot, partitions smaller elements to left and larger to right, and recurses on partitions. |
| 6 | **Selection Sort** | [SelectionSort.java](Sorting_Algorithms/SelectionSort.java) | Standard Algorithm | Minimum element selection and swap | `O(n^2)` | `O(1)` | Finds minimum element from unsorted remainder and swaps it with first element of unsorted part in each pass. |

[Back to Top](#-topic-navigation)

---

## 💻 How to Compile and Run

All programs are written in standard Java and can be executed using any Java SE Development Kit (JDK 8+).

### Compile and Run via Terminal / Command Prompt
Navigate to the project root directory and execute:

```bash
# Navigate to topic directory and compile a specific file:
javac ARRAYS/TrappingRainWater.java

# Run the compiled class:
java ARRAYS.TrappingRainWater
```

For files with package declarations (e.g. `package BackTracking;`), compile from the project root:

```bash
javac BACKTRACKING/NQueens.java
java BackTracking.NQueens
```

---

## 👤 Author & Journey

- **Repository:** Data Structures and Algorithms in Java
- **Author:** Sri Chaitanya
- **Language:** Java
- **Status:** Active Practice & Continuous Learning
