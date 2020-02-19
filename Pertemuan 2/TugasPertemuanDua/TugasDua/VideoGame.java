/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasDua;

/**
 *
 * @author Lenovo
 */
public class VideoGame {

    public int id, hari, harga;
    public String namaMember, namaGame;

    public int hitungTotal() {
        return hari * harga;
    }

    public void data() {
        System.out.println("Id : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game : " + namaGame);
        System.out.println("Lama Pinjam : " + hari);
        System.out.println("Harga Sewa per Hari : " + harga);
        System.out.println("Total yang harus dibayar : " + hitungTotal());

    }

}
