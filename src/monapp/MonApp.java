/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

/**
 *
 * @author Maxime
 */
public class MonApp {
    static int i = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        Lapin lap = new Lapin(14, "tagada");
        while(i <= 10){
            lap.crier();
            i = i + 1;
        }
    }
    
}



