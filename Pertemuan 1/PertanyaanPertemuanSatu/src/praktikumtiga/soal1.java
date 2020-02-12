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
public class soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil[] = new int[15];
        int genap[] = new int[15];
        int ganjil[] = new int[15];

        for (int i = 0; i < bil.length; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + " : ");
            bil[i] = input.nextInt();

            if (bil[i] % 2 == 0) {
                genap[i] = bil[i];
            } else {
                ganjil[i] = bil[i];
            }
        }
        System.out.println();
        System.out.println("===Bilangan Genap===");
        for (int i = 0; i < 10; i++) {
            if (genap[i] == 0) {
                System.out.print("");
            } else {
                System.out.print(genap[i]+" ");
            }
            
        }
        System.out.println("\n===Bilangan Ganjil===");
        for (int i = 0; i < ganjil.length; i++) {
            if (ganjil[i] == 0) {
                System.out.print("");
            } else {
                System.out.print(ganjil[i]+" ");
            }
        }
    }

}
