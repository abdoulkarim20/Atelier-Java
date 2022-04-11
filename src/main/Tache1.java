package main;

import java.util.Scanner;

public class Tache1 {
    public static void main(String[] args){
        //Pour la saisie
        Scanner sc=new Scanner(System.in);
        System.out.println("Ce programme vous permet de calculer deux nombre saisie au clavier\n");
        System.out.println("Veuillez saisir le premier nombre");
        int a=sc.nextInt();
        System.out.println("Veuillez saisir le deuxieme nombre");
        int b=sc.nextInt();
        int somme=a+b;
        System.out.println("Vous avez saisie "+a+" et "+b+" dont la somme est "+somme);
    }
}
