package Pt1;

public class User {
    private String userName;
    private String email;
    private String password;
    private String address;

    public User(String username, String email, String password, String address){
        this.userName = username;
        this.email = email;
        this.password = password;
        this.address = address;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}