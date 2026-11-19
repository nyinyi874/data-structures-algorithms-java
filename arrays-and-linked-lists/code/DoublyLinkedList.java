class DNode {
    Object data;
    DNode prev;
    DNode next;

    public DNode(Object data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

//Doubly LinkedList class 
class DoublyLinkedList {
    DNode head;
    DNode tail;

    public  void insertFirst(Object data){
        DNode toAdd = new DNode(data);
        if (head == null){
            head = toAdd;
            tail = toAdd;
        }
        else{
            toAdd.next = head;
            head.prev = toAdd;
            head = toAdd;
        }
    }

    public void insertLast(Object data){
        DNode toAdd = new DNode(data);
        if (head == null){
            head = toAdd;
            tail = toAdd;
        }
        else{
            tail.next = toAdd;
            toAdd.prev = tail;
            tail = toAdd;
        }
    }
  
    public void insertBetween(Object target , Object data){
       DNode cur = head;
        while (cur != null) {
            if (cur.data.equals(data)){
                DNode toAdd = new DNode(data);
                toAdd.next = cur.next;
                toAdd.prev = cur;
                if (cur.next != null){
                    cur.next.prev = toAdd;
                }else{
                    tail = toAdd;
                }
                cur.next = toAdd;
            }
            cur = cur.next;
        }
        System.out.println("Target node " + target + " not found. Insert failed.");
    }


    public DNode find(Object data) {
        DNode current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(data)) {
                System.out.println("Found " + data + " at index " + index);
                return current;
            }
            current = current.next;
            index++;
        }
        System.out.println(data + " not found.");
        return null;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        System.out.println("Deleted: " + head.data);
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // list became empty
        }
    }
  
    public void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        System.out.println("Deleted: " + tail.data);
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null; // list became empty
        }
    }

    public void deleteBetween(Object target) {
        DNode current = head;
        while (current != null) {
            if (current.data.equals(target)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // was the head
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev; // was the tail
                }
                System.out.println("Deleted: " + current.data);
                return;
            }
            current = current.next;
        }
        System.out.println(target + " not found. Delete failed.");
    }

    public void printAllNodes() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        DNode current = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (current != null) {
            sb.append(current.data);
            if (current.next != null)
                sb.append(" <-> ");
            current = current.next;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public void printAllNodesReverse() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        DNode current = tail;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (current != null) {
            sb.append(current.data);
            if (current.prev != null)
                sb.append(" <-> ");
            current = current.prev;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
class MainDouble {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("=== Insert Last: A, B, C, D, E ===");
        list.insertLast("A");
        list.insertLast("B");
        list.insertLast("C");
        list.insertLast("D");
        list.insertLast("E");
        list.printAllNodes();

        System.out.println("\n=== Insert First: Z ===");
        list.insertFirst("Z");
        list.printAllNodes();

        System.out.println("\n=== Insert Between: insert F after C ===");
        list.insertBetween("C", "F");
        list.printAllNodes();

        System.out.println("\n=== Find C ===");
        list.find("C");

        System.out.println("\n=== Print Reverse (using prev links) ===");
        list.printAllNodesReverse();

        System.out.println("\n=== Delete First ===");
        list.deleteFirst();
        list.printAllNodes();

        System.out.println("\n=== Delete Last ===");
        list.deleteLast();
        list.printAllNodes();

        System.out.println("\n=== Delete Between: delete F ===");
        list.deleteBetween("F");
        list.printAllNodes();
    }
}
