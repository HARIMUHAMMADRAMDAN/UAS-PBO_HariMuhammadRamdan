package uas.futsal_field_reservation.rest_api.futsal_field_reservation.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity.User;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> loginUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}

