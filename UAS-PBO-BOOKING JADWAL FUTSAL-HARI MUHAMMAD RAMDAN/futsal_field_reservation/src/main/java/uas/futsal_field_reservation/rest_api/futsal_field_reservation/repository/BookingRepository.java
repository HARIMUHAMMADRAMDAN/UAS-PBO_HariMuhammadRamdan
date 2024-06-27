package uas.futsal_field_reservation.rest_api.futsal_field_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity.Booking;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId);
}

