package model;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
    
    @NotEmpty(message = "{NotEmpty.username}")
    @Size(min=2, message = "{Size.username}")
    private String username;
    @NotEmpty(message = "{NotEmpty.password}")
    private String password;
    
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Person(Name: " + this.username + ", Age: " + this.password + ")";
    }
    
}