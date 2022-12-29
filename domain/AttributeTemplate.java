package ru.lukomorebo.lukomorye_site.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "attribute_template")
public class AttributeTemplate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "font_path")
    String fontPath;

    @Column(name = "description")
    String description;

    @Column(name = "note")
    String note;
}
