package Pt1;
import java.util.ArrayList;

public class UserListProcessor {
    private final ArrayList<User> users;

    public UserListProcessor(ArrayList<User> user) {
        this.users = user;
    }
    public void processUserList() {
        for (User username : users) {
            processUser(username.getUserName());
        }
    }
    private void processUser(String username) {
        System.out.println("Processing user: " + username);
        if (isUserAdmin(username)) {
            System.out.println("Admin user detected!");
        }
    }
    private boolean isUserAdmin(String username) {
        return username.contains("admin");
    }
    public int countAdminUsers() {
        AdminCount adminCount = new AdminCount();
        for (User username : users) {
            if (isUserAdmin(username.getUserName())) {
                adminCount.increment();
            }
        }
        return adminCount.getCount();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendEmailToUser(UserContactInfo userContactInfo) {
        String targetUsername = userContactInfo.getUsername();
        for (User user : users) {
            if (user.getUserName().equals(targetUsername)) {
                String targetEmail = userContactInfo.getEmail();
                System.out.println("Email sent to " + targetEmail);
                return;
            }
        }
        System.out.println("User with username " + targetUsername + " not found.");
    }
}