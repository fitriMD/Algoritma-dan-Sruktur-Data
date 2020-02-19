/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasEmpat;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ProgramPagMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PacMan p1 = new PacMan();
        
        System.out.print("Masukkan x : ");
        p1.x=sc.nextInt();
        System.out.print("Masukkan y : ");
        p1.y=sc.nextInt();
        System.out.print("Masukkan width : ");
        p1.width = sc.nextInt();
        System.out.print("Masukkan height : ");
        p1.height = sc.nextInt();
        
        p1.moveLeft();
        p1.moveRight();
        p1.moveUp();
        p1.moveDown();
        p1.printPosition();
      
    }
    
    
}
