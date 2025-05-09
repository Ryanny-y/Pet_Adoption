package main.dao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.

public class AdoptDao {
    
    private ConnDB connDb = ConnDB.getInstance();
    
//    GET ALL REQUEST
    
//    REQUEST ADOPTION
    public boolean createAdoptionRequest(int userId, int petId, String note) {
        String query = "INSERT INTO adoptions(user_id, pet_id, notes) VALUES (?, ?, ?)";
        
        try (
            Connection con = connDb.getConnection();
            PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, userId);
            ps.setInt(2, petId);
            ps.setString(3, note);
            
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0) return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdoptDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
//    GET REQUEST BY USERS
    
//    UPDATE ADOPT STATUS
}
