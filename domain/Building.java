package ru.lukomorebo.lukomorye_site.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "building")
public class Building implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "building_description_id")
    private BuildingDescription description;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "originalBuilding")
    private List<LinkedBuilding> linkedBuildings;

}
