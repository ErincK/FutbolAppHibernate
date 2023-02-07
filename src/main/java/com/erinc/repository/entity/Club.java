package com.erinc.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String club_name;
    @OneToMany(mappedBy = "club")
    private List<Player> playerList;
    @ManyToOne(cascade = CascadeType.ALL)
    private League league;
}
