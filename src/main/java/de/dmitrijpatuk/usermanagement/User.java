package de.dmitrijpatuk.usermanagement;

//<sichtbarkeit> <class> <Name Der Klasse>
public class User {
    private String name;
    private String password;
    private String userName;
    private String lastName;

    //Default Konstruktor
    public User(){
        this.userName = "undefined";
        this.password = "undefined";
        this.name = "undefined";
        this.lastName = "undefined";
    }

    //Überladener Konstruktor
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
        this.name = "undefined";
        this.lastName = "undefined";
    }

    public User(String userName, String password, String name, String lastName){
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
    }
}
