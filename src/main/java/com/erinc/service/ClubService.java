package com.erinc.service;

import com.erinc.repository.ClubRepository;
import com.erinc.repository.entity.Club;
import com.erinc.utility.MyFactoryService;

public class ClubService extends MyFactoryService<ClubRepository, Club, Long> {
    public ClubService() {
        super(new ClubRepository());
    }




}
