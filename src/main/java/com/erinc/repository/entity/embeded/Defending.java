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
public class Defending {
    private int defending_marking_awareness;
    private int defending_standing_tackle;
    private int defending_sliding_tackle;


}
