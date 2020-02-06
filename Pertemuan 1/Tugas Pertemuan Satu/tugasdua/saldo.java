/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdua;

/**
 *
 * @author Lenovo
 */
public class saldo {
    public static void main(String[] args) {
        double uang=1000000,bunga=0.02;
        int bulan=0;
        System.out.println("Uang Anda sebesar = Rp."+uang);
        for (bulan=0 ; uang < 1500000; bulan++) {
            uang += uang*bunga;
        }
        System.out.printf("Pada bulan ke- %d\nUang Anda berjumlah = Rp%,.2f",bulan,uang);
    }
    
}
