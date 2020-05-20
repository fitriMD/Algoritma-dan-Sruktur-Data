/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        Scanner sc = new Scanner(System.in);

        // int data[] = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        int nilai, i;
        for (i = 0; i < bta.data.length; i++) {
            System.out.println("Indeks ke-" + i);
            System.out.print("Masukkan nilai: ");
            nilai = sc.nextInt();
            bta.add(nilai);
            System.out.println("=======================");
        }
        bta.populateData(bta.data, idxLast);
        bta.traverseInOrder(0);
        System.out.println("");
        bta.traversePostOrder(0);
        System.out.println("");
        bta.traversePreOrder(0);
        System.out.println("");
    }
}
