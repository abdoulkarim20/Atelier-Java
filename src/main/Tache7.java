package main;

import java.util.Scanner;

public class Tache7 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisire un nombre entier");
        int a=scanner.nextInt();
        if (a<0){
            System.out.println("L'entier saisie est negatif");
        }else if (a==0){
            System.out.println("L'entier saisie est null");
        }else {
            System.out.println("L'entier saisie est positif");
        }
    }
}
