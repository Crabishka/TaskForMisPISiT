package ru.lukomorebo.lukomorye_site.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Accessors(chain = true)
@Getter
@Setter
@Table(name = "building_description")
public class BuildingDescription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "building_type")
    BuildingType type;

    @Column(name = "name")
    private String name;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "long_description")
    private String longDescription;

    @Column(name = "weekend_cost")
    private int weekendCost;

    @Column(name = "weekday_cost")
    private int weekdayCost;

    @Column(name = "amount_of_person")
    private int amountOfPerson;

    @Column(name = "max_person")
    private int maxAmountOfPerson;

    @Column(name = "payment_type")
    private PaymentType paymentType;

    @ElementCollection
    private List<String> pictures;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<Building> buildings;

    @OneToMany
    @JoinColumn(name = "building_description_id")
    private List<InfoAttribute> infoAttributes;

    @OneToMany
    @JoinColumn(name = "building_description_id")
    private List<AdditionalAttribute> additionalAttributes;
}
