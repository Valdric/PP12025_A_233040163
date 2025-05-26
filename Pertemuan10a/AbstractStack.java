package Pertemuan10a;

public class AbstractStack {
    protected int maxSize;
    protected int[] stackArray;
    protected int top;

    public AbstractStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack penuh, tidak bisa push!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack kosong, tidak bisa pop!");
            return 0; // Atau bisa lempar exception jika mau
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack kosong, tidak bisa peek!");
            return 0;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
