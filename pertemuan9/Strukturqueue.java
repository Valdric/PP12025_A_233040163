package pertemuan9;

public class Strukturqueue {
    private Node FRONT;
    private Node REAR;


    public boolean isEmpty() {
        return FRONT == null;
    }


    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }


    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa dequeue.");
        } else {
            FRONT = FRONT.getNext();

            if (FRONT == null) {
                REAR = null;
            }
        }
    }


    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }


    public int front() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return -1;
        }
        return FRONT.getData();
    }


    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
        } else {
            System.out.print("Isi queue: ");
            Node curNode = FRONT;
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
}
