package main.controller;

import java.util.ArrayList;
import main.dao.PetDao;
import main.model.Pet_Model;

public class PetController {
    
    private PetDao petDao = new PetDao();
    
    public ArrayList<Pet_Model> getAllPets() {
        return petDao.getAllPets();
    }
    
    public void addPet(Pet_Model pet) {
        
    };
}
