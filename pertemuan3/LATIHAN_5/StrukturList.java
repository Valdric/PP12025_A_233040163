 // Latihan 5: Menambahkan elemen di awal list
 public void addHead(int data) {
     Node newNode = new Node(data);
     newNode.setNext(HEAD);
     HEAD = newNode;
 }
}