package com.erinc;

import com.erinc.controller.ClubController;
import com.erinc.controller.LeagueController;
import com.erinc.controller.PlayerController;
import com.erinc.repository.PlayerRepository;
import com.erinc.repository.entity.Club;
import com.erinc.repository.entity.Player;
import com.erinc.repository.entity.PlayerPosition;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

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
            System.out.println("5- Pozisyona gore oyuncu getir");
            System.out.println("6- Orta Saha Oyuncularini getir"); //CM, CDM, CAM, RM, LM
            System.out.println("7- Bölgelere Göre Oyuncularini getir"); //CM, CDM, CAM, RM, LM
            input = Integer.parseInt(scanner.nextLine());
            switch (input){
                case 1: System.out.println(selectClub());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4: manageClub();
                    break;
                case 5:
                    System.out.println("Lutfen Bir Pozisyon Giriniz..");
                    playerController.findAllByPositionName(scanner.nextLine()).forEach(System.out::println);
                    break;
                case 6:
                    playerController.findByMidfilderPlayer().forEach(System.out::println);
                    break;
            }
        }while(input!=0);
    }

    private void manageClub() {
        if (myClub!=null){
            clubMenu();
        }else {
            System.out.println("Lutfen bir takim seciniz.. Ana menuye donuluyor...");
        }
    }

    private void clubMenu() {
            int choose = 0;
            do{
                System.out.println("Takiminiz....: "+ myClub.getClub_name());
                System.out.println("1- Oyunculari Goruntule");
                System.out.println("2- ");
                System.out.println("0- Ana Menuye Don");
                System.out.println("Bir secim yapiniz..");
                choose = Integer.parseInt(scanner.nextLine());
               switch (choose){
                   case 1:
                       myClubPlayerList(myClub);
                       break;
                   case 2:
                       break;
               }
            }while (choose !=0);
    }

    private void myClubPlayerList(Club club) {
        myClub.getPlayers().forEach(System.out::println);
    }

    private boolean manageClub2() { // benimki
        if(myClub.getId()==null){
            System.out.println("Bir Club Seciniz...");
            selectClub();
        }else {
            System.out.println("**Yonetim Menusu**");
        }
        return false;
    }

    private Club selectClub() {

        clubController.findAll().forEach(s->{
            System.out.println(s.getId()+" "+s.getClub_name());
        });
        System.out.println("Lutfen Bir Club Seciniz..");

        Long id = Long.parseLong(scanner.nextLine());
        Optional<Club> club = clubController.findById(id);
        if(club.isPresent()){
            myClub=club.get();
        }else {
            myClub = null;
        }
        return myClub;
    }


}
