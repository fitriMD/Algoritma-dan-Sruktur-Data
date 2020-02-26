/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuantiga.TugasEnam;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DivideQonquer {
    public String namaMhs[];
    public int jmlh;
    public double rata[];
    public double nilai;
    
    public DivideQonquer(int jmlh){
        this.namaMhs = new String[jmlh];
        this.nilai= 0;
        this.rata = new double [jmlh];
        this.jmlh=jmlh;
        
    }
    double rataDC(double arr[], int x, int y){
        if(x==y){
            return arr[1];
        
        }
        else if(x<y){
            int nilai= (x+y)/2;
            double anilai=rataDC(arr, x, nilai-1);
            double bnilai = rataDC(arr, nilai+1, y);
            return bnilai+anilai + arr[nilai];
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner angka= new Scanner(System.in);
        Scanner huruf= new Scanner(System.in);
        
        System.out.println("====PROGRAM PERHITUNGAN RATA- RATA DC====");
        System.out.print(" Masukkan jumlah mahasiswa : ");
        int n= angka.nextInt();
        
        DivideQonquer arr = new DivideQonquer(n);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(" Masukkan nama mahasiswa ke-" + (i+1) + " : ");
            arr.namaMhs[i]=huruf.nextLine();
            System.out.print(" Masukkan nilai : ");
            arr.rata[i] = angka.nextInt();
            System.out.println();   
        }
        for(int i=0; i<arr.jmlh; i++){
            System.out.println("nilai "+ arr.namaMhs[i]+" :"+ arr.rata[i]);
            
        }
        System.out.println();
        System.out.println("rata-rata nilai mahasiswa :"+String.format("%.2f",arr.rataDC(arr.rata,0,arr.jmlh)));            
        }
    
}
