package ru.lukomorebo.lukomorye_site.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "order_message")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@ManyToOne
	private Booking target;

	@ManyToOne
	private User owner;

	private String text;

}
