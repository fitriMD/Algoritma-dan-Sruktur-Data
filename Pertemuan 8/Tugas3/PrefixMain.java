/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PrefixMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String P, Q, tmp = "";
        System.out.print("Masukkan ekspresi matematika : ");
        Q = input.nextLine();
        for (int i = (Q.length()-1); i >= 0; i--) {
            tmp = tmp + Q.charAt(i);
            
        }
        tmp = tmp.trim();
        tmp = tmp + "(";
        int total = tmp.length();
        Prefix pref = new Prefix(total);
        P = pref.konversi(tmp);
        System.out.println("Prefix : "+new StringBuffer(P).reverse());
    }

}
