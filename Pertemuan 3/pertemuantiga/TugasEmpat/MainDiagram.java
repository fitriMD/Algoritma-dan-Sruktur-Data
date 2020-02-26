/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuantiga.TugasEmpat;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainDiagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("Pemilihan Presiden BEM Tahun 2020");
        System.out.println("===========================================");
        System.out.println("Kandidat Calon Presiden BEM");
        System.out.println("1. Haris");
        System.out.println("2. Bisma");
        System.out.println("3. Dian");
        System.out.println("4. Rani");
        
        System.out.println();
        System.out.print("Masukkan jumlah terkumpul suara : ");
        int x = sc.nextInt();
        System.out.println();
        
        Diagram pilihan = new Diagram(x);
        
        System.out.println("Masukkan suara terpilih dengan nomor kandidat");
        for(int i = 0; i < pilihan.x; i++){    
            System.out.print("Suara ke-" + (i+1) + " : ");
            pilihan.suara[i] = sc.nextInt();
        }
        pilihan.pilih(0);
        System.out.print("Presiden BEM Terpilih adalah : ");
        if(pilihan.c1 > pilihan.c2 && pilihan.c1 > pilihan.c3 && pilihan.c1 > pilihan.c4){
            System.out.println("Haris");
        }
        else if(pilihan.c2 > pilihan.c1 && pilihan.c2 > pilihan.c3 && pilihan.c2 > pilihan.c4){
            System.out.println("Bisma");
        }
        else if(pilihan.c3 > pilihan.c1 && pilihan.c3 > pilihan.c1 && pilihan.c3 > pilihan.c4){
            System.out.println("Dian");
        }
        else if(pilihan.c4 > pilihan.c1 && pilihan.c4 > pilihan.c2 && pilihan.c4 > pilihan.c1) {
            System.out.println("Rani");
        }

    }

}
