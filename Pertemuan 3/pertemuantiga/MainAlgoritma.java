/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuantiga;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainAlgoritma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int x = sc.nextInt();
        Algoritma[] a1 = new Algoritma[x];

        for (int i = 0; i < x; i++) {
            a1[i] = new Algoritma();
            System.out.print("Nama Mahasiswa ke-" + (i + 1) + " : ");
            a1[i].namaMhs = sc.next();
            System.out.print("Masukkan Nilai Tugas : ");
            a1[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis : ");
            a1[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS : ");
            a1[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan Nilai UAS : ");
            a1[i].nilaiUAS = sc.nextInt();
            System.out.println("----------------------------------------------------");
            System.out.println("Nilai Akhir Mahasiswa ke-" + (i + 1) + ": " + a1[i].hitungTotalNilai(a1[i].nilaiTugas, a1[i].nilaiKuis, a1[i].nilaiUTS, a1[i].nilaiUAS));
            System.out.println("----------------------------------------------------");
        }

        Rata2 rr = new Rata2();
        System.out.println("==========================================================");
        System.out.println("Nilai Total Mahasiswa");
        for (int i = 0; i < x; i++) {
            System.out.println("Nama Mahasiswa ke-" + (i + 1) + " : " + a1[i].namaMhs);
            System.out.println("Nilai total         : "+a1[i].hitungTotalNilai(a1[i].nilaiTugas, a1[i].nilaiKuis, a1[i].nilaiUTS, a1[i].nilaiUAS) );
            rr.total += a1[i].hitungTotalNilai(a1[i].nilaiTugas, a1[i].nilaiKuis, a1[i].nilaiUTS, a1[i].nilaiUAS);

        }
        System.out.println("--------------------------------------------------------");
        System.out.print("Rata-rata nilai Mahasiswa : " + rr.hitungRata(x));
    }
}
