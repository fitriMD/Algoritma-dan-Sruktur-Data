/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author HP
 */
public class LinkedListsMhs {

    Node head;
    int size;

    public LinkedListsMhs() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim1, String nim2, String nim3) {
        head = new Node(nim1, nim2, nim3, head);
        size++;

    }

    public void add(String nim1, String nim2, String nim3) {
        if (isEmpty()) {
            addFirst(nim1, nim2, nim3);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(nim1, nim2, nim3, null);
            size++;

        }
    }

    public void addLast(String nim1, String nim2, String nim3) {
        // Node baru = new Node(nim1, nim2, nim3);
        if (isEmpty()) {
            addFirst(nim1, nim2, nim3);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(nim1, nim2, nim3, null);
        }
        size++;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.NIM + "\t");
                System.out.print(tmp.nama + "\t");
                System.out.println(tmp.alamat + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("LinkedLists kosong");
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void removeFirst(){
        head = head.next;
        size--;
    }

    public void removeByValue(String nim) {
        Node prev = head;
        Node cur = head.next;
        for (int i = 1; i < size; i++) {
            if (nim != prev.NIM) {
                prev = prev;
                cur = prev.next;
            }
        }
        prev.next = cur.next;
        size--;
    }

    public void searchkey(String key) {
        Node tmp = head;

        for (int i = 1; i < size; i++) {
            if (key != tmp.NIM) {

                tmp = tmp.next;

            }
        }
        System.out.println("Data yang anda cari : ");
        System.out.print(tmp.NIM + "\t");
        System.out.print(tmp.nama + "\t");
        System.out.println(tmp.alamat);
    }

}
