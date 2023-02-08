package com.erinc.controller;

import com.erinc.repository.entity.Player;
import com.erinc.service.PlayerService;

import java.sql.ClientInfoStatus;
import java.util.List;

public class PlayerController {

    PlayerService playerService;

    public PlayerController(){
        this.playerService = new PlayerService();
    }

    public void createPlayer(Player player){
        playerService.save(player);
    }

    public void deleteById(Long id){
        playerService.deleteById(id);
    }

    public void createPlayers(List<Player> player){
        playerService.saveAll(player);
    }

    public void deleteByEntity(Player player) {
        playerService.delete(player);
    }

    public List<Player> findAll() {
       return playerService.findAll();
    }
}
