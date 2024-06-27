package uas.futsal_field_reservation.rest_api.futsal_field_reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity.Field;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.repository.FieldRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FieldService {
    private final FieldRepository fieldRepository;
    @Autowired
    public FieldService(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    public List<Field> getAllFields() {
        return fieldRepository.findAll();
    }

    public Optional<Field> getFieldById(Long id) {
        return fieldRepository.findById(id);
    }
}

