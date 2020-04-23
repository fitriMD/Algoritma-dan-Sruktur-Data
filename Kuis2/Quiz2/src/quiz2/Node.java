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
public class Node {

    Node data[] =  new Node[20];
    int tahun;
    Node next;

    public Node( int thn, Node next) {
        this.tahun = thn;
        this.next = next;
    }
    

}
