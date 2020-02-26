/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainPangkat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pangkat ke-" + (i + 1) + " : ");
            png[i].pangkat = sc.nextInt();

        }
        System.out.println("Pilhan Cara");
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

    }
}
