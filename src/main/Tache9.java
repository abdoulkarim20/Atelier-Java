package main;

import java.util.Scanner;

public class Tache9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisire un mot\n");
        String mot=scanner.nextLine();
        System.out.println("Veuillez saisire un entier");
        int a=scanner.nextInt();
        System.out.println("Veuillez saisire un nombre reelle");
        double b=scanner.nextDouble();
        System.out.println("Mot: "+mot);
        System.out.println("Entier saisie: "+a);
        System.out.println("Reel saise: "+b);
    }
}
