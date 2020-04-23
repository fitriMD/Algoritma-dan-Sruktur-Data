/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author HP
 */
public class Main {
   
    public static void main(String[] args) {
        Quiz2 data = new Quiz2();
        Quiz2[] dat = new Quiz2[12];
        
        dat[0] = new Quiz2(475544, 2343240, 2845672);
        dat[1] = new Quiz2(1985572, 2546836, 3456566);
        dat[2] = new Quiz2(2076432, 2436456, 2341653);
        dat[3] = new Quiz2(2076432, 1943656, 2734562);
        dat[4] = new Quiz2(2165239, 2453425, 2534400);
        dat[5] = new Quiz2(2283546, 2754240, 2346307);
        dat[6] = new Quiz2(2344460, 3256404, 943734);
        dat[7] = new Quiz2(2635040, 3454645, 2234544);
        dat[8] = new Quiz2(2958672, 3698200, 2398636);
        dat[9] = new Quiz2(3047626, 4138479, 2345346);
        dat[10] = new Quiz2(2843543, 3743756, 1546256);
        dat[11] = new Quiz2(2734526, 3398320, 2453435);
        
        System.out.println("Bulan ke-\t2018\t2019\t2020");
        
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " \t\t" + data.data);
            
        }
    }
}
