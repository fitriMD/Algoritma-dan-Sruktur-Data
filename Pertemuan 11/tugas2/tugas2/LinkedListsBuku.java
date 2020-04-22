/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author HP
 */
public class LinkedListsBuku {

    NodeBukuQueue head;
    int size;

    public LinkedListsBuku() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(String nobuk,String judul){
        head = new NodeBukuQueue(nobuk,judul, head);
        size++;
    }
    public void add(String nobuk,String judul){
        if(isEmpty()){
            addFirst(nobuk,judul);
        }
        else{
            NodeBukuQueue tmp = head;
            while(tmp.next != null){
                tmp=tmp.next;
            }
            tmp.next = new NodeBukuQueue(nobuk, judul, null);
            size++;
        }
    }
    public void getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("LinkedList Kosong");
        }
            System.out.println("Nomor Buku : " + head.NoBuku);
            System.out.println("Judul : " + head.judul);
    }
    public void getLast() throws Exception{
        if (isEmpty()){
            throw new Exception("LinkedLists kosong");
        }
        NodeBukuQueue tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
            System.out.println("Nomor Buku : " + tmp.NoBuku);
            System.out.println("Judul : " + tmp.judul);
    }
    public void carikey(String key){
    NodeBukuQueue tmp=head;
    int a=0;
    NodeBukuQueue cur=head.next;
        for(int i=1;i<size;i++){
            if(key!=tmp.NoBuku){
                a=i;
        tmp=tmp;
        cur=tmp.next;
            }
        }
        System.out.println("Data yang anda cari : ");
        System.out.println("Ada di Rak ke - " + (a));
        System.out.println("Nomor Buku : " + cur.NoBuku);
        System.out.println("Judul : " + cur.judul);
    }
    public void cariindex(int index){
    NodeBukuQueue tmp=head;
    for(int i=1;i<index;i++){
        tmp=tmp.next; 
    }
    System.out.println("Nomor Buku : " + tmp.NoBuku);
      System.out.println("Judul : " + tmp.judul);
    }
    public void print(){
        if(!isEmpty()){
            NodeBukuQueue tmp = head;
            while(tmp != null){
                System.out.print(tmp.NoBuku + "\t");
                System.out.println(tmp.judul);
                tmp = tmp.next;
            }
            System.out.println();
        }
        else{
            System.out.println("LinkedLists kosong");
        }
    }
}
