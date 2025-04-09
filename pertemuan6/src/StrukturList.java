package PP12025.src.pertemuan6.src;
public class StrukturList {
    Node head;

    public StrukturList() {
        head = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void removeHead() {
        if (head == null) {
            System.out.println("List kosong, tidak bisa hapus head");
        } else {
            Node temp = head;
            head = head.next;
            dispose(temp);
        }
    }

    public void dispose(Node temp) {
        temp.next = null;
        temp = null;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
