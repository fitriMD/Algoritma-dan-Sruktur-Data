/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumsatu;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y;
        
        System.out.print("Masukkan bilangan : ");
        y = input.nextInt();
        
        if (y%2==0 && y%6!=0 && y%15 != 0) {
            System.out.println("Bilangan kelipatan 2");
            
        }else if (y%6==0 && y%15 != 0) {
            System.out.println("Bilangan kelipatan 6");
            
        }else if (y%15 == 0) {
            System.out.println("Bilangan kelipatan 15");
            
        }else{
            System.out.println("Bilangan Bukan Kelipatan 2,6, ataupun 15");
        }
        
    }
    
}
