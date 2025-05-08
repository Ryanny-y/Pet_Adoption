package main.controller;

import java.awt.List;
import java.util.ArrayList;
import main.dao.ConnDB;
import main.dao.PetDao;
import main.model.Pet_Model;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class PetController {
    
    private PetDao petDao = new PetDao();
    
    public ArrayList<Pet_Model> getAllPets() {
        petDao.getAllPets();
        return new ArrayList();
    }
    
    public void addPet(Pet_Model pet) {
        
    };
   
}
