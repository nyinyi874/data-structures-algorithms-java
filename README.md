# Sorting Algorithms in Java

This folder contains Java implementations of common sorting algorithms.

## Time & Space Complexity

| Algorithm | Best Case | Average Case | Worst Case | Space Complexity |
| :--- | :---: | :---: | :---: | :---: |
| **Bubble Sort** | $O(n)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ |
| **Insertion Sort** | $O(n)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ |
| **Selection Sort** | $O(n^2)$ | $O(n^2)$ | $O(n^2)$ | $O(1)$ |
| **Merge Sort** | $O(n \log n)$ | $O(n \log n)$ | $O(n \log n)$ | $O(n)$ |
| **Quick Sort** | $O(n \log n)$ | $O(n \log n)$ | $O(n^2)$ | $O(\log n)$ |
| **Shell Sort** | $O(n \log n)$ | $O(n \log^2 n)$ | $O(n^2)$ | $O(1)$ |

### Notes
* **Bubble Sort:** Best case is $O(n)$ only when optimized with a `swapped` flag.
* **Shell Sort:** Average and worst-case complexities depend on the chosen gap sequence.
* **Quick Sort:** Worst case $O(n^2)$ occurs when the pivot choice is poor (e.g., already sorted array with first/last element as pivot).
