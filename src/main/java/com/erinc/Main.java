package com.erinc;

import com.erinc.controller.ClubController;
import com.erinc.controller.LeagueController;
import com.erinc.controller.PlayerController;
import com.erinc.repository.LeagueRepository;
import com.erinc.repository.entity.Club;
import com.erinc.repository.entity.League;
import com.erinc.repository.entity.Player;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClubController clubController = new ClubController();
        LeagueController leagueController = new LeagueController();
        PlayerController playerController = new PlayerController();

        League league = League.builder().name("Eredivicie").build();

        Club club = Club.builder()
                .club_name("My Club")
                .league(league)
                .build();

        Player player = Player.builder()
                .long_name("Erinc").club(club).build();
        playerController.createPlayer(player);

        Thread.sleep(2000);

        clubController.deleteById(1L);


    }


}