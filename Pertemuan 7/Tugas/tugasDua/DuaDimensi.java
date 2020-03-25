/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasDua;

/**
 *
 * @author Lenovo
 */
public class DuaDimensi {
    public int[][] data;
    public int baris, kolom;

    public DuaDimensi(int[][] Data, int b, int k) {
        this.baris = b;
        this.kolom = k;
        data = new int[b][k];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                data[i][j] = Data[i][j];
            }
        }
    }

    public int[] FindSeqSearch(int cari) {
        int[] posisi = new int[2];
        posisi[0] = -1;
        posisi[1] = -1;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (data[i][j] == cari) {
                    posisi[0] = i;
                    posisi[1] = j;
                    break;
                }
            }
        }
        return posisi;
    }
    
    public void TampilData() {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void Tampilposisi(int x, int[] pos)
    {
        if (pos[0] != -1 && pos[1] != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks (" + pos[0] + "," + pos[1] + ")");
        }
        else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}

