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
public class DoubleLinkedList {

    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String item1, int item2) {
        if (isEmpty()) {
            head = new Node(null, item1, item2, null);
        } else {
            Node newNode = new Node(null, item1, item2, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String item1, int item2) {
        if (isEmpty()) {
            addFirst(item1, item2);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item1, item2, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String item1, int item2, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item1, item2);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item1, item2, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item1,
                        item2, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Daftar Nilai Mahasiswa: ");
            Node tmp = head;
            while (tmp != null) {
                System.out.println("Nama\t: " + tmp.nama + "\t");
                System.out.println("Nilai\t: " + tmp.nilai + "\t");
                tmp = tmp.next;
                System.out.println();
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus ");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.nilai;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.nilai;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.nilai;
    }

    public void bubbleSort() {
        Node tmp = head;
        for (int i = 0; i < size - 1; i++) {
            if (tmp.nilai < tmp.next.nilai) {
                int save1 = tmp.nilai;
                int save2 = tmp.next.nilai;
                tmp.nilai = save2;
                tmp.next.nilai = save1;
            }
            if (tmp.next != null) {
                tmp = tmp.next;
            }
        }
    }

    public void sort() {
        int half = 0;
        if (size % 2 == 0) {
            half = size / 2;
        } else {
            half = (size + 1) / 2;
        }
        for (int i = 0; i <= half; i++) {
            bubbleSort();
        }
    }
}
