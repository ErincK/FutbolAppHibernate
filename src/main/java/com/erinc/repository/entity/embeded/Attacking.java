package com.erinc.repository.entity.embeded;

import lombok.*;

import javax.persistence.Embeddable;


@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Attacking {
    private Integer attacking_crossing;
    private Integer  attacking_finishing;
    private Integer  attacking_heading_accuracy;
    private Integer  attacking_short_passing;
    private Integer  attacking_volleys;

}
