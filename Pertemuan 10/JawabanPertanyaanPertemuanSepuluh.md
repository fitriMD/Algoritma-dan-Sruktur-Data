## Jawaban Pertanyaan Pertemuan Sepuluh
1. Fungsi dari atribut Q adalah deklarasi dari antrian yang akan menyimpan data queue
2. MAX : variabel untuk menyimpan banyak data maksimal yang bisa disimpan di dalam queue
SIZE : variabel untuk menyimpan berapa banyak data yang ada dalam antrian
FRONT : variabel untuk menyimpan nilai indeks array data terdepan
REAR : variabel untuk menyimpan nilai indeks array data paling belakang
3. front dan rear bernilai -1 karena tidak menunjuk ke data manapun
4. Maka batas dari banyak elemen adalah max-1 karena queue dalam kondisi penuh jika max-1
5. Untuk mengecek apakah posisi REAR berada pada indeks terakhir array. Jika benar, maka posisi REAR selanjutnya adalah di indeks 0
6. rear == max - 1
7. Karena dengan menggunakan tipe kembalian int maka akan akan ditampilkan data terbaru setelah diambil salah satu elemennya dan Jika queue kosong, maka tidak ada data yang bisa diambil
8. else {
     front++;
   }
9. Untuk mengecek apakah posisi FRONT saat ini berada di indeks terakhir array. Jika benar, maka FRONT selanjutnya diletakkan di indeks 0
10. data = Q[front]
11. Karena pada proses ini dilakukan looping semua isi array mulai dari indeks front sampai dengan indeks rear. Looping tidak selalu dilakukan dari indeks ke-0 karena front tidak selalu berada di indeks ke-0
12. Jika i=font, maka apabila dilakukan pengulangan maka akan digunakan rumus tersebut untuk menampilkan data dalam queue selanjutnya misal i=0 i = (0+1)%4 hasilnya adalah 1, maka akan ditampilkan data pada array ke 1
13. CLASS
package minggu10;

/**
 *
 * @author Lenovo
 */
public class Queue {

    public int max, size, front, rear;
    public int[] Q;

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + Q[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;

    }

     public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen paling belakang: " + Q[rear]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

}


MAIN
package minggu10;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class QueueMain {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueu");
        System.out.println("2. Dequeu");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

}
