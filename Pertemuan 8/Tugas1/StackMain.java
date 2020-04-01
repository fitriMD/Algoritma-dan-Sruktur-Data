  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kata : ");
        int jum = sc.nextInt();
        Stack tumpukan = new Stack(jum);
        String data[] = new String[jum];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan kata ke-"+(i+1)+ " : ");
            data[i] = sc1.nextLine();
            tumpukan.push(data[i]);
            
        }
        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
    
}
