package Pt1;

public class UserContactInfo {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String username;
    private String email;

    public UserContactInfo(String username, String email){
        this.username = username;
        this.email = email;
    }
}
