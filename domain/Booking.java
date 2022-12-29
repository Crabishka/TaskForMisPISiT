package ru.lukomorebo.lukomorye_site.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

@Accessors(chain = true)
@Entity
@Getter
@Setter
@Table(name = "booking")
public class Booking implements Serializable {
    public static final int BOOKING_TIME = 30;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Building building;

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date")
    private Calendar startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "finish_date")
    private Calendar finishDate;

    @Column(name = "sending_date")
    private Calendar sendingDate;  // аттрибут показывает, когда запрос был отправлен

    @ManyToOne
    private User user;

    @Column(name = "cost")
    private int cost;

    @Column(name = "discount")
    private int discount;

    @Column(name = "bonus")
    private int bonus;

    @Column(name = "prepayment")
    private int prepayment;

    private BookingStatus status;

    @OneToOne(mappedBy = "booking", fetch = FetchType.LAZY)
    private BookingHours bookingHours;


    @OneToMany(mappedBy = "originalBooking")
    private List<LinkedBooking> linkedBooking;

    public int getPriority(){
        return status.priority;
    }


}
