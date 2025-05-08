package main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnDB {
    private static final String URL = "jdbc:mysql://localhost:3306/pet_adoption_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Ryanny1003";    
 
    private static ConnDB instance;
    private Connection connection;
    
    private ConnDB() {
        connect();
    }
    
    private void connect() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to DB");
        } catch (Exception e) {
            System.err.println("DB CONNECTION FAILED");
            e.printStackTrace();
        }
    }
    
    public static ConnDB getInstance() {
        if(instance == null) {
            instance = new ConnDB();
        }
        return instance;
    }
    
    public Connection getConnection() {
        try {
            if(connection == null || connection.isClosed()) {
                System.out.println("Reconnecting");
                connect();
            }
        } catch (Exception e) {
            System.err.println("Error getting Connection");
            e.printStackTrace();
        }
        
        return connection;
    }
    
        public void reconnect() {
        closeConnection();
        connect();
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database Connection Closed.");
            }
        } catch (SQLException e) {
            System.err.println("Error Closing Connection");
            e.printStackTrace();
        } finally {
            instance = null;
        }
    }
    
}
