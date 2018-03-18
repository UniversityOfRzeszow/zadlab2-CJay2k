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
public class b34 {
     public static int ciag(int x){
        if ((x==1)||(x==2))
            return 1;
        else
            return ciag(x-1)+ciag(x-2);
    }
     
    public static void main(String[] args) {
        int x;
        System.out.print("Podaj numer wyrazu ciagu: ");        
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("" + x + ". wyraz ciagu to: " + ciag(x) + "");
    }
}