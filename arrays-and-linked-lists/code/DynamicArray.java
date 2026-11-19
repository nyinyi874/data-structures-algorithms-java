public class DynamicArray {
    int[] data;
    int size;

    DynamicArray(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    void add(int value) {
        if (size == data.length)
            resize();
        data[size++] = value;
    }

    void resize() {
        int[] bigger = new int[data.length * 2];
        for (int i = 0; i < size; i++)
            bigger[i] = data[i];
        data = bigger;
    }

    int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);
        return data[index];
    }

    void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);
        for (int i = index; i < size - 1; i++)
            data[i] = data[i + 1];
        size--;
    }

    int size() {
        return size;
    }

    void print() {
        for (int i = 0; i < size; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArray list = new DynamicArray(2);
        for (int i = 1; i <= 6; i++)
            list.add(i * 10);
        System.out.print("After adding 6 items: ");
        list.print();
        System.out.println("Size: " + list.size() + ", Capacity: " + list.data.length);

        list.remove(1);
        System.out.print("After remove(1):      ");
        list.print();
        System.out.println("get(2): " + list.get(2));
    }
}
