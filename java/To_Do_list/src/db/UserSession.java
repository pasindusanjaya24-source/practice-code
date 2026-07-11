package db;

public class UserSession {
    private static UserSession instance;

    private String userId;
    private String userName;

    private UserSession() {}

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }


    public void setUserDetails(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() { return userId; }
    public String getUserName() { return userName; }


    public void cleanUserSession() {
        userId = null;
        userName = null;
    }
}
