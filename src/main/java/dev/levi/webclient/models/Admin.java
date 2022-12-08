package dev.levi.webclient.models;

public class Admin extends User{

    public Admin(String name, String password, TripleDes tripleDes) throws Exception {
        super(name, password,new TripleDes());
    }
}
