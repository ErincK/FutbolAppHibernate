package com.erinc.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass

public class Features {
    private int attacking_crossing;
    private int attacking_finishing;
    private int attacking_heading_accuracy;
    private int attacking_short_passing;
    private int attacking_volleys;
    private int defending_marking_awareness;
    private int defending_standing_tackle;
    private int defending_sliding_tackle;
    private int goalkeeping_diving;
    private int goalkeeping_handling;
    private int goalkeeping_kicking;
    private int goalkeeping_positioning;
    private int goalkeeping_reflexes;
    private int goalkeeping_speed;
    private int mentality_aggression;
    private int mentality_interceptions;
    private int mentality_positioning;
    private int mentality_vision;
    private int mentality_penalties;
    private int mentality_composure;
    private int movement_acceleration;
    private int movement_sprint_speed;
    private int movement_agility;
    private int movement_reactions;
    private int movement_balance;
    private int power_shot_power;
    private int power_jumping;
    private int power_stamina;
    private int power_strength;
    private int power_long_shots;
    private int skill_dribbling;
    private int skill_curve;
    private int skill_fk_accuracy;
    private int skill_long_passing;
    private int skill_ball_control;



}
