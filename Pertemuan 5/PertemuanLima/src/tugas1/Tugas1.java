/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Lenovo
 */
public class Tugas1 {

    String maskapai;
    float harga;
    int transitCount, flightTime;
    
    

    Tugas1(String m, float h, int tc, int ft) {
        this.maskapai = m;
        this.harga = h;
        this.transitCount= tc;
        this.flightTime = ft;
    }

    void tampil() {
        System.out.println("Nama Maskapai : "+maskapai);
        System.out.println("Harga Tiket : "+harga);
        System.out.println("Jumlah Transit : "+transitCount);
        System.out.println("Waktu Keberangkatan : "+flightTime);
       

    }
}
