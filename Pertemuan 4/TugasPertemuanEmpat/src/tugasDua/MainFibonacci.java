/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasDua;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//O(1)
        Fibonacci F1 = new  Fibonacci();//O(1)
        
        System.out.println("===================Deret Fibonacci=================");//O(1)
        System.out.print("Masukkan Jumlah Deret Fibonacci : ");//O(1)
        int x = sc.nextInt();//O(1)
        System.out.println("==================================================");//O(1)
        System.out.println("Hasil bilangan Fibonacci dengan Brute Force : ");//O(1)
        System.out.println("==================================================");//O(1)
        for (int i = 0; i < x; i++) {//O(n)
            System.out.println(F1.FibonacciBF(i));//O(1)
            
        }
        System.out.println("==================================================");//O(1)
        System.out.println("Hasil bilangan Fibonacci dengan Divide Conquer : ");//O(1)
        System.out.println("==================================================");//O(1)
        for (int i = 0; i < x; i++) {//O(n)
            System.out.println(F1.fibbonaciDC(i));//O(1)
            
        }
        
        //Notasi Big O
        //O()
        
        
        
    }
    
}
