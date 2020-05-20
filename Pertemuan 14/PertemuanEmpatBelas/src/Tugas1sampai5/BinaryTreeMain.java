/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1sampai5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int pilih, nilai;
        do {
            System.out.println("===================================");
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Find");
            System.out.println("4. Traverse InOrder");
            System.out.println("5. Traverse PreOrder");
            System.out.println("6. Traverse PostOrder");
            System.out.println("7. Keluar");
            System.out.println("===================================");
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            System.out.println("===================================");
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nilai: ");
                    nilai = sc.nextInt();
                    bt.add(nilai);
                    break;
                case 2:
                    System.out.print("Masukkan nilai: ");
                    nilai = sc.nextInt();
                    bt.delete(nilai);
                    break;
                case 3:
                    System.out.print("Masukkan nilai: ");
                    nilai = sc.nextInt();
                    bt.find(nilai);
                    System.out.println("");
                    break;
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println("");
                    break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println("");
                    break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Salah :v");
                    break;
            }
        } while (pilih != 7);
    }
}
