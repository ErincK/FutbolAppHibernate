package com.erinc.repository;

import com.erinc.repository.entity.Club;
import com.erinc.repository.entity.League;
import com.erinc.utility.MyFactoryRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public class ClubRepository extends MyFactoryRepository<Club, Long> {

    CriteriaBuilder criteriaBuilder;

    public ClubRepository() {
        super(new Club());
    }

    public boolean isClubExist(Club club){
        try{
            CriteriaQuery<Club> criteria = (CriteriaQuery<Club>) criteriaBuilder.createQuery(Club.class);
            Root<Club> root = (Root<Club>) criteria.from(Club.class);
            criteria.select(root);
            criteria.where(criteriaBuilder.equal(root.get("club_name"),club.getClub_name()));
            List<Club> result = getEntityManager().createQuery(criteria).getResultList();
            return !result.isEmpty();
        }catch(Exception exception){
            return false;
        }
    }

    public Optional<Club> findByName(String club_name){
        List<Club> clubList = findAllByColumnNameAndValue("club_name",club_name);
        if(clubList.isEmpty()){
            return Optional.empty();
        }else {
            return Optional.of(clubList.get(0));
        }
    }

    public Club saveWithNameAndLeague(String clubName, League league){
         Optional<Club> club = findByName(clubName);
         if(club.isPresent()){
             System.out.println("Takim daha önce olusmus.");
             return club.get();
         }else {
             return save(Club.builder().club_name(clubName).league(league).build());
         }
    }
}
