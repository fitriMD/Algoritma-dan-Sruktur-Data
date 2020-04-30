# Jawaban pertanyaan pertemuan tigabelas

## 13.3.3 Pertanyaan percobaan
1. Jelaskan pengertian dari double linked lists!
Jawaban : node-node yang saling terhubung satu sama lain dan field pointer-nya dua buah dan dua arah, ke node sebelum dan sesudahnya.

2. Perhatikan class Node, didalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?
Jawaban : Pointer next menunjuk pada node setelahnya dan pointer prev menunjuk pada node sebelumnya.

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?
public DoubleLinkedLists() {
       head = null;
       size = 0;
   }
Jawaban : Head merupakan awal dari struktur Linked List dan jika Linked List kosong, maka head akan merujuk ke null. Sedangkan atribut size merupakan banyak elemen/ data yang ada pada linked list pada saat kondisi awal dimana linked list masih kosong jadi size = 0.

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?
Node newNode = new Node(null, item, head);
Jawaban : Karena prev merupakan pointer yang menunjuk ke node sebelumnya dan penambahan data adalah pada head linked list jadi untuk data selanjutnya masih kosong sehingga prev dianggap sama dengan null.

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
Jawaban : Statement itu untuk menambahan nilai node pada head

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?
Node newNode = new Node(current, item, null);
Jawaban : Current adalah node akhir sebagai lokasi yang akan ditambah, sedangkan next dengan null adalah node baru yang memiliki next berisi nilai null.

## 13.4.3 Pertanyaan percobaan
1. Apakah maksud statement berikut pada method removeFirst()?
head = head.next;
head.prev = null;
Jawaban : untuk head = head.next merupakan statement untuk menjadikan data pada bagian next menjadi bagian head. Sedangkan head.prev = null merupakan statement untuk menunjukkan pointer prev pada bagian head memiliki nilai null.

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
Jawaban : Menghapus data pada bagian akhir elemen diawali dengan memastikan posisi yang diinginkan berada di bagian akhir dengan cara jika posisi head selanjutnya sama dengan null maka head akan bernilai null dan sizenya akan berkurang. Apabila apabila kondisi Node current berada di posisi head, jika current dua kali setelahnya tidak sama dengan null maka current = current.next dan bernilai null kemudian size akan berkurang.

3. Jelaskan fungsi kode program berikut ini pada fungsi remove!
current.prev.next = current.next;
current.next.prev = current.prev;
Jawaban : berguna untuk menjadi petunjuk pointer, untuk mengganti node next menjadi prev next dan merubah node prev menjadi next prev.

## 13.5.3 Pertanyaan percobaan
1. Apakah kegunaan method size() pada class DoubleLinkedLists ?
Jawaban : Untuk menyimpan elemen/data/node pada Linked Lists

2. Indeks pada linked lists yang telah dibuat dalam praktikum, menunjukkan bahwa linked lists dimulai pada indeks ke-0 atau 1? Jelaskan!
Jawaban : Awal dari Linked List  terdapat head  yang menunjuk pada node pertama apabila linked list masih kosong maka head akan bernilai null dan apa bila sudah terisi maka node tersebut akan menempati indek ke-0. Dalam double linked lists ada dua buah pointer yaitu next yang menunjuk pada node selanjutnya dan juga prev adalah pointer yang menunjuk pada node sebelumnya, oleh sebab itu indeks dimulai dari ke-0/1 .

3. Jelaskan perbedaan fungsi Add pada Double Linked Lists dan Single Linked Lists! Kemudian tunjukkan perbedaannya pada kode program!
Jawaban : Pada dasarnya fungsi add pada Double Linked Lists dan Single Linked Lists sama yang berguna untuk menambahkan node berdasarkan indeks cuma membedakan adalah pada langkah di Double Linked List memposisikan location prev indeks data yang akan dimasukkan sebagai Node baru bagian prev, kemudian location terletak pada posisi New
Node bagian next, lalu Node baru terletak pada location
bagian prev.next, dan Node baru terletak pada bagian location bagian prev.
Sigle Linked Lists
public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        else if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }

Double Linked Lists
public void add(int item, int index) throws Exception {
       if (isEmpty()){
           addFirst(item);
       } else if (index < 0 || index > size) {
           throw new Exception ("Nilai indeks diluar batas");
           
       }else {
           Node current = head;
           int i = 0;
           while (i<index) {
               current = current.next;
               i++;
           }
           if (current.prev == null){
               Node newNode = new Node (null, item, current);
               current.prev = newNode;
               head = newNode;
           }else {
               Node newNode = new Node (current.prev, item, current);
               newNode.prev = current.prev;
               newNode.next = current;
               current.prev.next = newNode;
               current.prev = newNode;
           }
       }
       size++;
   }