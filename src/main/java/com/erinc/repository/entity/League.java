package com.erinc.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class League {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String league_name;
    private int league_level;
    @OneToMany(mappedBy = "league")

    private List<Club> clubList;

    @Override
    public String toString() {
        return "League{" +
                "id=" + id +
                ", league_name='" + league_name + '\'' +
                ", league_level='" + league_level + '\'' +
                '}';
    }
}
