package de.dmitrijpatuk.usermanagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int myNumber = 1;
        User myUser = new User();
        User myUser2 = new User("Dmitrij", "asöldfkj398423adsf___");
        User myUser3 = new User("Dmitrij2", "Password2",
                null, "Patuk");

        myUser2.setName(null);
        myUser2.setPassword("password");
        String name = myUser2.getName();
        String name3 = myUser3.getName();

        int myNumber2 = 1;
    }
}
