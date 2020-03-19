# Jawab pertanyaan pertemuan enam

## Jawab 1.4.1
1. Kode tersebut adala method dengan nama Searching dengan 2 parameter yaitu int[] data dan int jmlData. Variabel jumData sama dengan variabel jmlData yang merupakan salah satu parameter, kemudian variabel data sama bernilai sama dengan jumlah isi array dengan jmlData. Perulangan berfungsi untuk mengidentifikasi nilai array. Data[i] akan berulang sebanyak 8 kali yang dimulai dari 0, kemudian data[i] akan terisi nilai yang sama dengan nila array
2. Break digunakan untuk menghentikan proses pencarian elemen apabila sudah ditemukan
3. Program yang dibuat masih bisa berjalan dan hasilnya benar. Hal ini karena cara yang digunakan adalah sequensia search, sehingga pencarian dilakukan secara terurut dari depan kebelakang, dan apabila elemen yang dicari sudah ditemukan maka program akan berhenti dan menunjukkan dimana elemen tersebut ditemukan. Pada percobaan ini elemen yang dicari adalah 30 maka program akan berhenti jika sudah menemukan elemen 30 yang posisinya berada pada indeks ke-2

## Jawab 1.4.2
1. mid = (left + right)/2;
2. if (cari == data[mid]) {
                return (mid);
                
            }else if (data[mid] > cari) {
                return FindBinarySearch(cari, left, mid - 1);
                
            }else {
                return FindBinarySearch(cari, mid + 1, right);
            }
3. Data tidak sesuai, karena metode pencarian yang digunakan adalah Binary Search maka yang harus dilaukan adalah dengan mengurutkan data yang ada dalm array terlebih dahulu
int data[] = {30,40,50,60,70,80,90,100};
4. Untuk pencarian dengan Binary Search pencarian untuk nilai 30 tidak dapat ditemukan karena nilai didalam array belum urut dari nilai terkecil ke nilai terbesar (ascending)
5. 

