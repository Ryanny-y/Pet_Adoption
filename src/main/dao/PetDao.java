package main.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import main.model.Pet_Model;

public class PetDao {
    
    private ConnDB connDb = ConnDB.getInstance();
    private Connection con = connDb.getConnection();
    
    public void getAllPets() {
        ArrayList<Pet_Model> pets = new ArrayList<>();
        String query = "SELECT * FROM pets LIMIT 12";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                System.out.println(rs.getString("name"));
            }
            
        } catch (Exception e) {
            System.err.println("Error Retrieving Pets");
            e.printStackTrace();
        }
        
    }
    
}
