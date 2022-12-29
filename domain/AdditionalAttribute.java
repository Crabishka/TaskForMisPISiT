package ru.lukomorebo.lukomorye_site.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "additional_attribute")
public class AdditionalAttribute implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "cost")
	int cost;

	@Column(name = "is_countable")
	Boolean isCountable;

	@Column(name = "max_count")
	int maxCount;

	@ManyToOne
	@JoinColumn(name = "attribute_template_id")
	AttributeTemplate template;

	@ManyToOne
	@JoinColumn(name = "building_description_id")
	BuildingDescription description;

}
