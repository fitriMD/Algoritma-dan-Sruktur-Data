/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author HP
 */
public class Node {

    int nilai;
    String nama;
    Node next, prev;

    public Node(Node prev, String nama, int nilai, Node next) {
        this.prev = prev;
        this.nama = nama;
        this.nilai = nilai;
        this.next = next;
    }

}
