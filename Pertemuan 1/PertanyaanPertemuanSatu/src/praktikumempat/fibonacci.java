 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumempat;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class fibonacci {
    static Scanner input = new Scanner(System.in);
    static int pilih, bil, a = 0, b = 1, x;
    static int arr [] = new int [bil];
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        System.out.println("==============================");
        System.out.println("PROGRAM FUNGSI DERET FIBONACCI");
        System.out.println("==============================");
        System.out.println("      ==> Pilih menu <==      ");
        System.out.println("1. Deret Fibonacci dengan Perulangan");
        System.out.println("2. Deret Fibonacci dengan Fungsi Rekursif");
        System.out.print("Pilh menu : ");
        pilih = input.nextInt();
        System.out.println();
        if (pilih == 1) {
            perulangan();
        } else if (pilih == 2) {
            rekursif();
        } else {
            System.out.println("Menu yang anda pilih salah");
            menu();
        }
    }
    static void perulangan() {
        System.out.println("=================================");
        System.out.println("Deret Fibonacci dengan Perulangan");
        System.out.println("=================================");
        System.out.print("Masukkan Jumlah Deret Fibonacci : ");
        bil = input.nextInt();

        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < bil; i++) {
            System.out.print(a + " ");
            a = a + b;
            b = a - b;
        }
    }
    static void rekursif(){
        System.out.println("======================================");
        System.out.println("Deret Fibonacci dengan Fungsi Rekursif");
        System.out.println("======================================");
        System.out.print("Masukkan Jumlah Deret Fibonacci : ");
        bil = input.nextInt();

        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < bil; i++) {
            int hasil = fibbonaci(i);
            System.out.print(hasil + " ");
        }
    }
    static int fibbonaci(int bil) {
        if (bil == 0 || bil == 1) {
            return bil;
        } else {
            return (fibbonaci(bil - 1) + fibbonaci(bil - 2));
        }
    }
}
