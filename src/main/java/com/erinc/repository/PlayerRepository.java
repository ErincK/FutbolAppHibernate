package com.erinc.repository;

import com.erinc.repository.entity.Player;
import com.erinc.utility.MyFactoryRepository;

public class PlayerRepository extends MyFactoryRepository<Player, Long> {
    public PlayerRepository() {
        super(new Player());
    }
}
