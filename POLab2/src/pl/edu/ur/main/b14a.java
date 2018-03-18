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
public class b14a {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe całkowitą: ");
        x=scanner.nextInt();
        y=x>>1;
        System.out.println("Liczba " + x + "po przesunięciu bitowym o 1 miejsce w prawo: " + y + "");
    }
}
