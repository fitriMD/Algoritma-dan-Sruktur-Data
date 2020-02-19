/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasEnam;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class ProgramJualBeliTanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JualBeliTanah t1 = new JualBeliTanah();
        
        System.out.print("Masukkan Jumlah Tanah : ");
        int t = sc.nextInt();
        
        for (int i = 1; i <= t; i++) {
            System.out.println("Tanah "+i);
            System.out.print("Panjang : ");
            t1.panjang= sc.nextInt();
            System.out.print("Lebar : ");
            t1.lebar= sc.nextInt();
            
            System.out.println("================");
        }
            for (int j = 0; j < t; j++) {
            System.out.println("Luas Tanah = "+ (j+1) + t1.HitungLuas());
    
            }
            

        
            
      
    }
    
}
