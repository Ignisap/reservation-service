package com.ignisage.reservation_service.service;

import com.ignisage.reservation_service.model.Reservation;
import com.ignisage.reservation_service.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> reservationList() {
        return reservationRepository.findAll();
    }

    public Reservation getReservation(UUID id) {
        return reservationRepository.findById(id).orElseThrow(() -> new RuntimeException("Reservation not found"));

    }

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(UUID id, Reservation reservation) {
        Reservation existentReservation = getReservation(id);
        existentReservation.setReservationDate(reservation.getReservationDate());
        existentReservation.setReservationTime(reservation.getReservationTime());
        existentReservation.setStatus(reservation.getStatus());
        return  reservationRepository.save(existentReservation);
    }

    public void deleteReservation(UUID id) {
        reservationRepository.deleteById(id);
    }
}
