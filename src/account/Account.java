package account;

import java.io.Serializable;

public class Account implements Serializable {
    private String name;
    private String password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void displayAccount(){
        System.out.printf("-25%",name,password + "\n");
    }
}
