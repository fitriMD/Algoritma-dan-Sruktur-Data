/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasEnam;

/**
 *
 * @author Lenovo
 */
public class JualBeliTanah {

    public int n, panjang, lebar;

    public JualBeliTanah(int panjang, int lebar) {
        this.lebar = lebar;
        this.panjang = panjang;
    }

    JualBeliTanah() {
     
    }

    public int HitungLuas() {
        return panjang * lebar;
    }
}
