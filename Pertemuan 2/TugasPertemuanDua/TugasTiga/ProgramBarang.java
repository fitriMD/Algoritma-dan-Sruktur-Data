/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTiga;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ProgramBarang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang b1 = new Barang();

        System.out.print("Masukkan Nama : ");
        b1.nama = sc.next();
        System.out.print("Masukkan Harga : ");
        b1.hargaSatuan = sc.nextInt();
        System.out.print("Masukkan Jumlah : ");
        b1.jumlah= sc.nextInt();
        
        System.out.println("================");
        System.out.println("Nama : " + b1.nama);
        System.out.println("Harga : "+b1.hargaSatuan);
        System.out.println("Jumlah : "+b1.jumlah);
        System.out.println("Total Bayar : " + b1.hitungHargaBayar());
        
    }

}
