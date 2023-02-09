package com.erinc;

import com.erinc.controller.ClubController;
import com.erinc.controller.LeagueController;
import com.erinc.controller.PlayerController;
import com.erinc.repository.entity.Club;

import java.util.Optional;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);
    PlayerController playerController = new PlayerController();
    ClubController clubController = new ClubController();
    LeagueController leagueController = new LeagueController();
    Club myClub;

    public static void main(String[] args) {
        App app = new App();
        app.mainManu();
    }

    public void mainManu(){

        int input = 0;

        do{
            System.out.println("=========   Football APP   ==========");
            System.out.println("1- Takim seç");
            System.out.println("2- Takimlari Goruntule");
            System.out.println("3- Ligleri Goruntule");
            System.out.println("4- Takim-Yonetim-Menusu");
            input = Integer.parseInt(scanner.nextLine());
            switch (input){
                case 1:
                    System.out.println(selectClub());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }



        }while(input!=0);


    }

    private Club selectClub() {

        clubController.findAll().forEach(s->{
            System.out.println(s.getId()+" "+s.getClub_name());
        });
        System.out.println("Lutfen Bir Club Seciniz..");

        Long id = Long.parseLong(scanner.nextLine());
        Optional<Club> club = clubController.findById(id);
        if(club.isPresent()){
            return club.get();
        }else {
            return null;
        }


    }


}
