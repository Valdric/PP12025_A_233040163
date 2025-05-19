package pertemuan9;

public class QueueMain {
    public static void main(String[] args) {
        Strukturqueue queue = new Strukturqueue();

        System.out.println("Latihan 5: ");
        queue = new Strukturqueue ();
        System.out.println("Sebelum enqueue 4x: ");
        System.out.println("Size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();

        System.out.println();
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("Enqueue 4x: ");
        System.out.println("Size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Elemen queue saat ini: ");
        queue.displayElements();
        System.out.println("Front: " + queue.front());

        System.out.println("\n-- Lakukan dequeue --");
        queue.dequeue();

        System.out.println("Isi queue setelah dequeue: ");
        queue.displayElements();
    }
}
