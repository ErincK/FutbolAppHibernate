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
    private int power_shot_power;
    private int power_jumping;
    private int power_stamina;
    private int power_strength;
    private int power_long_shots;

}
