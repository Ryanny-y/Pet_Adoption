package main.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import main.model.Pet_Model;

public class PetDao {
    
    private ConnDB connDb = ConnDB.getInstance();
    
//    GET ALL PETS
    public ArrayList<Pet_Model> getAllPets() {
        ArrayList<Pet_Model> pets = new ArrayList<>();
        String query = "SELECT * FROM pets";

        try (Connection con = connDb.getConnection();
            Statement stmt = con.createStatement()) {
           
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String sex = rs.getString("sex");
                String category = rs.getString("category");
                String description = rs.getString("description");
                String image = rs.getString("image");
                String created_at = rs.getString("created_at");
                
                Pet_Model pet = new Pet_Model(id, name, age, sex, category, description, image, created_at);
                pets.add(pet);
            }
            
            return pets;
        } catch (SQLException e) {
            System.err.println("Error Retrieving Pets");
            e.printStackTrace();
            return new ArrayList<>();
        } 
    }

//    ADD PET
    
    
//    DELETE PET
}
