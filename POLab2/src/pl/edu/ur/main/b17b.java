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
public class b17b {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę całkowitą: ");
        x=scanner.nextInt();
        System.out.print("Podaj drugą liczbę całkowitą: ");
        y=scanner.nextInt();
        /*
        Przykład działania:
            7 ^ 5

            7: 0111
            5: 0101
            xor: 0010 
        */
        z= x ^ y;
            System.out.println("Wynik operacji xor: " + z + "");
    }
}
