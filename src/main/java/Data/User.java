package Data;

public class User {
    private static User user = new User();

    private String username;

    private User () {
        this.username = "";
    }

    public static User getUser () {
        return user;
    }

    public static String getUsername() {
        return user.username;
    }
    public static void setUsername(String username) {
        user.username = username;
    }
}
