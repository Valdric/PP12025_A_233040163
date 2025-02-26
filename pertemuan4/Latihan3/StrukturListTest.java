package pertemuan4;

// Latihan 3: Pengujian StrukturList
public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addLast(3);
        list.addLast(4);
        list.addFirst(5);
        list.addMid(7, 2);
        list.addMid(8, 2);

        list.display();  // Output yang diharapkan: 5 3 8 7 4
    }
}

