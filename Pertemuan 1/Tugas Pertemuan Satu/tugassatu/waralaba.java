/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class waralaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paket, pilih;
        int harga=0,menu,jumlah;
        double total=0;
        System.out.println("________________SELAMAT DATANG DI RESTORAN WARALABA_______________");
        System.out.println("________________________SELAMAT MENIKMATI_________________________");
        

        System.out.println("Pilihan Paket : ");
        System.out.println("\tA.Paket Chicken");
        System.out.println("\tB.Paket Oke");
        System.out.print("Pilih paket : ");
        pilih = sc.nextLine();

        if (pilih.equalsIgnoreCase("A")) {
            System.out.println("Pilihan menu : ");
            System.out.println("\t1.Chicken A (Rp.12.000)");
            System.out.println("\t2.Chicken B (Rp.15.000)");
            System.out.println("\t3.Chicken C (Rp.20.000)");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            if (menu == 1) {
                harga = 12000;   
            }else if (menu ==2) {
                harga = 15000;    
            }else if (menu==3) {
                harga = 20000;   
            }else
                System.out.println("Menu tidak tersedia");
           
            System.out.print("Jumlah pesanan: ");
            jumlah = sc.nextInt();
            total = harga * jumlah;
            System.out.println("Total biaya yang harus Anda bayar : Rp." + total);

        }else if (pilih.equalsIgnoreCase("B")) {
            System.out.println("Pilihan menu : ");
            System.out.println("\t1.Oke A (Rp.10.000)");
            System.out.println("\t2.Oke B (Rp.12.000)");
            System.out.println("\t3.Oke C (Rp.15.000)");
            System.out.print("Menu : ");
            menu = sc.nextInt();
            if (menu == 1) {
                harga = 10000;   
            }else if (menu ==2) {
                harga = 12000;    
            }else if (menu==3) {
                harga = 15000;   
            }else
                System.out.println("Menu tidak tersedia");
            System.out.print("Jumlah pesanan: ");
            jumlah = sc.nextInt();
            total = harga * jumlah;
            System.out.println("Total biaya yang harus Anda bayar : Rp." + total);
        }      
    }
}

