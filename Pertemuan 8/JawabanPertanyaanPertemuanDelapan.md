## Jawaban Pertanyaan Pertemuaan Delapan

# Pertanyaan 8.3.3
1. Fungsi angka 4 dari potongan kode tersebut adalah membaca 4 elemen/data yang telah dimasukkan dalam program.
2. Isi stack penuh!
Isi stack penuh!
Isi stack : 
12 
9 
31 
15 

Data yang keluar : 12
Elemen teratas : 9
Isi stack : 
9 
31 
15 

3. Angka 17 dan 98 keduanya tidak dapat dimasukkan dalam stack. Output akan memberitahu bahwa isi stack penuh!, itu karena data yang terbaca oleh sitem hanyalah 4 data saja.
4. package minggu8;

import java.util.Scanner;

public class StackMainModif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jumlah = sc.nextInt();
        int data[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data ke-" + (i + 1) + " : ");
            data[i] = sc.nextInt();
        }
        Stack pencarian = new Stack (data, jumlah);
        System.out.println("Isi Stack : ");
        pencarian.TampilData();
        Stack tumpukan = new Stack(jumlah);
        

        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }

}

5. Top diisi dengan -1 karena arraydimulai dari 0, yang berarti bahwa data stack dalam keadaan kosong.

# Pertanyaan 8.4.3
1. Pada method presedence mendeklarasikan semua operator aritmatika yang biasa digunakan dalam perhitungan matematika. Dalam method ini menggunakan Switch case
case '^' : return 3; (Case 1 adalah operasi pangkat yang tingakatannya tertinggi)
case '%' : return 2; (Case 2 adalah operator modulo yang tingkatannya dibawah operasi pangkat)
case '/' : return 2; (Case 3 adalah operator pembagian yang tingkatnya sama dengan operasi modulo dan dibawah operasi pangkat)
case '*' : return 2; (Case 4 adalah operator perkaian yang tingkatnya sama dengan operasi modulo & pembagian dan dibawah operasi pangkat)
case '-' : return 1; (Case 5 adalah operator pengurangan yang tingkatannya dibawah operasi perkalian, pembagian & modulo)
case '+' : return 1; (Case 6 adalah operator penjumlahan yang tingkatnnya sama dengan perator pengurangan dan dibawah operasi perkalian, pembagian & modulo)
default : return 0;
2. Masukkan ekspresi matematika : 
5^2+8/(6-3)
Postfix : 52^863-/+
3. Karena tanda kurung tidak dideklarasikan pada method presedence. Dan pada proses penulisan notasi postfix tanda '(' masuk dalam stack dan apa bila sudah ada tanda ')' maka tanda '(' hanya perlu di-pop tidak perlu dimasukkan ke postfix.
4. 