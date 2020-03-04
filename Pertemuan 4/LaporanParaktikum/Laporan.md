# Laporan Praktikum Brute Force Divide Conquer 2

## Belajar Sisip Gambar
ini adalah contoh gambar
<img src='minMax.png'>
 
## Latihan Brute Force

## Latihan Divide Conquer

## Pertanyaan Praktikum 3
1. Nilai array indeks ke-0
Masukkan nilai : 2
Nilai array indeks ke-1
Masukkan nilai : 4
Nilai array indeks ke-2
Masukkan nilai : 6
Nilai array indeks ke-3
Masukkan nilai : 1
Nilai array indeks ke-4
Masukkan nilai : 8
2. Karena untuk mencari nilai minimal dan maksimal
3. Sudah ada dalam source code mainMinMax dan minMax
4. Sebagai index akhir dalam method tersebut
5. Arr merupakan parameter int array sesuai dengan inputan, 4 merupakan parameter int indeks akhir dari array yang menandakan titik maksimum elemen array. Hasil merupakan parameter int hasil yang digunakan untuk menampilkan nilai maksimum maupun nilai minimum.
6. ya, karena jika terpisah dan dijadikan dalam satu class, maka variable global tersebut tidak dapat terbaca oleh fungsi main pada class itu sendiri.
7. Tidak bisa, karena jika dihilangkan maka tidak dapat menyimpan, karena "Arr" merupakan parameter dari deklarasi array dari int[] arr, yang berfungsi untuk menyimpan input dari array tersebut melalui library atau inisialisasi nilai yang diberikan.
8. Dapat dilakukan dengan merubah metode dari divide conquer menjadi metode brute force.

public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];//O(1)
        ppArray[0] = new minMax();//O(1)

        Scanner sc = new Scanner(System.in);//O(1)

        for (int i = 0; i < 5; i++) {//O(n)
            ppArray[i] = new minMax();//O(1)
            System.out.println("Nilai array indeks ke-" + i);//O(1)
            System.out.print("Masukkan nilai : ");//O(1)
            ppArray[i].nilaiArray = sc.nextInt();//O(1)

        }
        int min = ppArray[0].nilaiArray;//O(1)
        int max = ppArray[0].nilaiArray;//O(1)
        for (int i = 0; i < 5; i++) {//O(n)
            if (ppArray[i].nilaiArray < min) {//O(1)
                min = ppArray[i].nilaiArray;//O(1)
            } else if (ppArray[i].nilaiArray > max) {//O(1)
                max = ppArray[i].nilaiArray;//O(1)

            }
        }
        System.out.println("Brute Force");//O(1)
        System.out.println("Nilai Minimal : " + min);//O(1)
        System.out.println("Nilai Maksimal : " + max);//0(1)
9. 
10. Sesuai case, jika perbandingan maka menggunakan brute force, jika pencarian maka menggunakan divde conquer.
11. Sebagai pembanding
12. Sebagai pengganti if else

## Pertanyaan Praktikum 4
1. n * n * 1 = n^2
2. n * n * 1 = n^2 dimana n = 100
			 = 100^2 
			 = 10.000 instruksi	
3. Notasi kedua kode tersebut tidak dapat berbeda, tetapi pada kode B jika dijalankan akan mengoutputkan hasil yang tak terhingga. 

## Tugas Praktikum
1. notasi Big O MainMinMax
   O(1+1+1+n*1*1*1*1+1+1+n*(1+1)+(1+1)+1+1+1+1+n*1+1+1+1+1+1)
   O(3+n+2+4n+4+n+5)
   O(6n+14)
   O(n)

   Notasi Big O minMax
   O(1+1+1+1+1+1+1+1+1+1+1+1+1+1+(K^n)+(K^n)+1+1)
   O(14+2(K^n)+2)
   O(16+2(K^n))
   O(K^n)

2. Notasi Big O MainFibonacci
   O(1+1+1+1+1+1+1+(n*1)+1+1+1+(n*1))
   O(7+n+3+n)
   O(10+2n)
   O(2n)
   O(n)  

   Notasi Big O Fibonacci
   O(1+1+1+1+1+1+1+1+1+(n*1)+1)
   O(10+n)
   O(n)

3. 