/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslima;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class fungsi {
    static Scanner input = new Scanner(System.in);
    static double alas,tinggi,sisi,jari,phi=3.14;
    static double luasSeg,luasempat,luasLing;
    static String menu;
    static void luasSegitiga (double luasSeg){
        System.out.println("===========LUAS SEGITIGA==========");
        System.out.print("Masukkan Alas : ");
        alas = input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        tinggi = input.nextInt();
        luasSeg = (alas*tinggi)/2;
        System.out.println("Luas Segitiga Adalah : "+luasSeg);
        
    }
    static void luasSegiempat (double luasempat){
        System.out.println("===========LUAS SEGIEMPAT==========");
        System.out.print("Masukkan Sisi : ");
        sisi = input.nextInt();
        luasempat = (sisi*sisi);
        System.out.println("Luas Segiempat Adalah : "+luasempat);   
    }
    static void luasLingkaran (double luasLing){
        System.out.println("===========LUAS LINGKARAN==========");
        System.out.print("Masukkan jari2 : ");
        jari = input.nextInt();
        luasLing = phi*(jari*jari);
        System.out.println("Luas Lingkaran Adalah : "+luasLing);
    }
    static void plihanMenu (String menu){ 
        System.out.println("a. Menghitung Luas Segitiga");
        System.out.println("b. Menghitung Luas Segiempat");
        System.out.println("c. Menghitung Luas Lingkaran");
    }
    
    public static void main(String[] args) {
        String pilih;
        plihanMenu(menu);
        System.out.print("Pilih menu : ");
        pilih = input.nextLine();
        if (pilih.equalsIgnoreCase("a")) {
            luasSegitiga(luasSeg);    
        }else if (pilih.equalsIgnoreCase("b")) {
            luasSegiempat(luasempat);  
        }else if (pilih.equalsIgnoreCase("c")) {
            luasLingkaran(luasLing);   
        }else
            System.out.println("Menu tidak tersedia");
    } 
}

