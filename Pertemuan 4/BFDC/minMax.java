/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BFDC;

/**
 *
 * @author Lenovo
 */

public class minMax {
    public int nilaiArray;//O(1)

    public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, Maxmin hasil) {//O(1)
        int indeks_tengah;//O(1)
        Maxmin hasil1 = new Maxmin();//0(1)
        Maxmin hasil2 = new Maxmin();//O(1)

        if (indeks_awal == indeks_akhir) {//O(1)
            hasil.minimum = hasil.maximum = arr[indeks_awal];//O(1)

        } else if (indeks_akhir - indeks_awal == 1) {//O(1)
            if (arr[indeks_awal] > arr[indeks_akhir]) {//O(1)
                hasil.minimum = arr[indeks_akhir];//O(1)
                hasil.maximum = arr[indeks_awal];//O(1)

            } else {
                hasil.minimum = arr[indeks_awal];//O(1)
                hasil.maximum = arr[indeks_akhir];//0(1)

            }

        } else {
            indeks_tengah = (indeks_awal + indeks_akhir)/2;//O(1)
            max_min(arr, indeks_awal, indeks_tengah, hasil1);//O(K^n)
            max_min(arr, indeks_tengah+1, indeks_akhir, hasil2);//O(K^n)
            
            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum;//O(1)
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum;//O(1)
        }
        
        //Notasi Big O
        //O(1+1+1+1+1+1+1+1+1+1+1+1+1+1+(K^n)+(K^n)+1+1)
        //O(14+2(K^n)+2)
        //O(16+2(K^n))
        //O(K^n)
    }
    
}
