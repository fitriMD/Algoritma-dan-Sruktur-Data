/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Lenovo
 */
public class Tiket {

    Tugas1 listTiket[] = new Tugas1[3];
    int idx;

    void tambah(Tugas1 t) {
        if (idx < listTiket.length) {
            listTiket[idx] = t;
            idx++;
        } else {
            System.out.print("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Tugas1 t : listTiket) {
            t.tampil();
            System.out.println("===========================");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listTiket.length - 1; i++) {
            for (int j = 1; j < listTiket.length - i; j++) {
                if (listTiket[j].harga < listTiket[j - 1].harga) {
                    Tugas1 psw = listTiket[j];
                    listTiket[j] = listTiket[j - 1];
                    listTiket[j - 1] = psw;

                }

            }

        }

    }
    void selectionSort() {
    for (int i = 0; i < listTiket.length; i++) {
        int idxMin = i;
        for (int j = i + 1; j < listTiket.length; j++) {
            if (listTiket[j].harga < listTiket[idxMin].harga) {
                idxMin = j;

            }

        }
        Tugas1 psw = listTiket[idxMin];
        listTiket[idxMin] = listTiket[i];
        listTiket[i] = psw;

    }
}
    
}
