# Jawab pertanyaan pertemuan tujuh

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
5. public class SearchingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Masukkan jumlah data : ");
        int jumlah = sc.nextInt();
        int data[] = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data ke-" + (i + 1) + " : ");
            data[i] = sc.nextInt();
        }
        
        Searching pencarian = new Searching(data, jumlah);
        MergeSort ms = new MergeSort();
        
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        
        System.out.print("Masukkan data yang dicari : ");
        int cari = sc.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearching(cari);
        pencarian.TampilPosisi(cari, posisi);
        
        System.out.println("====================================");
        System.out.println("Sorting dengan merge sort : ");
        ms.mergeSort(data);
        ms.printArray(data);
        System.out.println("menggunakan binary search");
        posisi = pencarian.FindBinarySearch(cari, data, 0, data.length-1);
        pencarian.TampilPosisi(cari, posisi);
    }
}


