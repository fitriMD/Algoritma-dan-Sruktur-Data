/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumsatu;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tugas, uts, uas;
        double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nilai tugas Anda : ");
        tugas = input.nextInt();
        //nilaiTugas = tugas*20/100;

        while (tugas > 100 || tugas < 0) {
            System.out.print("Masukkan nilai tugas Anda : ");
            tugas = input.nextInt();

        }
        System.out.print("Masukkan nilai UTS Anda : ");
        uts = input.nextInt();
        //nilaiUTS = uts *35/100;

        while (uts > 100 || uts < 0) {
            System.out.print("Masukkan nilai UTS Anda : ");
            uts = input.nextInt();

        }
        System.out.print("Masukkan nilai UAS Anda : ");
        uas = input.nextInt();

        while (uas > 100 || uas < 0) {
            System.out.print("Masukkan nilai UAS Anda : ");
            uas = input.nextInt();

        }
        nilaiTugas = (tugas * 0.2);
        nilaiUTS = (uts * 0.35);
        nilaiUAS = (uas * 0.45);
        nilaiAkhir = nilaiTugas + nilaiUTS + nilaiUAS;
        System.out.print("Nilai akhir Anda adalah : " + nilaiAkhir);

    }

}
