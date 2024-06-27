package uas.futsal_field_reservation.rest_api.futsal_field_reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.entity.Booking;
import uas.futsal_field_reservation.rest_api.futsal_field_reservation.repository.BookingRepository;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getBookingsByUser(Long userId) {
        return bookingRepository.findByUserId(userId);
    }

    public void cancelBooking(Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }
}
