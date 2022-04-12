package main;

import java.util.Scanner;

public class Tache8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrez une valeur");
        int a=scanner.nextInt();
        for (int i=1;i<=a;i++){
            System.out.println(i);
        }
    }
}
