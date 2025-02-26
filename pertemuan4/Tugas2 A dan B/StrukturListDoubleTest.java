package pertemuan4;

// Tugas 2: Pengujian StrukturListDouble
public class StrukturListDoubleTest {
    public static void main(String[] args) {
        StrukturListDouble list1 = new StrukturListDouble();
        list1.addFirst(3.4);
        list1.addLast(4.5);
        list1.addMid(2.1, 0);
        list1.display();  // Output: 2.1 3.4 4.5

        StrukturListDouble list2 = new StrukturListDouble();
        list2.addFirst(4.5);
        list2.addLast(5.5);
        list2.addMid(3.4, 0);
        list2.addMid(2.1, 1);
        list2.addMid(1.1, 2);
        list2.display();  // Output: 3.4 2.1 1.1 4.5 5.5
    }
}