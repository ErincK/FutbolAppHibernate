package com.erinc.repository.entity;


import com.erinc.repository.entity.embeded.*;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String long_name;
    private String player_position;
    private int overall_potential;
    private double value_eur;
    private double wage_eur;
    private int age;
    private double height_cm;
    private double weight_kg;
    private String club_position;
    private int club_jersey_number;
    private String club_contract_valid_until;
    private String nationality_name;
    private String preferred_foot;
    private int pace;
    private int shooting;
    private int passing;
    private int dribbling;
    private int defending;
    private int physic;
    @Embedded
    Attacking attacking;
    @Embedded
    Defending defence;
    @Embedded
    Golkepping golkepping;
    @Embedded
    Mentality mentality;
    @Embedded
    Movement movement;
    @Embedded
    Power power;
    @Embedded
    Skill skill;
    @ManyToOne(cascade = CascadeType.ALL)
    private Club club;
}
