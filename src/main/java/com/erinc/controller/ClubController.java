package com.erinc.controller;

import com.erinc.repository.entity.Club;
import com.erinc.service.ClubService;

import java.util.List;
import java.util.Optional;

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

    public List<Club> findAll(){
        return clubService.findAll();
    }

    public Optional<Club> findById(Long id){
        return clubService.findById(id);
    }
}
