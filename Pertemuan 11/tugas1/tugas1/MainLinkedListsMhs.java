/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainLinkedListsMhs {

    static void menu() {
        System.out.println("======================");
        System.out.println("     PILIHAN MENU     ");
        System.out.println("======================");
        System.out.println("1.Tambah Mahasiswa");
        System.out.println("2.Hapus Mahasiswa");
        System.out.println("3.Tampil Mahasiswa");
        System.out.println("4.Keluar");
        System.out.println("======================");

    }

    public static void main(String[] args) {
        LinkedListsMhs mhs = new LinkedListsMhs();
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            menu();
            System.out.print("Pilihan : ");
            pilih = input.nextInt();
            try {
                switch (pilih) {

                    case 1:
                        System.out.println("Masukkan Biodata Mahasiswa ");
                        System.out.print("NIM : ");
                        String nim = input.next();
                        System.out.print("Nama : ");
                        String nama = input.next();
                        System.out.print("Alamat : ");
                        String alamat = input.next();
                        mhs.add(nim, nama, alamat);
                        break;
                    case 2:
                        System.out.println("Hapus Data Mahasiswa");
                        mhs.print();
                        System.out.println("Masukkan NIM Mahasiswa yang ingin dihapus : ");
                        System.out.print("NIM : ");
                        String hapus = input.next();
                        mhs.removeByValue(hapus);
                        break;
                    case 3:
                        mhs.print();
                        System.out.println("");
                        System.out.println("============================================");
                        System.out.println("Apakah anda cari data mahasiswa : (Y/N)");
                        char pilih2 = input.next().charAt(0);
                        if (pilih2 == 'Y' || pilih2 == 'y') {
                            System.out.println("Masukkan NIM yang ingin anda cari : ");
                            String cari = input.next();
                            mhs.searchkey(cari);

                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}
