/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author HP
 */

public class LinkedLists {
    Node head;
    int size;

    public LinkedLists() {
    head = null;
    size =0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(int item) {
        head = new Node(item, head);
        size++;
    }
    
    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        else if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }
    public void addLast(int item){
       // Node baru = new Node(item);
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {                
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
        size++;
    }
    public  int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LibkedLists kosong");
        } 
        Node tmp = head;
        while (tmp.next != null) {            
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("NIlai index di luar batas");
        }
        Node tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("NIlai index di luar batas");
        }else{
            if(index==0){
                removeFirst();
            }else{
                 Node prev = head;
                 Node cur = head.next;
                 for (int i = 0; i < index; i++) {
                    prev = cur;
                    cur = prev.next;
                }
                 prev.next = cur.next;
                 size--;
            }
        }
    }
    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
    public void addByValue(int cari, int item)throws Exception{
        boolean a = true;
        Node tmp = head;
        while (tmp.data != cari){
            tmp = tmp.next;
        }
        tmp.next = new Node(item, null);
        size++;
    }
    public void removeValue(int data) throws Exception{
        Node prev = head;
        Node cur = head.next;
        for (int i = 1; i < size; i++) {
            if (data != prev.data) {
                prev = prev;
                cur = prev.next;
                
            }
            
        }
        prev.next = cur.next;
        size--;
    }
    public static void menu(){
        System.out.println("============");
        System.out.println("\tMenu");
        System.out.println("============");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Print");
        System.out.println("5. Keluar");
        System.out.println("============");
    }
    public static void menu1(){
        System.out.println("============");
        System.out.println("/tTambah");
        System.out.println("============");
        System.out.println("1. Tambah(First)");
        System.out.println("2. Tambah(Index)");
        System.out.println("3. Tambah(Last)");
        System.out.println("4. Kembali");
    }
    public static void menu2(){
        System.out.println("============");
        System.out.println("/tHapus");
        System.out.println("============");
        System.out.println("1. Hapus(Index)");
        System.out.println("2. Hapus(Key)");
        System.out.println("3. Clear");
        System.out.println("4. Kembali");
    }
    public static void menu3(){
        System.out.println("============");
        System.out.println("/tCari");
        System.out.println("============");
        System.out.println("1. Cari(Index)");
        System.out.println("2. Cari(Key)");
        System.out.println("3. Kembali");
    }
     public static void menu4(){
        System.out.println("============");
        System.out.println("/tKeluar");
        System.out.println("============");
     }
}