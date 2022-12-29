package ru.lukomorebo.lukomorye_site.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "booking_hours")
public class BookingHours {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;
	private int enterTime;
	private int exitTime;
}
