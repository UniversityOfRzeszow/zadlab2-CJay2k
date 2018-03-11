package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Adrian Hrycaj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
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
            System.out.println( "Co chcesz zrobić? Wpisz liczbę 1-4 lub 5 by zakończyć: ");
            System.out.println( "1. Wyświetlanie tablicy od pierwszego do ostatniego indeksu.");
            System.out.println( "2. Wyświetlanie tablicy od ostatniego do pierwszego indeksu.");
            System.out.println( "3. Wyświetlanie elementów o nieparzystych indeksach.");
            System.out.println( "4. Wyświetlanie elementów o parzystych indeksach.");
            x=scanner.nextInt();
            if(x==1){
                for(int i=0; i<10; i++){
                    System.out.print("" + tab[i] + " ; ");
                }
                System.out.println("");
            }
            else if(x==2){
                for(int i=9; i>=0; i--){
                    System.out.print("" + tab[i] + " ; ");
                }
                System.out.println("");
            }
            else if(x==3){
                for(int i=1; i<10; i=i+2){
                    System.out.print("" + tab[i] + " ; ");
                }
                System.out.println("");
            }
            else if(x==4){
                for(int i=0; i<10; i=i+2){
                    System.out.print("" + tab[i] + " ; ");
                }
                System.out.println("");
            }
        }while(x!=5);
    }
}
