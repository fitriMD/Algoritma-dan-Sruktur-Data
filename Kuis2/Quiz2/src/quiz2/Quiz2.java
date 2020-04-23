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
public class Quiz2 {
    public int id;
    Quiz2 data[] = new Quiz2[20];

    Node head;
    int size;

    public Quiz2(int i, int i0, int i1) {
        head = null;
        size = 0;
    }

    public Quiz2() {
       
    }
    

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int tahun) {
        head = new Node(tahun, head);
        size++;
    }

    public void add(int tahun) {
        if (isEmpty()) {
            addFirst(tahun);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(tahun, null);
            size++;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.tahun;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LibkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.tahun;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("NIlai index di luar batas");
        }
        Node tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.tahun;
    }
     public void removeFirst() throws Exception {
        head = head.next;
        size--;
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
     public void tambah(Quiz2 d){
        if (id<data.length) {
            data[id] = d;
            id++;
        }else{
        //    System.out.println("Data sudah penuh!!");
        }
    }
    
    
}
