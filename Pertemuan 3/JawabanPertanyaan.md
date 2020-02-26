#Jawaban 2.3.3

1. Base lain Algoritma Divide and Conquer adalah pencarian nilai factorial yang didasarkan pada perhitungan rekursif dan membagi masalah menjadi beberapa bagian yang disebut upa-masalah.
2. Devide = Merupakan cara program membagi masalah menjadi beberapa upa-masalah yang memiliki kemiripan dengan masalah semula namun berukuran lebih kecil.
Conquer = Merupakan pemecahan masalah yang disesuaikan dengan masing-masing upa-masalah secara rekursif.
Combine = Merupakan gabungan dari solusi masing-masing upa-masalah membentuk solusi masalah semula.
3. Bisa dengan menggunakan while 
public int faktorBF(int n){
	int fakto = 1;
	int i =  1;
	while(i<=n){
		fakto = fakto*i;
		i++;
	}
	return fakto;
}
4. System.out.println("======================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        double start = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));

        }
        double finish = System.nanoTime();
        System.out.println("Durasi Eksekusi Method : "+(finish-start));
        System.out.println("======================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        start = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));

        }
        finish = System.nanoTime();
        System.out.println("Durasi Eksekusi Method : "+(finish-start));
        System.out.println("======================================================");
5. Ada, lebih cepat dengan Divide and Conquer
Hasil Faktorial dengan Brute Force
Faktorial dari nilai 1 adalah : 1
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 4 adalah : 24
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 6 adalah : 720
Faktorial dari nilai 7 adalah : 5040
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 9 adalah : 362880
Faktorial dari nilai 10 adalah : 3628800
Faktorial dari nilai 11 adalah : 39916800
Faktorial dari nilai 12 adalah : 479001600
Faktorial dari nilai 13 adalah : 1932053504
Faktorial dari nilai 14 adalah : 1278945280
Faktorial dari nilai 15 adalah : 2004310016
Faktorial dari nilai 16 adalah : 2004189184
Faktorial dari nilai 17 adalah : -288522240
Faktorial dari nilai 18 adalah : -898433024
Faktorial dari nilai 19 adalah : 109641728
Faktorial dari nilai 20 adalah : -2102132736
Durasi Eksekusi Method : 6.639002E7
======================================================
Hasil Faktorial dengan Divide and Conquer
Faktorial dari nilai 1 adalah : 1
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 4 adalah : 24
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 6 adalah : 720
Faktorial dari nilai 7 adalah : 5040
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 9 adalah : 362880
Faktorial dari nilai 10 adalah : 3628800
Faktorial dari nilai 11 adalah : 39916800
Faktorial dari nilai 12 adalah : 479001600
Faktorial dari nilai 13 adalah : 1932053504
Faktorial dari nilai 14 adalah : 1278945280
Faktorial dari nilai 15 adalah : 2004310016
Faktorial dari nilai 16 adalah : 2004189184
Faktorial dari nilai 17 adalah : -288522240
Faktorial dari nilai 18 adalah : -898433024
Faktorial dari nilai 19 adalah : 109641728
Faktorial dari nilai 20 adalah : -2102132736
Durasi Eksekusi Method : 4431624.0
======================================================

#Jawaban 2.4.3

1. Pada method pangkatBF menggunakan Algoritma Brute Force yaitu dengan melakukan perulangan secara berurutan, sedangkan ada method pangkatDC menggunakan Algoritma Devide and Conquer yaitu dengan membagi tugasnya sehingga menjadi permasalahan yang lebih kecil lalu men-combine nya kembali.
2. Karena pada potongan kode itu menggunakan Algoritma Divide and Conquer yang dimana cara mengeksekusinya dengan membagi tugasnya terlebih dahulu menjadi lebih kecil. Pada saat membagi elemen menjadi dua bagian, sedangkan pada bilangan ganjil tidak dapat dibagi dua.
3. Sudah
return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a); //bilangan ganjil
return (pangkatDC(a,n/2)*pangkatDC(a,n/2)); //bilangan genap
4. public Pangkat(int nilai, int pangkat){
        this.nilai=nilai;
        this.pangkat=pangkat;
    }
    Pangkat(){
        
    }
5. System.out.println("Pilhan Cara");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan : ");
        int cara = sc.nextInt();

        if (cara == 1) {
            System.out.println("===============================================");
            System.out.println("Hasil Pangakat dengan Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }

        } else if (cara==2) {
            System.out.println("===============================================");
            System.out.println("Hasil Pangakat dengan Divide and Conquer");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));

            }

        } else{
            System.out.println("Pilihan tidak tersedia");
        }
        System.out.println("===============================================");

#Jawaban 2.5.3
1. Jika menggunakan TotalBF() perhitungan akan terurut sedangkan jika menggunakan TotalDC() perhitungan akan dibagi menjadi lebih kecil.
2. System.out.println("==============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f juta\n" , sm.elemen , sm.totalBF(sm.keuntungan));
        System.out.println("==============================================================");
        System.out.println("Algoritma Devide Conquer");
        System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f juta\n" , sm.elemen, sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
3. Untuk proses penggabungan pada method Divide and Conquer
4. Untuk membagi elemen menjadi beberapa bagian
5. package minggu3;
import java.util.Scanner;
public class MainSum {

    public static void main(String[] args) {
        int banyakPerusahaan;
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================================");
        System.out.println("Program menghtung keuntungan total (Satuan Juta, misal 5.9)");
        System.out.print("Masukkan banyak perusahaan : ");
        banyakPerusahaan = sc.nextInt();
        for (int j = 1; j <= banyakPerusahaan; j++) {
            System.out.println("Perusahaan ke-" + j);
            System.out.print("Masukkan Jumlah bulan : ");
            int elm = sc.nextInt();

            Sum sm = new Sum(elm);
            System.out.println("==============================================================");

            for (int i = 0; i < elm; i++) {

                System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
                sm.keuntungan[i] = sc.nextDouble();
            }
            System.out.println("==============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f juta\n", sm.elemen, sm.totalBF(sm.keuntungan));
            System.out.println("==============================================================");
            System.out.println("Algoritma Devide Conquer");
            System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f juta\n", sm.elemen, sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));

        }

    }

}
