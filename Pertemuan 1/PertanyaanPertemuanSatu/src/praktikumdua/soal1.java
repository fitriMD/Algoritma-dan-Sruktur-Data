/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumdua;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, kurang, hasil = 0;

        System.out.print("Masukkan Bilangan : ");
        A = input.nextInt();

        for (int i = 0; i < 5; i++) {
            hasil = A;
            A = hasil - 3;
            System.out.println("Hasil pengurangan ke-"+(i+1)+" : " + A);

        }
        if (A % 2 == 0) {
            System.out.println(A + " adalah Bilangan Genap");

        } else if (A % 2 != 0) {
            System.out.println(A + " adalah Bilangan Ganjil");

        }
    }

}
