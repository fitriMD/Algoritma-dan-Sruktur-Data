/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasDua;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ProgramVideoGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoGame v1= new VideoGame();
        
        System.out.print("Masukkan Id : ");
        v1.id = sc.nextInt();
        System.out.print("Masukkan Nama Member: ");
        v1.namaMember = sc.next();
        System.out.print("Masukan Nama Game : ");
        v1.namaGame = sc.next();
        System.out.print("Masukkan Lama Pinjam : ");
        v1.hari = sc.nextInt();
        System.out.print("Masukkan harga sewa : ");
        v1.harga = sc.nextInt();

        v1.data();
    
    }
    
}
