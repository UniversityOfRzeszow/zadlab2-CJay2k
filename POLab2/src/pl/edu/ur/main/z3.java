/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Adrian Hrycaj
 */
public class z3 {
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        int x;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print( "Podaj liczbę całkowitą: ");
            x=scanner.nextInt();
            if(x<0){
                break;
            }
        }
    }
}
