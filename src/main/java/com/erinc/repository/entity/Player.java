package com.erinc.repository.entity;


import com.erinc.repository.entity.embeded.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Player{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String long_name;
    @Enumerated(EnumType.STRING)
    PlayerPosition player_position;
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
    @Builder.Default
    Attacking attacking = Attacking.builder().build();
    @Embedded
    @Builder.Default
    Defending defence = Defending.builder().build();
    @Embedded
    @Builder.Default
    Golkepping golkepping = Golkepping.builder().build();
    @Embedded
    @Builder.Default
    Mentality mentality = Mentality.builder().build();
    @Embedded
    @Builder.Default
    Movement movement = Movement.builder().build();
    @Embedded
    @Builder.Default
    Power power = Power.builder().build();
    @Embedded
    @Builder.Default
    Skill skill = Skill.builder().build();
    @ManyToOne()
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private Club club;

}
