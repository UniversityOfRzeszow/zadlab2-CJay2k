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
public class b33a {
     public static void main(String[] args) {
        int x,y,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        x=scanner.nextInt();
        System.out.print("Podaj do której potęgi chcesz ją podnieść: ");
        n=scanner.nextInt();
        y=x;
        for(int i=1; i<n; i++){
            y=y*x;
        }
        System.out.println("Wynik: " + y + "");
    }
}