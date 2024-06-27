package uas.futsal_field_reservation.rest_api.futsal_field_reservation.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameAndPassword(String username, String password);
}
