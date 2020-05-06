/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainDoubleLinkedList {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pilih = 0, nilai = 0, indeks;
        String nm;
        DoubleLinkedList dll = new DoubleLinkedList();
        try {
            do {
                System.out.println("=====================================");
                System.out.println("DOUBLE LINKED LIST DENGAN MENU");
                System.out.println("=====================================");
                System.out.println("Memilih menu: ");
                System.out.println("1. Tambah awal");
                System.out.println("2. Tambah akhir");
                System.out.println("3. Tambah data index data tertentu");
                System.out.println("4. Hapus awal");
                System.out.println("5. Hapus akhir");
                System.out.println("6. Hapus index tertentu");
                System.out.println("7. Cetak data");
                System.out.println("8. Urutkan");
                System.out.println("9. Keluar");
                System.out.println("=====================================");
                System.out.print(">> ");
                pilih = sc.nextInt();
                System.out.println("=====================================");
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan nama: ");
                        nm = sc.next();
                        sc.nextLine();
                        System.out.print("Masukkan nilai: ");
                        nilai = sc.nextInt();
                        dll.addFirst(nm, nilai);
                        break;
                    case 2:
                        System.out.print("Masukkan nama: ");
                        nm = sc.next();
                        sc.nextLine();
                        System.out.print("Masukkan nilai: ");
                        nilai = sc.nextInt();
                        dll.addLast(nm, nilai);
                        break;
                    case 3:
                        System.out.print("Masukkan nama: ");
                        nm = sc.next();
                        sc.nextLine();
                        System.out.print("Masukkan nilai: ");
                        nilai = sc.nextInt();
                        System.out.print("Masukkan posisi index data: ");
                        indeks = sc.nextInt();
                        dll.add(nm, nilai, indeks);
                        break;
                    case 4:
                        dll.removeFirst();
                        break;
                    case 5:
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan index yang ingin dihapus: ");
                        indeks = sc.nextInt();
                        dll.remove(indeks);
                        break;
                    case 7:
                        dll.print();
                        break;
                    case 8:
                        dll.sort();
                        dll.print();
                    case 9:
                        System.out.println("Terima Kasih :)");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan salah");
                        break;
                }
            } while (pilih != 9);
        } catch (Exception e) {
        }
    }
}

