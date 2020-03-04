/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasDua;

/**
 *
 * @author Lenovo
 */
public class Fibonacci {

    public int fibbonaciDC(int bil) {
        if (bil<=1) {
            return bil;
        } else {
            return (fibbonaciDC(bil - 1) + fibbonaciDC(bil - 2));
        }
    }
    public int FibonacciBF(int x){
        int arr[];
        arr = new int [x+2];
        arr[0]=0; 
        arr[1]=1;
        
        for (int i = 2; i <= x; i++) {
            arr[i] = arr[i-1]+arr[i-2];
            
        }
        return arr[(int)x];
    }
}
