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
