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
public class Skill {
    private int skill_dribbling;
    private int skill_curve;
    private int skill_fk_accuracy;
    private int skill_long_passing;
    private int skill_ball_control;
}
