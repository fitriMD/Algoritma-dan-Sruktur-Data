/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasLima;


/**
 *
 * @author Lenovo
 */
public class JajarGenjang {

    public int tinggi;
    public int panjang;
    public int sisiMiring;

    public JajarGenjang(int tinggi, int panjang, int sisiMiring) {
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.sisiMiring = sisiMiring;
    }
    public int hitungKeliling() {
        return 2 * (panjang + sisiMiring);
    }

    public int hitungLuas() {
        return panjang * tinggi;
    }
     

}
