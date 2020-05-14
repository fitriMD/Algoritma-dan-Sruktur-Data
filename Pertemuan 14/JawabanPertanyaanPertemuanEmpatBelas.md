# Jawaban pertanyaan pertemuan empatbelas

## Pertanyaan
1. Mengapa dalam binary search tree proses pencarian data lebih efektif dilakukan dibanding binary tree biasa?
Jawab: karena binary search tree memang dibuat untuk mengatasi kelemahan searching pada binary tree biasa.

2. Untuk apakah class Node, kegunaan dari atribut left dan right?
Jawab: class node digunakan untuk menyimpan nilai dari atribut data, left, dan right. Atribut left digunakan sebagai penunjuk child node sebelah kiri sedangkan atribut right digunakan sebagai penunjuk child node sebelah kanan.

3. a. untuk apakah kegunaan dari atribut root di dalam classs BinaryTree?
Jawab: berfungsi sebagai node induk dari tree
b. ketika objek tree pertama kali dibuat, apakah nilai dari root?
Jawab: 0

4. Ketika tree masih kosong dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
Jawab: 1) dilakukan pengecekkan apakah tree masih kosong atau tidak, 2) jika tree masih kosong maka nilai dari int data akan dimasukkan sebagai nilai root.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini.
Jelaskan secara detil untuk apa baris program tersebut?
if (data < current.data) {
	if (current.left != null) {
    	current = current.left;
    } else {
    	current.left = new Node(data);
        break;
            }
    } 
Jawab: 1) jika data < root maka dipilih child node sebelah kiri, 2) jika child node sebelah kiri terdapat nilai maka pencarian node baru akan dilanjutkan ke child nodesebelah kirinya, 3) jika child node sebelah kiri bernilai null maka dibuatlah node baru yang kemudian diisi nilai data.

6. Apa perbedaan antara traverse mode pre order, in order, dan post order?
Jawab:
a. Traverse preOrder = cetak isi node yang dikunjungi, kunjung left son, kunjungi right son.
b. Traverse inOrder = kunjungi left son, cetak isi node yang dikunjungi, kunjungi right son.
c. Traverse postOrder = kunjungi left son, kunjungi right son, cetak isi node yang dikunjungi.

7. Perhatikan method delete(). Sebelum proses penghapusan node, didahului dengan proses pencarian node yang akan dihapus. Selain ditujukan untuk mencari node yang akan dihapus (current), proses pencarian tersebut juga akan mencari parent dari node yang akan dihapus (parent). Menurut anda, mengapa diperlukan juga untuk
mengetahui parent dari node yang akan dihapus?
Jawab: karena hal tersebut digunakan untuk mengetahui apakah nilai yang akan dihapus merupakan nilai induk atau nilai child.

8. Untuk apakah dibuat variable dengan nama isLeftChild di dalam method delete()?
Jawab: digunakan sebagai suatu kondisi jika pengecekan mengarah ke node left child maka variable isLeftChild tersebut akan bernilai true.

9. Untuk apakah method getSuccessor()?
Jawab: digunakan ketika proses penghapusan node memiliki 2 child

10. Di ulasan teori disebutkan bahwa ketika suatu node yang memiliki 2 child dihapus, node tersebut digantikan oleh node successor, dimana node successor bisa didapat dengan 2 cara, yaitu 1) mencari nilai terbesar dari subtree di sebelah kirinya, atau 2)
mencari nilai terkecil dari subtree di sebelah kanannya. Manakah 1 dari 2 cara tersebut yang diimplementasikan dalam method getSuccessor() di program di atas?
Jawab: menggunakan metode yang nomer 1

11. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
Jawab:
a. Atribut data digunakan untuk menyimpan data array
b. Atribut idxLast digunakan sebagai indeks terakhir dari array yang akan dimasukkan ke dalam tree

12. Apakah kegunaan dari method populateData() dan traverseInOrder()?
Jawab:
a. populateData() digunakan untuk menyimpan array data dari main
b. traverseInOrder() digunakan untuk mencetak data dari array secara binary tree

13. Jika suatu node binary tree disimpan dalam array indeks 2, maka indeks berapakah posisi left-child dan right-child masing-masing?
Jawab:
a. Left-child = indeks ke 3,5,6
b. Right-child = indeks ke 4,7,8,9