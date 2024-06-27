package uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fields")
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private Float pricePerHour;
}

