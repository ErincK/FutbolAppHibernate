package com.erinc.repository;


import com.erinc.repository.entity.League;
import com.erinc.utility.MyFactoryRepository;

public class LeagueRepository extends MyFactoryRepository<League, Long> {
    public LeagueRepository() {
        super(new League());
    }
}
