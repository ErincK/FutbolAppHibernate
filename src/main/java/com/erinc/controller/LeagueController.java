package com.erinc.controller;

import com.erinc.repository.entity.League;
import com.erinc.service.LeagueService;

public class LeagueController {
    LeagueService leagueService;
    public LeagueController(){
        this.leagueService= new LeagueService();
    }
    public void createLeague(League league){
        this.leagueService.save(league);
    }
}
