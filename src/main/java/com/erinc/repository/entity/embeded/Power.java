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
public class Power {
    private Integer power_shot_power;
    private Integer power_jumping;
    private Integer power_stamina;
    private Integer power_strength;
    private Integer power_long_shots;

}
