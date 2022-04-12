package main;

public class User {
    private String nom;
    public static User newUser(String nom){
            return new User(nom);
    }
    private User(String nom){
        if (nom.equals("")){
            System.out.println("Le nom ne dois pas etre vide");
        }else {
            this.nom=nom;
        }
    }

    @Override
    public String toString() {
        return nom;
    }
}
