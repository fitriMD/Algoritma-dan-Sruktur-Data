# Jawaban pertanyaan pertemuan limabelas

## 15.3.3 Pertanyaan percobaan
1. Mengapa graph diimplementasikan dengan double linked list, bukan single linked list?
Jawab : Karena, pada adjency List graph memiliki 2 pointer sama seperti double linked list (simpul vertex dan simpul edge).

2. Jelaskan masing-masing pada dua jenis looping yang terdapat dalam metode printGraph()!
Jawab : Pengulangan yang pertama digunakan untuk vertex yang
terhubung dengan beberapa intasan, sedangkan perulangan yang kedua
digunakan untuk urutan dari lintasan vertex terhubung dengan lintasan yang lain

3. Apakah perbedaan Graph dengan Binary Tree pada implementasinya menggunakan linked list?
Jawab : Graph digunakan untuk mempresentasikan objek-objek diskrit
dan hubungan antara objek-objek tersebut. Sedangkan Binary Tree
maksimal terhubung dengan 2 lintasan.

4. Jelaskan dengan contoh perbedaan antara Edge dan Path pada graph!
Jawab : Lintasan (path) adalah urutan dari lintasan (edge). Contohnya lintasan J ke P, yang dapat kita sebut sebagai lintasan (path) JBCP adalah lintasan (path) dari simpul J ke P. Lintasan (Edge) Garis-garis penghubung antar simpul dalam graph disebut dengan lintasan (edge).

5. Sebutkan beberapa contoh (minimal 3) implementasi graph dalam permasalahan yang membutuhkan representasi internal dalam memori komputer untuk suatu struktur data!
Jawab : Implementasi graph (1)Graf tak berarah (undirected graph)
yaitu Graf yang sisinya tidak mempunyai orientasi arah disebut graf tak berarah. (2) Graf Berarah (directed graph) Graf yang setiap sisinya memiliki orientasi arah disebut sebagai graf berarah. (3) Graph Weight.

6. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah kegunaan algoritma-algoritma tersebut?
Jawab : 
- Algoritma Breadth-first search adalah algoritma yang digunakan untuk
melakukan pencarian secara melebar.
- Algoritma Depth First Search, digunakan untuk pencarian secara
mendalam.
- Algoritma Kruskal adalah algoritma yand digunakan untuk mencari
pohon merentang minimum secara langsung didasarkan pada algoritma
MST (Minimum Spanning Tree) umum.

7. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan pembuatan variabel tersebut ?
Jawab : Digunakan untuk membuat array bertipe data node.

8. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?
Jawab : karena inputnya harus berada di depan node supaya sesuai
dengan urutan.

9. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge pada graph ?
Jawab : menggunakan method removeEdge();

10. Kenapa pada praktikum 15.3 langkah ke-12 untuk menghapus path yang bukan merupakan lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?
graph.removeEdge(1, 2);
graph.printGraph();
Jawab : 

## 15.4.3 Pertanyaan percobaan
1. Apakah perbedaan degree/derajat pada directed dan undirected graph?
Jawab : Pada undirect graph, degree pada node ditentukan
berdasarkan hubungan (terhubung/tidak), dan pada direct graph
degree node ditentukan berdasarkan arah dari hubungan tersebut.

2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus ditambahkan dengan 1 pada indeks array berikut?
public graphArray(int v){
	vertices = v;
    twoD_array = new int[vertices + 1][vertices + 1];
}
Jawab : karena dimulai dari index ke 1

3. Apakah kegunaan method getEdge() ?
Jawab : digunakan untuk menentukan nilai dari edge ada atau tidak ada

4. Termasuk jenis graph apakah uji coba pada praktikum 15.4 ?
Jawab : adjency matrix undirected

5. Mengapa pada method main harus menggunakan try-catch Exception ?
Jawab : Karena implementasi method LinkedLists jika terjadi error menggunakan Exception, bungkus dengan blok try - catch sebelum memanggil method yang dibutuhkan

