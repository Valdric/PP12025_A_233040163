package pertemuan10;

public class StrukturStack {

    private int[] array;
    private int capacity;
    private int top;

    public StrukturStack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }


    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh, tidak bisa menambahkan data.");
        } else {
            array[++top] = data;
        }
    }

    // Tugas: Implementasi operasi pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak bisa pop.");
            return -1;
        } else {
            int removed = array[top--];
            return removed;
        }
    }


    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == capacity - 1;
    }


    public int size() {
        return top + 1;
    }


    public int top() {
        if (!isEmpty()) {
            return array[top];
        } else {
            return -1;
        }
    }


    public void printStack() {
        System.out.print("Elemen from TOP: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
