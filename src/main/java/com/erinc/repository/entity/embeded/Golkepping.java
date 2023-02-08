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
public class Golkepping {
    private int goalkeeping_diving;
    private int goalkeeping_handling;
    private int goalkeeping_kicking;
    private int goalkeeping_positioning;
    private int goalkeeping_reflexes;
    private int goalkeeping_speed;


}
