package com.erinc.service;

import com.erinc.repository.PlayerRepository;
import com.erinc.repository.entity.Player;
import com.erinc.utility.MyFactoryService;

public class PlayerService extends MyFactoryService<PlayerRepository, Player, Long> {

    public PlayerService() {
        super(new PlayerRepository());
    }
}
