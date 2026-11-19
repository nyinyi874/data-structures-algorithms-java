class Node {
    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
        next = null;
    }
}

public class SinglyLinkedList {

    Node head;

    public void insertFirst(Object data) {
        Node toAdd = new Node(data);
        toAdd.next = head;
        head = toAdd;
    }

    public void insertLast(Object data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = toAdd;

    }

    public void insertBetween(Object target, Object data) {
        Node cur = head;
        while (cur != null) {
            if (cur.data == target) {
                Node toAdd = new Node(data);
                toAdd.next = cur.next;
                cur.next = toAdd;
                break;
            }
            cur = cur.next;
        }

    }

    public Node find(Object data) {
        Node cur = head;
        int index = 0;
        while (cur != null) {
            if (cur.data == data) {
                System.out.println("Found " + data + " at index " + index);
                return cur;
            }
            cur = cur.next;
            index++;
        }
        System.out.println("Not Found");
        return null;

    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            System.out.println("Deleted First : " + head.data);
            
        }

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted : " + head.data);
            head = null;
            return;
        }
        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        System.out.println("Deleted : " + cur.next.data);
        cur.next = null;
    }

    public void deleteBetween(Object target) {
        if (head == null) {
            System.out.println("There is nothing to delete");
            return;
        }
        if (head.data == target) {
            System.out.println("Deleted : " + head.data);
            head = head.next;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.data == target) {
                System.out.println("Deleted : " + cur.next.data);
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
    }

    public void printAllNodes() {
        Node cur = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (cur != null) {
            sb.append(cur.data);
            if (cur.next != null) {
                sb.append(",");
            }
            cur = cur.next;
        }
        sb.append("]");
        System.out.println(sb.toString());

    }
}
class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

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
