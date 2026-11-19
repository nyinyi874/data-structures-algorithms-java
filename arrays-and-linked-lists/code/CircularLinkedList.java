public class CircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    Node tail;

    void addFirst(int value) {
        Node n = new Node(value);
        if (tail == null) {
            tail = n;
            n.next = n;
        } else {
            n.next = tail.next;
            tail.next = n;
        }
    }

    void addLast(int value) {
        addFirst(value);
        tail = tail.next;
    }

    void deleteFirst() {
        if (tail == null)
            return;
        if (tail.next == tail)
            tail = null;
        else
            tail.next = tail.next.next;
    }

    boolean search(int value) {
        if (tail == null)
            return false;
        Node cur = tail.next;
        do {
            if (cur.data == value)
                return true;
            cur = cur.next;
        } while (cur != tail.next);
        return false;
    }

    void print() {
        if (tail == null) {
            System.out.println();
            return;
        }
        Node cur = tail.next;
        do {
            System.out.print(cur.data + " ");
            cur = cur.next;
        } while (cur != tail.next);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        System.out.print("List:          ");
        list.print();

        list.deleteFirst();
        System.out.print("Delete first:  ");
        list.print();

        System.out.println("Search 20: " + list.search(20));
    }
}
