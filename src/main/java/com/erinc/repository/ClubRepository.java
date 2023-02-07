package com.erinc.repository;

import com.erinc.repository.entity.Club;
import com.erinc.utility.MyFactoryRepository;

public class ClubRepository extends MyFactoryRepository<Club, Long> {
    public ClubRepository() {
        super(new Club());
    }
}
