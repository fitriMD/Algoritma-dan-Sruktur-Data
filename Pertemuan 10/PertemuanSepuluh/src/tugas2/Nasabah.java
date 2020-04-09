/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Lenovo
 */
public class Nasabah {
    String noRekening;
    String nama;
    
    public Nasabah(String noRek, String nm) { 
        noRekening = noRek;
        nama = nm;
    }
    
    public void print(){
        System.out.println("Nama Nasabah : " + nama);
        System.out.println("Nomor Rekening : " + noRekening);
    }
}
