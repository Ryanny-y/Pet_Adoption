package main.controller;


import main.dao.AdoptDao;


public class AdoptController {    
    
    private AdoptDao adoptDao = new AdoptDao();
    
    public boolean requestAdoption(int userId, int petId, String note) {
        return adoptDao.createAdoptionRequest(userId, petId, note);
    }
}
