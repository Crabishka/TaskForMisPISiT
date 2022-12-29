package ru.lukomorebo.lukomorye_site.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "info_attribute")
public class InfoAttribute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    Integer value;

    @ManyToOne
    @JoinColumn(name = "attribute_template_id")
    AttributeTemplate template;

    @ManyToOne
    @JoinColumn(name = "building_description_id")
    BuildingDescription description;


}
