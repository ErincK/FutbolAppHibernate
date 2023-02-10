package com.erinc.repository;

import com.erinc.repository.entity.Player;
import com.erinc.repository.entity.PlayerPosition;
import com.erinc.utility.MyFactoryRepository;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerRepository extends MyFactoryRepository<Player, Long> {
    public PlayerRepository() {
        super(new Player());
    }

    public List<Player> findAllByPositionName(PlayerPosition ps) {
        CriteriaQuery<Player> criteria = getCriteriaBuilder().createQuery(Player.class);
        Root<Player> root = criteria.from(Player.class);
        criteria.select(root).where(getCriteriaBuilder().equal(root.get("player_position"),ps));
        return getEntityManager().createQuery(criteria).getResultList();

    }

    public List<Player> findByPosition(String position) {
        TypedQuery<Player> typedQuery = getEntityManager().createNamedQuery("findByPosition", Player.class);
        typedQuery.setParameter("position",PlayerPosition.valueOf(position));
        return typedQuery.getResultList();
    }

    public List<Player> findByMidfilderPlayer(){
        CriteriaQuery<Player> criteria = getCriteriaBuilder().createQuery(Player.class);
        Root<Player> root = criteria.from(Player.class);
        List<PlayerPosition>playerPositions= List.of(PlayerPosition.CM,PlayerPosition.CAM,PlayerPosition.CDM,PlayerPosition.LM
        ,PlayerPosition.LW);
        criteria.select(root).where(getCriteriaBuilder().in(root.get("player_position")).value(playerPositions));

        return getEntityManager().createQuery(criteria).getResultList();
    }


    public List<Player> findByArea(String area){
        CriteriaQuery<Player> criteria = getCriteriaBuilder().createQuery(Player.class);
        Root<Player> root = criteria.from(Player.class);
        List<PlayerPosition>playerPositions= Arrays.asList(PlayerPosition.values()).stream().filter(x->x.getArea().equals("Middle")).collect(Collectors.toList());

        criteria.select(root).where(getCriteriaBuilder().in(root.get("player_position")).value(playerPositions));

        return getEntityManager().createQuery(criteria).getResultList();
    }




























}
