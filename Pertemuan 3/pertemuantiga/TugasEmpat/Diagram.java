/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuantiga.TugasEmpat;

/**
 *
 * @author Lenovo
 */
public class Diagram {
    public int c1,c2,c3,c4, suara[],x;
    
    public Diagram(int x){
        this.x=x;
        this.suara=new int[x];
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.c4=c4;
    }
    public int pilih(int b){
        if(b == x){
            return 0;
        }
        else {
            if(suara[b] == 1){
                c1+=1;
            }
            else if(suara[b] == 2){
                c2+=1;
            }
            else if(suara[b] == 3){
                c3+=1;
            }     
            else if(suara[b] == 4){
                c4++;
            } 
         return pilih(b+1);
        }
    }
    
    
}
