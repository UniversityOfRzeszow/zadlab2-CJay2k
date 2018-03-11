/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author CJay
 */
public class z4 {
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        double[] tab = new double[10];
        double x;
        int ile;
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Ile liczb chcesz posortować?: ");
        ile=scanner.nextInt();
        System.out.println( "Podaj " + ile + " liczb: ");
        for(int i=0; i<ile; i++){
            int j=i+1;
            System.out.print("" + j + ": ");
            tab[i]=scanner.nextDouble();
        }
        for(int j=0; j<ile; j++){
            for(int i=0; i<ile-1; i++){
                if(tab[i]>tab[i+1]){
                    x=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=x;
                }
            }
        }
        for(int i=0; i<ile; i++){
            System.out.print("" + tab[i] + " ; ");
        }
    }
}
