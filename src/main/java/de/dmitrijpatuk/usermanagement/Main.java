package de.dmitrijpatuk.usermanagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int myNumber = 1;
        User myUser = new User();
        User myUser2 = new User("Dmitrij", "Password");
        User myUser3 = new User("Dmitrij2", "Password2",
                "Dmitrij", "Patuk");
        int myNumber2 = 1;
    }
}
