/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Lenovo
 */
public class Queue {
    int max, front, size, rear;
    Nasabah[] q;

    public Queue(int m) {
        max = m;
        create();
    }

    public void create() {
        q = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Nasabah nas) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            q[rear] = nas;
            size++;
        }
    }

    public Nasabah dequeue() {
        Nasabah nas = null;
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
        } else {
            nas = q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return nas;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(q[i].nama + " " + q[i].noRekening);
                i = (i + 1) % max;
            }
            System.out.println(q[i].nama + " " + q[i].noRekening);
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    public void printFront() {
        int i = front;
        System.out.println("Front Data is : " + q[i].nama + " " + q[i].noRekening);
    }

    public void printRear() {
        int i = rear;
        System.out.println("Rear Data is : " + q[i].nama + " " + q[i].noRekening);
    }

    public void printPosition(String data) {
        int count = 0;
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int i = front;
            while (i != rear) {
                count++;
                if (data.equalsIgnoreCase(q[i].nama)) {
                    System.out.println("Data berada dalam Posisi: "
                            + count);
                    break;
                }
                i = (i + 1) % max;
            }
            System.out.println(q[i].nama + " " + q[i].noRekening);
        }
    }

    public void printNasabah(int posisi) {
        int count = 0;
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int i = front;
            while (i != rear) {
                count++;
                if (posisi == count) {
                    System.out.println("Posisi ke -" + (i + 1) + " : " + q[i].nama + " " + q[i].noRekening);
                    break;
                }
                i = (i + 1) % max;
            }
            System.out.println(q[i].nama + " " + q[i].noRekening);
        }
    }
}
