package com.erinc.service;

import com.erinc.repository.PlayerRepository;
import com.erinc.repository.entity.Player;
import com.erinc.repository.entity.PlayerPosition;
import com.erinc.utility.MyFactoryService;
import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PlayerService extends MyFactoryService<PlayerRepository, Player, Long> {

    public PlayerService() {
        super(new PlayerRepository());
    }

    public List<Player> findAllByPositionName(String nextLine) {
       try{
           PlayerPosition ps = PlayerPosition.valueOf(nextLine);
           return getRepository().findAllByPositionName(ps);
       }catch (Exception e){
           throw new RuntimeException("Boyle Bir Pozisyon Yoktur.");
       }
    }

    public List<Player> findByMidfilderPlayer(){
        return getRepository().findByMidfilderPlayer();
    }

    public List<Player> findByArea(String area){
        return getRepository().findByArea(area);
    }


}
