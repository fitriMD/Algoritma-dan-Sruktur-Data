/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BFDC;

import static BFDC.minMax.max_min;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainMinMax {

    public static void main(String[] args) {
        // TODO code application logic here
        minMax[] ppArray = new minMax[5];//O(1)
        ppArray[0] = new minMax();//O(1)

        Scanner sc = new Scanner(System.in);//O(1)

        for (int i = 0; i < 5; i++) {//O(n)
            ppArray[i] = new minMax();//O(1)
            System.out.println("Nilai array indeks ke-" + i);//O(1)
            System.out.print("Masukkan nilai : ");//O(1)
            ppArray[i].nilaiArray = sc.nextInt();//O(1)

        }
        int min = ppArray[0].nilaiArray;//O(1)
        int max = ppArray[0].nilaiArray;//O(1)
        for (int i = 0; i < 5; i++) {//O(n)
            if (ppArray[i].nilaiArray < min) {//O(1)
                min = ppArray[i].nilaiArray;//O(1)
            } else if (ppArray[i].nilaiArray > max) {//O(1)
                max = ppArray[i].nilaiArray;//O(1)

            }
        }
        System.out.println("Brute Force");//O(1)
        System.out.println("Nilai Minimal : " + min);//O(1)
        System.out.println("Nilai Maksimal : " + max);//0(1)

        int arr[] = new int[5];//O(1)
        for (int i = 0; i < 5; i++) {//O(n)
            arr[i] = ppArray[i].nilaiArray;//O(1)
        }
        Maxmin hasil = new Maxmin();//O(1)

        max_min(arr, 0, 4, hasil);//O(1)
        System.out.println("Divide Conquer");//O(1)
        System.out.print("Nilai Minimal : " + hasil.minimum + "\nNilai Maksimaly : " + hasil.maximum);//O(1)
        System.out.println("\n");//O(1)

        //notasi Big O
        //O(1+1+1+n*1*1*1*1+1+1+n*(1+1)+(1+1)+1+1+1+1+n*1+1+1+1+1+1)
        //O(3+n+2+4n+4+n+5)
        //O(6n+14)
        //O(n)
    }

}
