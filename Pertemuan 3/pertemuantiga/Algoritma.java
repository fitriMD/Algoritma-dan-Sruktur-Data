/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuantiga;

/**
 *
 * @author Lenovo
 */
public class Algoritma {

    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;

    public Algoritma(String namaMhs, int nilaiTugas, int nilaiKuis, int nilaiUTS, int nilaiUAS) {
        this.namaMhs = namaMhs;
        this.nilaiTugas = nilaiTugas;
        this.nilaiKuis = nilaiKuis;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;

    }

    Algoritma() {

    }

    public double hitungTotalNilai() {
        int nilaiTotal = (int) ((nilaiTugas * 0.3) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiKuis * 0.2));
        return nilaiTotal;
    }
    public double hitungTotalNilai(int tugas, int kuis, int UTS, int UAS){
        return (tugas * 0.3) + (kuis * 0.2) + (UTS * 0.2) + (UAS * 0.3);
    }

}
