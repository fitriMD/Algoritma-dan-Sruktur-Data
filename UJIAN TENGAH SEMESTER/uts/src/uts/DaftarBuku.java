/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Lenovo
 */
public class DaftarBuku {
    Buku listBuku[] = new Buku[5];
    public int[] data;
    int idx;
    int length;
    
    void tambah(Buku b) {
        if (idx < listBuku.length) {
            listBuku[idx] = b;
            idx++;
        } else {
            System.out.print("Data sudah penuh!!");
        }
    }
    
    public void tampil() {
        for (Buku b : listBuku) {
            b.tampil1();
            System.out.println("===========================");

        }
    }
    
    
    public void bubbleSort(){
        for (int i = 0; i < listBuku.length - 1; i++) {
            for (int j = 1; j < listBuku.length  - i; j++) {
                if (listBuku[j].tinggiBuku> listBuku[j - 1].tinggiBuku) {
                    Buku tmp = listBuku[j];
                    listBuku[j] = listBuku[j - 1];
                    listBuku[j - 1] = tmp;

                }

            }

        }
        
    }
    public int binarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == data[mid]) {
                return (mid);
                
            }else if (data[mid] > cari) {
                return binarySearch(cari, left, mid - 1);
                
            }else {
                return binarySearch(cari, mid + 1, right);
            }
            
        }
        return -1;
        
    }
   



}
