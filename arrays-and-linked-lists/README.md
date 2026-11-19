# Arrays and Linked Lists in Java

## Implementations (`code/`)
* `ArrayOperations.java`
* `DynamicArray.java`
* `SinglyLinkedList.java`
* `DoublyLinkedList.java`
* `CircularLinkedList.java`

## Time Complexity Comparison

| Operation | Array | Linked List |
| :--- | :---: | :---: |
| **Access by index** | $O(1)$ | $O(n)$ |
| **Insert at start** | $O(n)$ | $O(1)$ |
| **Insert at end** | $O(1)$ *(if space)* | $O(n)$, or $O(1)$ with a tail pointer |
| **Delete at start** | $O(n)$ | $O(1)$ |
| **Search** | $O(n)$ | $O(n)$ |
