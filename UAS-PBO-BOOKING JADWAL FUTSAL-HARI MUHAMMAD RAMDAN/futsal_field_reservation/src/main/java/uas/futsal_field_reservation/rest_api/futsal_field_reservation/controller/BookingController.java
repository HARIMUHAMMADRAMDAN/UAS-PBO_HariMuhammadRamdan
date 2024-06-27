package uas.futsal_field_reservation.rest_api.futsal_field_reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity.Booking;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {
    private BookingService bookingService;
    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/bookings")
    public ResponseEntity<?> createBooking(@RequestBody Booking booking) {
        bookingService.createBooking(booking);
        return ResponseEntity.ok("Booking created successfully");
    }

    @GetMapping("/users/{userId}/bookings")
    public ResponseEntity<List<Booking>> getBookingsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(bookingService.getBookingsByUser(userId));
    }

    @DeleteMapping("/bookings/{bookingId}")
    public ResponseEntity<?> cancelBooking(@PathVariable Long bookingId) {
        bookingService.cancelBooking(bookingId);
        return ResponseEntity.ok("Booking cancelled successfully");
    }
}
