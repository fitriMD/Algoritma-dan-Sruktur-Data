## Jawaban Pertanyaan Pertemuan Sebelas

# 11.3.3 Pertanyaan Percobaan
1. proses traverse merupakan proses untuk menambahkan dat diakhir linked list, jadi nilai head harus disimpan terlebuh dahulu di variable tmp supaya jika terjadi penambahan data baru nilai head tidak berubah. Data-data yang baru akan menempati tmp dan head nilainya tetap.
2. Tidak dapat mengikat data-data baru yang ditambahkan, karena head berubah/bergeser karena fungsu dari tail adalah mengikat node yang baru.
3. Di LinkedLists
public void addByValue(int cari, int item)throws Exception{
        boolean a = true;
        Node tmp = head;
        while (tmp.data != cari){
            tmp = tmp.next;
        }
        tmp.next = new Node(item, null);
        size++;
    }

    Di LinkedListsMain
    System.out.println("Add by value");
        data.addByValue(1, 3);
        data.print();

4. Di LinkedLists
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

    Di LinkedListsMain
    System.out.println("Remove by Value");
        data.removeValue(8);
        data.print();

5. Di LinkedLists
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