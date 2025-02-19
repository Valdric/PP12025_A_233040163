// Latihan 3: Menampilkan elemen list
 public void displayList() {
     Node temp = HEAD;
     while (temp != null) {
         System.out.print(temp.getData() + " ");
         temp = temp.getNext();
     }
     System.out.println();
 }