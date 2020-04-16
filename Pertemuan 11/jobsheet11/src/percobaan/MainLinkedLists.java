/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;


/**
 *
 * @author HP
 */
public class MainLinkedLists {

    public static void main(String[] args) {
     
        LinkedLists data = new LinkedLists();
        try {
            data.addFirst(7);
            data.print();
            data.add(8, 1);
            data.print();
            data.addFirst(1);
            data.print();
            data.remove(1);
            data.print();
            //data.clear();
            data.print();
            System.out.println("Add by value");
            data.addByValue(1, 3);
            data.print();
            System.out.println("Remove by Value");
            data.removeValue(8);
            data.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
