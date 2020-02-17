#Jawaban 2.3.3

1. Karakteristik class dan objek
	class: diawali dengan huruf kapital
	objek: harus instansiasi di method main
2. Untuk mendeklarasikan class kata kuncinya adalah kata class dan nama class.
3. Ada 4 atribut yaitu : namaBarang, jenisBarang, stok, dan hargaSatuan. Atribut tersebut dideklarasikan di baris ke-2 dan ke-3.
4. Ada 4 method yaitu : tampilBarang, tambahStok, kurangStok, dan hitungHargaTotal. Ada di baris ke-5,12,15,18.
5. public void kurangiStok(int n){
        if(stok>0){
            stok = stok-n;
        }else{
            System.out.println("Stok kosong");
        }
6. Untuk menghitung jumlah stok yang dimasukkan
7. Karena dalam method hitungHargaTotal() terdapat perkalian antara jumlah dan hargaSatuan yang keduanya sama2 memiliki tipe int.
8. Karena method tersebut tidak memerlukan pengembalian nilai.

#Jawaban 2.4.3
1. Pada baris ke-3, objek yang dihasilkan b1.
2. Dengan cara menulis nama objek diikuti dengan nama atribut.

#Jawaban 2.5.3
1. Pada baris ke-7
2. Memberikan nilai pada konstruktor yang berparameter.
3. Barang b3 = new Barang("Rawis","Saudi",200,25000);
        b3.tampilBarang();  

#Jawaban 2.6.3
1. Melakukan perhitungan luas persegi panjang dengan jumlah perhitungan sebanyak 3 kali.
2. Untuk perhitungan luas persegi yang pertama, persegi panjang tersebut memiliki panjang 80 dan lebar 40.

#Jawaban 2.7.3
1. Karena belum diinstansiasikan objeknya

#Jawaban 2.8.3
1. Konstruktor merupakan method istimewa yang digunakan untuk membentuk objek.
2. Segitiga[] sgArray = new Segitiga[15];
3. public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
4. public int hitungLuas() {
        return (alas * tinggi)/2;
    }
    public int hitungKeliling(){
        return alas+alas+alas;
    }
5.   sgArray[0] =  new Segitiga(10,4);
       sgArray[1] =  new Segitiga(20,10);
       sgArray[2] =  new Segitiga(15,6);
       sgArray[3] =  new Segitiga(25,10);
       
        for (int i = 0; i < 4; i++) {
            System.out.println("Luas segitiga ke-"+i+ " : "+sgArray[i].hitungLuas());
            System.out.println("Keliling segitiga ke-"+i+ " : "+sgArray[i].hitungKeliling());
            
        }