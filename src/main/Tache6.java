package main;

import java.util.Scanner;

public class Tache6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int f=0;
        double moyenne;
        System.out.println("Entrer un nombre entier \n");
         a=scanner.nextInt();
        System.out.println("Entrer un nombre entier \n");
         b=scanner.nextInt();
        System.out.println("Entrer un nombre entier \n");
         c=scanner.nextInt();
        System.out.println("Entrer un nombre entier \n");
         d=scanner.nextInt();
        System.out.println("Entrer un nombre entier \n");
         f=scanner.nextInt();
         moyenne=(a+b+c+d+f)/5;
        System.out.println("La moyenne de vos nombres saisies est: "+moyenne);
    }
}
