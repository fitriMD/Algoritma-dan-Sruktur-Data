/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LigaInggris {
    public String nama;
    public int p;
    public int gd;
    public int pts;
    LigaInggris list[] = new LigaInggris[20];
    LigaInggris li ;
    int id;

    public LigaInggris(String nama, int p, int gd, int pts) {
        this.nama = nama;
        this.p = p;
        this.gd = gd;
        this.pts = pts;
    }

    public LigaInggris() {
    }
    
    public void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Pelanggaran = "+p);
        System.out.println("Gol = "+gd);
        System.out.println("Poin = "+pts);
    }
    
    public void tambah(LigaInggris lg){
        if (id<list.length) {
            list[id] = lg;
            id++;
        }else{
        //    System.out.println("Data sudah penuh!!");
        }
    }
    public void insertionSort(){
        int i,j;
        for (i = 1; i < list.length; i++) {
            LigaInggris ling = new LigaInggris();
            ling = list[i];
            j=i ;
            while((j>0) && (list[j-1].pts > ling.pts)){
                list[j] = list[j-1];
                j--;
            }
            list[j] = ling;
        }
        for(LigaInggris l : list){
            l.tampil();
            System.out.println("------------------------------");
        }
    }
    
    public void insertionSortds(){
        int i,j;
        for (i = 1; i < list.length; i++) {
            LigaInggris ling = new LigaInggris();
            ling = list[i];
            j=i ;
            while((j>0) && (list[j-1].pts < ling.pts)){
                list[j] = list[j-1];
                j--;
            }
            list[j] = ling;
        }
        for(LigaInggris l : list){
            l.tampil();
            System.out.println("------------------------------");
        }
    }
    
    public static void main(String[] args) {
        LigaInggris list[] = new LigaInggris[4];
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        LigaInggris li = new LigaInggris();
        
        LigaInggris[] L = new LigaInggris[20];

        L[0] = new LigaInggris("Manchester United", 28, 12, 42);
        L[1] = new LigaInggris("Tottenham Hotspur", 29, 7, 41);
        L[2] = new LigaInggris("Arsenal", 28, 4, 40);
        L[3] = new LigaInggris("Burnley", 29, -6, 39);
        L[4] = new LigaInggris("Crystal Palace", 29, -6, 39);
        L[5] = new LigaInggris("Everton", 29, -6, 37);
        L[6] = new LigaInggris("Liverpool", 29, 45, 82);
        L[7] = new LigaInggris("Manchester City", 27, 39, 57);
        L[8] = new LigaInggris("Leicester", 28, 26, 50);
        L[9] = new LigaInggris("Newcastle United", 29, -16, 35);
        L[10] = new LigaInggris("Southampton", 29, -17, 34);
        L[11] = new LigaInggris("Brighton & Hove Albion", 29, -8, 29);
        L[12] = new LigaInggris("Chelsea", 29, 9, 48);
        L[13] = new LigaInggris("Wolverhampton Wanderers", 29, 7, 43);
        L[14] = new LigaInggris("Sheffield United", 28, 5, 43);
        L[15] = new LigaInggris("West Ham United", 29, -15, 27);
        L[16] = new LigaInggris("Watford", 29, -17, 27);
        L[17] = new LigaInggris("AFC Bournemouth", 29, -18, 27);
        L[18] = new LigaInggris("Aston Villa", 27, -18, 25);
        L[19] = new LigaInggris("Norwich City", 29, -27, 21);
        
        for (int i = 0; i < 20; i++) {
            li.tambah(L[i]);
        }
        System.out.println();
        System.out.println("Data harga menurut sorting Insertion sort ascending = ");
        li.insertionSort();
        System.out.println();
        System.out.println("Data harga menurut sorting Insertion sort descanding= ");
        li.insertionSortds();
    }
}