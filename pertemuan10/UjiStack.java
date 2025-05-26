package pertemuan10;

public class UjiStack {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);


        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.printStack();


        System.out.println("#Melakukan push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        System.out.println("push 2; push 4 , push 1");


        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.printStack();

        // Tugas: Lakukan pop 2x
        System.out.println("\n#Melakukan pop 2x:");
        System.out.println("Pop elemen: " + stack.pop());
        System.out.println("Pop elemen: " + stack.pop());

        // Tugas: Cek kondisi setelah pop
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.printStack();
    }
}
