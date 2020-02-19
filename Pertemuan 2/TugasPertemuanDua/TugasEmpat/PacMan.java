/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasEmpat;

/**
 *
 * @author Lenovo
 */
public class PacMan {

    public int x, y, width, height;

    public void moveLeft() {
        if (x > 0 || x < width) {
            x -= 1;

        }

    }

    public void moveRight() {
        if (x > 0 || x < width) {
            x += 1;

        }
    }

    public void moveUp() {
        if (y > 0 || y < width) {
            y -= 1;

        }
    }

    public void moveDown() {
        if (y > 0 || y < width) {
            y += 1;

        }

    }
    public void printPosition() {
        System.out.println("Titik koordinat : "+x+"x,"+y+"y");
    }
}
