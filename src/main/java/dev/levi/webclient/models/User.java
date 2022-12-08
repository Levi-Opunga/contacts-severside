package dev.levi.webclient.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.levi.webclient.constants.C;
import org.springframework.data.annotation.Id;


public class User {
    @Id
    private Integer id;
    private String name;
    private String password;
    private boolean admin;


    public User(String name, String password, TripleDes tripleDes) {
        this.name = name;
        this.password = C.tripleDes.encrypt(password.trim());
    }

    public User(String name, String password, boolean admin) {
        this.name = name;
        this.password = C.tripleDes.encrypt(password);
        this.admin = admin;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = C.tripleDes.encrypt(password);
    }

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = C.tripleDes.encrypt(password);
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() throws Exception {
        return C.tripleDes.decrypt(password);
    }


    public void setPassword(String password) {
        this.password = C.tripleDes.encrypt(password);
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", admin=" + admin +
                '}';
    }

}
