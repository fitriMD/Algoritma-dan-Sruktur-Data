/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainLinkedListsBuku {

    static void menu() {
        System.out.println("====================");
        System.out.println("      MENU BUKU     ");
        System.out.println("====================");
        System.out.println("1.Tambah Buku");
        System.out.println("2.Tampil");
        System.out.println("3.Cari");
        System.out.println("4.keluar");
        System.out.println("====================");
    }

    static void menu2() {
        System.out.println("====================");
        System.out.println("     Menu Tampil    ");
        System.out.println("====================");
        System.out.println("1.Tampil Seluruh");
        System.out.println("2.Buku Rak pertama");
        System.out.println("3.Buku Rak terakhir");
        System.out.println("4.kembali");
        System.out.println("====================");
    }

    static void menu3() {
        System.out.println("====================");
        System.out.println("     Menu cari      ");
        System.out.println("====================");
        System.out.println("1.Cari Buku");
        System.out.println("2.Cari Urutan");
        System.out.println("3.kembali");
        System.out.println("====================");
    }

    public static void main(String[] args) {
        LinkedListsBuku book = new LinkedListsBuku();
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            menu();
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            try {
                int pilih2;
                int pilih3;
                switch (pilih) {
                    case 1:
                        System.out.println("-----------------------------");
                        System.out.println("Masukan Data Buku ");
                        System.out.print("Nomor Buku : ");
                        String noBuku = sc.next();
                        System.out.print("Judul : ");
                        String nama = sc.next();
                        book.add(noBuku, nama);
                        break;
                    case 2:
                        do {
                            menu2();
                            System.out.print("Pilih : ");
                            pilih2 = sc.nextInt();
                            System.out.println("------------------------------");

                            switch (pilih2) {
                                case 1:
                                    book.print();
                                    break;
                                case 2:
                                    book.getFirst();
                                    break;
                                case 3:
                                    book.getLast();
                                    break;
                            }
                        } while (pilih2 == 1 || pilih2 == 2 || pilih2 == 3);
                        break;
                    case 3:
                        do {
                            menu3();
                            System.out.print("Pilih : ");
                            pilih3 = sc.nextInt();

                            switch (pilih3) {
                                case 1:
                                    System.out.println("Mencari Buku");
                                    System.out.print("Nomor Buku : ");
                                    String noCari = sc.next();
                                    book.carikey(noCari);
                                    break;
                                case 2:
                                    System.out.println("Mencari Urutan ");
                                    System.out.print("Masukan urutan : ");
                                    int ur = sc.nextInt();
                                    book.cariindex(ur);
                                    break;

                            }
                        } while (pilih3 == 1 || pilih3 == 2);
                        break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}
