/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Faktorial {

    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;

        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;

        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();

        }
        System.out.println("======================================================");
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
    }

}
