/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author Lenovo
 */
public class Barang {
    //kalau bikin class lebih baik diawali huruf besar
    public String namaBarang, jenisBarang,jenisKain,merek;
    public int stok,hargaSatuan;
    
    public Barang(){
        
    }
    public Barang(String nm, String jn,int st,int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
        
    } 
    
    public void tampilBarang(){
        System.out.println("Nama = "+namaBarang);
        System.out.println("Jenis = "+jenisBarang);
        System.out.println("Stok = "+stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }
    public void tambahStok(int n){
        stok = stok+n;
    }
    public void kurangiStok(int n){
        //if(stok>0){
            stok = stok-n;
        //}else{
            //System.out.println("Stok kosong");
        //}
        
    }
    public int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
    
    
}
