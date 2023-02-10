package com.erinc.repository.entity;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String club_name;
    @OneToMany(mappedBy = "club")
    private List<Player> players;
    @ManyToOne()
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})

    private League league;

    @Override
    public String toString() {
        return "Club{" +
                "id=" + id +
                ", club_name='" + club_name + '\'' +
                ", league=" + league +
                '}';
    }
}
