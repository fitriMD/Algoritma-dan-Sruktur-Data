/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTiga;

/**
 *
 * @author Lenovo
 */
public class Barang {
    public String nama;
    public int hargaSatuan,jumlah;
    
    public int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }
    public int hitungDiskon(){
        if (hitungHargaTotal()>100000) {
            jumlah=(int) (hitungHargaTotal()*0.1);
            
        }else if (hitungHargaTotal()>50000) {
            jumlah =(int) (hitungHargaTotal()*0.05);
            
        }else  {
            System.out.println("Tidak mendapatkan diskon");
        }
        return jumlah;
    }
    public int hitungHargaBayar(){
        return hitungHargaTotal()-hitungDiskon();
    }
    
}
