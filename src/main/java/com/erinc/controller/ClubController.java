package com.erinc.controller;

import com.erinc.repository.entity.Club;
import com.erinc.service.ClubService;

public class ClubController {

    ClubService clubService;
    public ClubController(){
        this.clubService= new ClubService();
    }
    public void createClub(Club club){
        this.clubService.save(club);
    }

    public void deleteById(Long id){
        clubService.deleteById(id);
    }
}
