/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideConquer;

/**
 *
 * @author Lenovo
 */
public class DivideConquer {
    public int numDisc;
    public char source;
    
    static void DivideConquer(int numDisc, char source, char destination, char spare){
         
        if (numDisc==1) {
            System.out.println("Pindah gelang 1 dari tower "+source+" ke tower "+destination);
            return;
            
        }
        DivideConquer(numDisc-1, source, spare, destination);
        System.out.println("Pindah gelang "+numDisc+" Dari tower "+source+" Ke tower "+destination);
        DivideConquer(numDisc-1, spare, destination, source);
    }
    public static void main(String[] args) {
        int numDesc=4;
        DivideConquer(numDesc,'A','C','B');
    }
    
}
