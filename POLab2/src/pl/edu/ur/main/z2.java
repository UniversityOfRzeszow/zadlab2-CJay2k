/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Adrian Heycaj
 */
public class z2 {
    public static void main(String[] args) {
    double[] tab = new double[10];
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Wprowadź 10 liczb: ");
        for(int i=0; i<10; i++){
            int j=i+1;
            System.out.print("" + j + ": ");
            tab[i]=scanner.nextDouble();
        }
        do{
            System.out.println( "Co chcesz zrobić? Wpisz liczbę 1-5 lub 6 by zakończyć: ");
            System.out.println( "1. Oblicz sumę elementów tablicy.");
            System.out.println( "2. Oblicz iloczyn elementów tablicy.");
            System.out.println( "3. Wyznacz wartość średnią.");
            System.out.println( "4. Wyznacz wartość minimalną.");
            System.out.println( "5. Wyznacz wartość maksymalną.");
            x=scanner.nextInt();
            double wynik;
            double y=tab[0];
            if(x==1){
                wynik=0;
                for(int i=0; i<10; i++){
                    wynik=wynik+tab[i];
                }
                System.out.println("Suma: " + wynik);
            }
            else if(x==2){
                wynik=1;
                for(int i=0; i<10; i++){
                    wynik=wynik*tab[i];
                }
                System.out.println("Ioczyn: " + wynik);
            }
            else if(x==3){
                wynik=0;
                for(int i=0; i<10; i++){
                    wynik=wynik+tab[i];
                }
                wynik=wynik/10;
                System.out.println("Średnia: " + wynik);
            }
            else if(x==4){
                for(int i=0; i<10; i++){
                    if(y>tab[i]){
                        y=tab[i];
                    }
                }
                System.out.println("Wartość minimalna: " + y);
            }
            else if(x==5){
                for(int i=0; i<10; i++){
                    if(y<tab[i]){
                        y=tab[i];
                    }
                }
                System.out.println("Wartość maksymalna: " + y);
            }
        }while(x!=6);
    }
}
