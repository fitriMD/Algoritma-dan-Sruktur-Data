/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTujuh;

import java.util.Scanner;

;

/**
 *
 * @author Lenovo
 */
public class ProgramNilai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Mhs : ");
        int n = sc.nextInt();
        Nilai[] n1 = new Nilai[n];

        for (int i = 0; i < n; i++) {
            n1[i] = new Nilai();
            System.out.println("Mhs " + (i + 1));
            System.out.print("Nilai 1 : ");
            n1[i].nilai1 = sc.nextInt();
            System.out.print("Nilai 2 : ");
            n1[i].nilai2 = sc.nextInt();

            System.out.println("================");

        }
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai terbaik Mhs ke-"+(i+1));
            n1[i].hitungNilai();
            
        }

    }

}
