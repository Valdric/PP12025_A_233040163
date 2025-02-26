package pertemuan4;

// Tugas 1: StrukturList untuk bilangan pecahan
class StrukturListDouble {
    private class Node {
        private double data;
        private Node next;

        public Node(double data) {
            this.data = data;
            this.next = null;
        }

        public double getData() {
            return data;
        }

        public void setData(double data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;

    public void addFirst(double data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void addLast(double data) {
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

    public void addMid(double data, int index) {
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
