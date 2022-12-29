package ru.lukomorebo.lukomorye_site.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Calendar;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "holiday")
public class Holiday {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Calendar date;


}
