package com.erinc;

import com.erinc.controller.ClubController;
import com.erinc.controller.LeagueController;
import com.erinc.controller.PlayerController;
import com.erinc.repository.LeagueRepository;
import com.erinc.repository.entity.Club;
import com.erinc.repository.entity.League;
import com.erinc.repository.entity.Player;
import com.erinc.repository.entity.PlayerPosition;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
//        ClubController clubController = new ClubController();
//        LeagueController leagueController = new LeagueController();
//        PlayerController playerController = new PlayerController();
//
//        League league = League.builder().name("Eredivicie").build();
//
//        Club club = Club.builder()
//                .club_name("PSV Eindhoven")
//                .league(league)
//                .build();
//
//        Player player = Player.builder()
//                .long_name("Erinc").player_position(PlayerPosition.CDM).club(club).build();
//        Player player2 = Player.builder()
//                .long_name("Hakan").player_position(PlayerPosition.CAM).club(club).build();
//        Player player3 = Player.builder()
//                .long_name("Sufle").player_position(PlayerPosition.GK).club(club).build();
//        //playerController.createPlayer(player);
//
//        //playerController.deleteByEntity(player);
//        playerController.createPlayers(List.of(player,player2,player3));
//
//        playerController.findAll().forEach(System.out::println);
        List<List<String>> newList = new ArrayList<>();
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/MONSTER/OneDrive/Masaüstü/Java-6/superlig7.csv", StandardCharsets.UTF_8));
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {

                newList.add(Arrays.asList(line.split(";")));
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        System.out.println(newList.get(1).get(0));




    }


}