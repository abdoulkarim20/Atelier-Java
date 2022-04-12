package main;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Avec la condition switch
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenue dans votre programme qui " +
                "dit le jour en function du nombre que vous nous " +
                "Fournissez\n");
        System.out.println("Veuillez nous donner un nombre compris " +
                "entre 1 a 7");
        int a;
        a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Le nombre doit etre compris entre 1 a 7");
        }

    }
}



