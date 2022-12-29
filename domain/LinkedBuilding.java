package ru.lukomorebo.lukomorye_site.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "linked_building")
public class LinkedBuilding {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@ManyToOne
	private Building originalBuilding;
	@OneToOne
	private Building referenceBuilding;
}
