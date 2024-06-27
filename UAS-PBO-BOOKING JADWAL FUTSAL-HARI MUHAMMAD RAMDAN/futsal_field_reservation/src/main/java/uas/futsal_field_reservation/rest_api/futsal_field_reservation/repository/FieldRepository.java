package uas.futsal_field_reservation.rest_api.futsal_field_reservation.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity.Field;


public interface FieldRepository extends JpaRepository<Field, Long> {}


