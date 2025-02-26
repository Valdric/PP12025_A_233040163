package pertemuan4;

// Latihan 2: Kelas StrukturList
class StrukturList {
    private Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void addMid(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.getNext();
        }
        if (temp == null) return;
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
