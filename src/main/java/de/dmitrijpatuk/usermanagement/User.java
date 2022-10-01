package de.dmitrijpatuk.usermanagement;

//<sichtbarkeit> <class> <Name Der Klasse>
public class User {
    private String name;

    //Sichtbar nur innerhalb des Objektes/Klasse
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


    public void setName(String newName){
        if(newName == null){
            this.name = "error: no name supplied";
        }else {
            this.name = newName;
        }
    }

    public String getName(){
        if(name == null){
            return  "error: no name supplied";
        }
        return "Der Name ist: " + this.name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.equals("password")){
            this.password = "Dont user weak passwords";
            return;
        }
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
