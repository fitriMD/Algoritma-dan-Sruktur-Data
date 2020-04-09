/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueu");
        System.out.println("2. Dequeu");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Print Nasabah");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Nasabah nas = null;
                    Q.enqueue(nas);
                    break;

                case 2:
                    int dataKeluar = sc.nextInt();
                    Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6 :
                    System.out.print("Input Data : "); 
                    String data = sc.next(); 
                    Q.peekPosition(data);
                    break;
                case 7 :
                    System.out.print("Input Position :");
                    int pos = sc.nextInt();
                    Q.printNasabah(pos);
                    
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
    
}
