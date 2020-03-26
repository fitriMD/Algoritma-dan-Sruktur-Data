/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class StackMainModif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jumlah = sc.nextInt();
        int data[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data ke-" + (i + 1) + " : ");
            data[i] = sc.nextInt();
        }
        Stack pencarian = new Stack (data, jumlah);
        System.out.println("Isi Stack : ");
        pencarian.TampilData();
        Stack tumpukan = new Stack(jumlah);
        

        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }

}
