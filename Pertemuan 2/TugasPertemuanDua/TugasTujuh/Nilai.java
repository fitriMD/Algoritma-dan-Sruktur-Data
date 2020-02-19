/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTujuh;

/**
 *
 * @author Lenovo
 */
public class Nilai {
    public int nilai1,nilai2;
    
    public void ProgramNilai(int nilai1, int nilai2){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        
    }
    Nilai(){
        
    }
    public void hitungNilai(){
        if (nilai1>nilai2) {
            System.out.println(nilai1);
            
        }else{
            System.out.println(nilai2);
        }
    }
    
}
