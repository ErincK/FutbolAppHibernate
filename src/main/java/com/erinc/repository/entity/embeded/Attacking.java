package com.erinc.repository.entity.embeded;

import lombok.*;

import javax.persistence.Embeddable;


@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Attacking {
    private int attacking_crossing;
    private int  attacking_finishing;
    private int  attacking_heading_accuracy;
    private int  attacking_short_passing;
    private int  attacking_volleys;

}
