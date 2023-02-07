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
    private Integer skill_dribbling;
    private Integer skill_curve;
    private Integer skill_fk_accuracy;
    private Integer skill_long_passing;
    private Integer skill_ball_control;
}
