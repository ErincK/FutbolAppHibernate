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
    private Integer mentality_aggression;
    private Integer mentality_interceptions;
    private Integer mentality_positioning;
    private Integer mentality_vision;
    private Integer mentality_penalties;
    private Integer mentality_composure;


}
