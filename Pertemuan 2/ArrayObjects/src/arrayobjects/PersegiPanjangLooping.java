 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjects;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjangLooping {

    public int panjang;
    public int lebar;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        for (int i = 0; i < 3; i++) {
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[0].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[0].lebar = sc.nextInt();

        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        }

    }

}
