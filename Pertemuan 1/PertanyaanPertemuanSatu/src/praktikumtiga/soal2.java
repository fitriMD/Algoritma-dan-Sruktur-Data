/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumtiga;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Array1 = new int[4][5];
        int total = 0;

        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1[0].length; j++) {
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] : ");
                Array1[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1[0].length; j++) {
                total += Array1[i][j];
            }
        }
        System.out.println("Jumlah Isi Array1 adalah " + total);
    }

}
