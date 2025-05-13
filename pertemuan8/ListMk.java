package pertemuan8;

public class ListMk {
    Node head;

    // Tambah di awal
    public void addHead(Matakuliah mk) {
        head = new Node(mk, head);
    }

    // Tambah di akhir
    public void addTail(Matakuliah mk) {
        Node newNode = new Node(mk, null);
        if (head == null) {
            head = newNode;
        } else {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = newNode;
        }
    }

    // Tambah di tengah posisi ke-n
    public void addMiddle(Matakuliah mk, int pos) {
        if (pos <= 0) {
            addHead(mk);
        } else {
            Node pointer = head;
            for (int i = 1; i < pos && pointer != null; i++) {
                pointer = pointer.next;
            }
            if (pointer != null) {
                pointer.next = new Node(mk, pointer.next);
            } else {
                addTail(mk);
            }
        }
    }

    // Tampilkan semua
    public void displayElement() {
        Node pointer = head;
        while (pointer != null) {
            pointer.data.tampil();
            pointer = pointer.next;
        }
    }

    // Hitung jumlah elemen
    public int size() {
        int count = 0;
        Node pointer = head;
        while (pointer != null) {
            count++;
            pointer = pointer.next;
        }
        return count;
    }

    // Hapus awal
    public void removeHead() {
        if (head != null) {
            head = head.next;
        }
    }

    // Hapus akhir
    public void removeTail() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node pointer = head;
            while (pointer.next.next != null) {
                pointer = pointer.next;
            }
            pointer.next = null;
        }
    }

    // Hapus tengah
    public void removeMiddle(int pos) {
        if (pos <= 0) {
            removeHead();
        } else {
            Node pointer = head;
            for (int i = 1; i < pos && pointer != null && pointer.next != null; i++) {
                pointer = pointer.next;
            }
            if (pointer != null && pointer.next != null) {
                pointer.next = pointer.next.next;
            }
        }
    }

    // Cari berdasarkan kode
    public Matakuliah find(String kode) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.data.kode.equalsIgnoreCase(kode)) {
                return pointer.data;
            }
            pointer = pointer.next;
        }
        return null;
    }
}
