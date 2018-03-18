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
public class b33b {
    public static int potegowanie(int x, int n){
        if (n==0)
            return 1;
        if (n%2!=0)
            return x*potegowanie(x, n-1);
        else{
            int a = potegowanie(x, n/2);
            return a*a;
        }
    }
    
    public static void main(String[] args) {
        int x,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        x = scanner.nextInt();
        System.out.print("Podaj do której potęgi chcesz ją podnieść: ");
        n = scanner.nextInt();
        
        System.out.println("Potega tych liczb to: " + potegowanie(x,n));
    }
}
