/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;
import java.util.Scanner;
import static percobaan.LinkedLists.menu;
import static percobaan.LinkedLists.menu1;
import static percobaan.LinkedLists.menu2;
import static percobaan.LinkedLists.menu3;

/**
 *
 * @author HP
 */
public class MainLinkedListsTambahan {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        LinkedLists data = new LinkedLists();
        int pilih;
        do {
            menu();
            int pilih1 = 0;
            int pilih2;
            int pilih3;

            System.out.println("Pilih Menu");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    do {
                        menu1();
                        System.out.print("Pilih Menu : ");
                        pilih = input.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.print("Masukkan data pertama : ");
                                int data1 = input.nextInt();
                                data.addFirst(data1);
                                break;
                            case 2:
                                System.out.print("Masukkan Masukkan index yang ingin diisi :");
                                int index1 = input.nextInt();
                                System.out.print("Masukkan isi index : ");
                                int data2 = input.nextInt();
                                try {
                                    data.add(data2, (index1 - 1));

                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 3:
                                System.out.print("Masukkan data index terakhir : ");
                                int data3 = input.nextInt();
                                data.addLast(data3);
                                data.print();
                        }

                    } while(pilih1==1 || pilih1==2 || pilih1==3);
                    break;
                case 2:
                    do {
                        menu2();
                        System.out.print("Pilih Menu : ");
                        pilih2 = input.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.print("Masukkan index yang ingin dihapus : ");
                                int hapus = input.nextInt();
                                        try{
                                            data.remove(hapus);
                                        } catch(Exception e){
                                            System.out.println(e.getMessage());
                                        }
                                break;
                            case 2:
                                System.out.print("Masukkan Masukkan index yang ingin dihapus :");
                                int hapus2 = input.nextInt();
                                try{
                                    data.removeValue(hapus2);
                                } catch(Exception e){
                                    System.out.println(e.getMessage());
                                }
                                
                                break;
                            case 3:
                                data.clear();
                                break;
                        }

                    } while(pilih==1 || pilih==2 || pilih ==3);
                    break;
                case 3:
                    do {
                        menu3();
                        System.out.print("Pilih Menu : ");
                        pilih3 = input.nextInt();
                        switch (pilih3) {
                            case 1:
                                System.out.print("Masukkan index yang dicari : ");
                                int cari = input.nextInt();
                                data.addByValue(cari, (cari-1));
                                break;
                            case 2:
                                System.out.print("Masukkan Masukkan data yang dicari :");
                                int cari2 = input.nextInt();
                                data.addFirst(cari2);
                                break;
                            case 3:
                                data.clear();
                                break;
                            case 4:
                                data.print();
                                break;
                        }

                    } while(pilih==1 || pilih==2 || pilih==3);
                    break;
            
            }
        }
    }
    
}
