/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasLima;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class JjMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        JajarGenjang[] jgArray = new JajarGenjang[5];
        for (int i = 0; i < 5; i++) {
            jgArray[i] = new JajarGenjang(i,i,i);
            System.out.println("Jajar Genjang ke-" + (i+1));
            System.out.print("Masukkan Tinggi : ");
            jgArray[i].tinggi = sc.nextInt();
            System.out.print("Masukkan Panjang : ");
            jgArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Sisi Miring : ");
            jgArray[i].sisiMiring = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Luas jajar genjang ke-" + (i+1) + " : " + jgArray[i].hitungLuas());
            System.out.println("Keliling jajar genjang ke-" + (i+1) + " : " + jgArray[i].hitungKeliling());

        }

    }
    
}
