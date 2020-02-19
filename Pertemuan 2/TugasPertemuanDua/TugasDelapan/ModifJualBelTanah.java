/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasDelapan;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ModifJualBelTanah {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  JualBeliTanah t1 = new JualBeliTanah();
        
        System.out.print("Masukkan Jumlah Tanah : ");
        int t = sc.nextInt();
        JualBeliTanah[] t2 =new JualBeliTanah[t];
        
        for (int i = 0; i < t; i++) {
            t2[i]= new JualBeliTanah();
            System.out.println("Tanah "+(i+1));
            System.out.print("Panjang : ");
            t2[i].panjang= sc.nextInt();
            System.out.print("Lebar : ");
            t2[i].lebar= sc.nextInt();
            
            System.out.println("================");
        }
            for (int j = 0; j < t; j++) {
            System.out.println("Luas Tanah "+ (j+1) +"="+ t2[j].HitungLuas());
    
            }
         int m = 1;
         int terluas = 0;
         int ke = 0;
         
         for (int j = 0; j < t; j++) {
             if (t2[j].HitungLuas()>terluas) {
             terluas=t2[j].HitungLuas();
             ke=m;
             }
             m++;        
        }

        System.out.println("palig luas = "+ke);
            
      
    }
    
    
}
