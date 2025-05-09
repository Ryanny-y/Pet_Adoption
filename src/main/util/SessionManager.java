package main.util;

import main.model.User_Model;

public class SessionManager {
    private static User_Model currentUser;
    
    private SessionManager() {}
    
    public static void setCurrentUser(User_Model user) {
        currentUser = user;
    }
    
    public static User_Model getCurrentUser() {
        return currentUser;
    }
    
    public static void clearSession() {
        currentUser = null;
    }
    
    public static boolean isLoggedIn() {
        return currentUser != null;
    }
}
