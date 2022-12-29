package ru.lukomorebo.lukomorye_site.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "booking_additional_attribute")
@NoArgsConstructor
@AllArgsConstructor
public class BookingAdditionalAttributeCount implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private AdditionalAttribute attribute;

	@ManyToOne
	private Booking booking;

	private Integer count;
}
