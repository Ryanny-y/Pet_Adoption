package main.dao;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.model.User_Model;
import main.util.SessionManager;

public class UserDao {
    private final ConnDB connDB = ConnDB.getInstance();
    
//    LOGIN
    public void loginUser(String email, String password) {
        String query = "SELECT * FROM users WHERE email = ? && password = ?";
        try (Connection con = connDB.getConnection();
            PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                int id = rs.getInt("id");
                String f_name = rs.getString("first_name");
                String m_name = rs.getString("middle_name");
                String l_name = rs.getString("last_name");
                String email_res = rs.getString("email");
                String role = rs.getString("role");
                String pass = rs.getString("password");
                
                User_Model user = new User_Model(id, f_name, m_name, l_name, email_res, role, pass);
                SessionManager.clearSession();
                if(!SessionManager.isLoggedIn()) {
                    SessionManager.setCurrentUser(user);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    REGISTER
    public boolean createUser(User_Model user) {
        String query = "INSERT INTO users(first_name, middle_name, last_name, email, role, password) VALUES (?, ?, ?, ?, ?, ?)";
        
        try ( Connection con = connDB.getConnection();
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, user.getFirst_name());
            ps.setString(2, user.getMiddle_name());
            ps.setString(3, user.getLast_name());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getRole());
            ps.setString(6, user.getPassword());
            
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
