# Jawaban Pertanyaan Pertemuan Lima

1. Terdapat di method void bubblesort()
2. Terdapat di method void selectionSort()
3. Yang dimaksud proses swap adalah proses dimana isi dari index akan di cek dengan suatu keadaan atau selection lalu akan mengganti urutan index tadi berdasarkan pengecekan tadiyang dimaksud proses swap adalah proses dimana isi dari index akan di cek dengan suatu keadaan atau selection lalu akan mengganti urutan index tadi berdasarkan pengecekan tadi
Contoh potongan program :
for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;

                }

            }

        }
4. Pada baris program tersebut terdapat 2 proses yaitu

=> pada kode program "if" terdapat pengecekan "apakah isi array lishMhs.ipk index ke J lebih besar dari pada isi array lishMhs.ipk index ke J - 1 .?

=> selanjutnya jika index tadi lebih besar maka akan terjadi proses perubahan isi array atau swap

5. a. Pada perulangan i digunakan untuk elemen pertama sebagai awal untuk melakukan perbandingan, sedangkan untuk perulangan j 			digunakan untuk elemen kedua pada perbandingan yang dilakukan, sehingga elemen pertama dan kedua akan diperbandingkan kemudian 		akan dilakukan swap sesuai kondisi yang diinginkan.

	b. Karena indeks ke-0 dari array listMhs sudah terinisialisasi sebagai data pertama sehingga perulangan dikurangi 1 sebagai pengabaian indeks ke - 0

	c. Karena perulangan tersebut untuk mengulang nama, umur, tahun masuk, dan ipk yang jumlah perulangannya 2 kali lipat dari jumlah listMhs

	d. Terdapat 100 tahap karena perulangan tersebut mengandung notasi O(n) jika n bernilai 50 dengan n dikalikan 2
	O(n*2) . 50*2 = 100 eksekusi
6. Proses pencarian nilai terkecil untuk melakukan sorting pada selection sort
7. public void insertionSort(boolean Ascending) {
        int i, j;
        for (i = 0; i < listMhs.length; i++) {
            Mahasiswa_1941720123 temp;
            temp = listMhs[i];
            j = i;
            if (Ascending) {
                while ((j > 0) && (listMhs[j - 1].ipk > temp.ipk)) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (listMhs[j - 1].ipk < temp.ipk)) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            }
            listMhs[j] = temp;
        }