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
public class soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo=0, bunga = 0.02;
        int bulan;

        System.out.print("Masukkan saldo awal Anda : Rp.");
        saldo = input.nextInt();
        for (bulan = 0; bulan < 12; bulan++) {
            saldo += saldo * bunga;
            System.out.printf("Saldo pada bulan ke-" + (bulan + 1) + " = " +"Rp.%.0f\n" ,saldo);
        }        
    }
}
