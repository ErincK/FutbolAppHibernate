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
public class Mentality {
    private int mentality_aggression;
    private int mentality_interceptions;
    private int mentality_positioning;
    private int mentality_vision;
    private int mentality_penalties;
    private int mentality_composure;


}
