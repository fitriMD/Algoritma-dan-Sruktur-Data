/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;
import percobaan1.Graph;

/**
 *
 * @author HP
 */
public class GraphMain {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        String pil;
        do {
            System.out.println("Input : <source> <destination>");
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
            do {
                System.out.print("Input lagi? (y/n) : ");
                pil = sc.next();

                if (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n")) {
                    System.out.println("Input False");
                }

            } while (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n"));
        } while (pil.equalsIgnoreCase("y"));
        graph.printGraph();
    }
}
