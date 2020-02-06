/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastiga;

/**
 *
 * @author Lenovo
 */
public class kata {
    public static void main(String[] args) {
        char kata[] = {'M','I','S','S','I','S','S','I','P','I'};
        //MISSISSIPI
        int m=0;
        int i=0;
        int s=0;
        int p=0;
        for (int j = 0; j < kata.length; j++) {
            
            switch(kata[j]){
                case 'M' : m++;
                break;
                case 'I' : i++;
                break;
                case 'S' : s++;
                break;
                case 'P' : p++;
                break;
                
                default:  
            } 
        }
        System.out.println("nilai M ada "+m);
        System.out.println("nilai I ada "+i);
        System.out.println("nilai S ada "+s);
        System.out.println("nilai P ada "+p);
    }
    
}
