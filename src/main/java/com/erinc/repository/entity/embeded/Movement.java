package com.erinc.repository.entity.embeded;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movement {
    private int   movement_acceleration;
    private int   movement_sprint_speed;
    private int  movement_agility;
    private int   movement_reactions;
    private int   movement_balance;
}
