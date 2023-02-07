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
    private Integer goalkeeping_diving;
    private Integer goalkeeping_handling;
    private Integer goalkeeping_kicking;
    private Integer goalkeeping_positioning;
    private Integer goalkeeping_reflexes;
    private Integer goalkeeping_speed;


}
