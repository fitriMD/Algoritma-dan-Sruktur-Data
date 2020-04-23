# Laporan Quiz 2

NIM  : 1941720016
NAMA : FITRI MUTIARA DEVI

## Screenshoot Program
Source Code kelas Node
<img src = 'Node.png'>
Source Code kelas Quiz
<img src = 'Quiz1.png'>
<img src = 'Quiz2.png'>
<img src = 'Quiz3.png'>
<img src = 'Quiz4.png'>
<img src = 'Quiz5.png'>
<img src = 'Quiz6.png'>
Source Code Kelas Main
<img src = 'Main.png'>
Source Code Output
<img src = 'Output.png'>

## Flowchart 
<img src = 'Flowchart1.png'>
<img src = 'Flowchart2.png'>
<img src = 'Flowchart3.png'>
<img src = 'Flowchart4.png'>

## Penjelasan
Dalam program ini ada 3 kelas yaitu Kelas Node, Quiz2 dan Main. Kelas Node Untuk merepresentasikan elemen data dimana didalamnya terdapat 3 atribut yaitu data[] yang bertipe data int, tahun yang bertipe data int dan juga penunjuk next yang menghubungkan dengan data berikutnya. Node terakhir akan menunjuk null (nilai null yang merepresentasikan nilai tidak ada/nothing/unset reference). Awal dari struktur Linked List terdapat head. Jika Linked List kosong, maka head akan merujuk ke null. Dalam kelas Quiz teradapat method yang merupakan deklarasi dari operasi yang ada di Linked Lists yaitu isEmpty() yang bertipe data boolean yang digunkan untuk mengecek apakah head = null (kosong). addFirst(int tahun) merupakan method yang berparameter yaitu tahun dengan tipe data integer, method ini untuk operasi penambahan node di awal elemen Linked Lists. add(int tahun)  juga merupakan method yang memiliki parameter dan berguna untuk menambah node berdasarkan indeks, Operasi untuk menambah node berdasarkan indeks. Proses ini menggunakan konsep traverse hingga indeks ditemukan, baru kemudian node ditambahkan pada indeks tersebut. Selain berdasarkan index, dapat juga ditambah berdasarkan nilai yang dicari. getFirst() method ini berguna untuk memperoleh node diawal elemen linked Lists. getLast() method ini berguna untuk memperoleh node diakgir elemen linked Lists. get(int index) berguna untuk memperoleh node berdasarkan value / index. removeFirst() berguna untuk menghapus node berdasarkan key/index pertama. remove(int index) berguna untuk menghapus node berdasarkan key/index, Untuk melakukan proses ini diperlukan penunjuk bantuan yaitu: prev (menunjuk node sebelum node yang dihapus) dan cur (menunjuk node yang akan dihapus). Linked List kosong, maka tidak dapat dilakukan penghapusan,  Penghapusan node yang merupakan head, maka head harus menunjuk ke node berikutnya, Node yang ingin dihapus harus ada dalam Linked List. clear() berguna untuk mengosongkan Linked Lists. print() berguna untuk menampilkan seluruh elemen pada Linked Lists. Dan method yang terakhir adalah method tambah yang digunakan pada saat memanggil data yang telah dimasukkan kedalam array. Dalam class Main merupakan pengisian data dalam array. Output yang diinginkan adalah menampilakan data pariwisata perbulannya dalam 3 tahun, maka jumlah array adalah 12 dan diisi oleh 3 elemen disetiap array. Setelah menegisi data maka kita bisa langsung memanggil array menggunakan perulangan, sehingga data urut dari bulan 1 sampai 12 dan dari tahun 2018 sampai 2020.