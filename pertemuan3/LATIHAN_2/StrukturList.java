class StrukturList {
 private Node HEAD;
 
 public StrukturList() {
     HEAD = null;
 }
 
 public Node getHEAD() {
     return HEAD;
 }
 
 public void setHEAD(Node HEAD) {
     this.HEAD = HEAD;
 }
 
 // Latihan 2: Menambahkan elemen di akhir list
 public void addTail(int data) {
     Node newNode = new Node(data);
     if (HEAD == null) {
         HEAD = newNode;
     } else {
         Node temp = HEAD;
         while (temp.getNext() != null) {
             temp = temp.getNext();
         }
         temp.setNext(newNode);
     }
 }
