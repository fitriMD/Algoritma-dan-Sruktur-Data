/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1dan2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainDoubleLinkedList {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pilih = 0, nilai = 0, index;
        DoubleLinkedList dll = new DoubleLinkedList();

        try {
            do {
                System.out.println("================================");
                System.out.println("DOUBLE LINKED LIST DENGAN MENU");
                System.out.println("================================");
                System.out.println("Memilih menu :");
                System.out.println("1. Tambah awal");
                System.out.println("2. Tambah akhir");
                System.out.println("3. Tambah data index data tertentu");
                System.out.println("4. Hapus awal");
                System.out.println("5. Hapus akhir");
                System.out.println("6. Hapus index tertentu");
                System.out.println("7. Cetak data");
                System.out.println("8. Cari");
                // Tambahan menu untuk No.2
                System.out.println("9. Urutkan");
                System.out.println("10. Keluar");
                System.out.println("================================");
                System.out.print(">> ");
                pilih = sc.nextInt();
                System.out.println("================================");

                switch(pilih) {
                    case 1 :
                        System.out.print("Masukkan data : ");
                        nilai = sc.nextInt();
                        dll.addFirst(nilai);
                        break;
                        
                    case 2:
                        System.out.print("Masukkan data : ");
                        nilai = sc.nextInt();
                        dll.addLast(nilai);
                        break;
                        
                    case 3:
                        System.out.print("Masukkan data : ");
                        nilai = sc.nextInt();
                        System.out.print("Masukkan posisi index data : ");
                        index = sc.nextInt();
                        dll.add(nilai, index);
                        break;
                        
                    case 4:
                        dll.removeFirts();
                        break;
                        
                    case 5:
                        dll.removeLast();
                        break;
                        
                    case 6:
                        System.out.print("Masukkan index yang ingin dihapus : ");
                        index = sc.nextInt();
                        dll.remove(index);
                        break;
                        
                    case 7:
                        dll.print();
                        break;
                        
                    case 8:
                        System.out.print("Masukkan data yang ingin dicari : ");
                        nilai = sc.nextInt();
                        dll.cari(nilai);
                        break;
                        
                        //Tambahan Case untuk No.2
                    case 9:
                        dll.sort();
                        dll.print();
                  
                    case 10:
                        System.out.println("Terima Kasih");
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak tersedia!");
                        break;
                }
            }while (pilih != 10);

        } catch (Exception e){
            
        }
    }

}
