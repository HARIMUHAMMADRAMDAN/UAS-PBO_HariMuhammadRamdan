package uas.futsal_field_reservation.rest_api.futsal_field_reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity.Field;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.service.FieldService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FieldController {
    private FieldService fieldService;
    @Autowired
    public FieldController(FieldService fieldService) {
        this.fieldService = fieldService;
    }

    @GetMapping("/fields")
    public ResponseEntity<List<Field>> getAllFields() {
        return ResponseEntity.ok(fieldService.getAllFields());
    }

    @GetMapping("/fields/{id}")
    public ResponseEntity<Field> getFieldById(@PathVariable Long id) {
        return fieldService.getFieldById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

