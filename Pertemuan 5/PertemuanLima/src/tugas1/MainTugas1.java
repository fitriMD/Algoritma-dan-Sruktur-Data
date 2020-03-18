/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainTugas1 {

    public static void main(String[] args) {
        Scanner fitri = new Scanner(System.in);
        Scanner fitri1 = new Scanner(System.in);
        Tiket data = new Tiket();
        int jumMhs = 3;

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama maskapai : ");
            String maskapai = fitri1.next();
            System.out.print("Harga Tiket : ");
            float harga = fitri.nextFloat();
            System.out.print("Jumlah Transit : ");
            int transitCount = fitri.nextInt();
            System.out.print("Waktu Keberangkatan : ");
            int flightTime = fitri.nextInt();
            
            Tugas1 m = new Tugas1(maskapai, harga, transitCount, flightTime);
            data.tambah(m);
        }
        System.out.println("Daftar Tiket setelah sorting asc berdasarkan harga Menggunakan Algoritma Bubble Sort : ");
        data.bubbleSort();
        data.tampil();

        System.out.println("Daftar Tiket setelah sorting asc berdasarkan harga Menggunakan Algoritma Selection Sort : ");
        data.selectionSort();
        data.tampil();
    }
}
