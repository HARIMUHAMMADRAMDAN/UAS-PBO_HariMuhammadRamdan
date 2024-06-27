package uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "field_id")
    private Field field;

    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
}
