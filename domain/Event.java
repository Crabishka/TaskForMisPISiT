package ru.lukomorebo.lukomorye_site.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "news_event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	private String name;
	private String description;
	private String shortDescription;

	@ElementCollection
	private List<String> pictures;

	@Enumerated(EnumType.STRING)
	private EventStatus eventStatus;
}
