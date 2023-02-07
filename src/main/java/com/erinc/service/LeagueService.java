package com.erinc.service;

import com.erinc.repository.LeagueRepository;
import com.erinc.repository.entity.League;
import com.erinc.utility.MyFactoryService;

public class LeagueService extends MyFactoryService<LeagueRepository, League, Long> {
    public LeagueService() {
        super(new LeagueRepository());
    }
}
