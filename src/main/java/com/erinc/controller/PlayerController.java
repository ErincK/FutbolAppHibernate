package com.erinc.controller;

import com.erinc.repository.entity.Player;
import com.erinc.service.PlayerService;

public class PlayerController {

    PlayerService playerService;

    public PlayerController(){
        this.playerService = new PlayerService();
    }

    public void createPlayer(Player player){
        playerService.save(player);
    }

}
