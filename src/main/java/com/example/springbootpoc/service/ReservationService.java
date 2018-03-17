package com.example.springbootpoc.service;

import com.example.springbootpoc.persistance.model.Reservation;
import com.example.springbootpoc.persistance.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;

/**
 * Created by Michał Chromiak.
 */


@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Collection<Reservation> getAllReservations() {
        return this.reservationRepository.findAll();
    }

    public Collection<Reservation> getReservationByName(String resName) {
        return this.reservationRepository.findByReservationName(resName);
    }

    public Collection<Reservation> getReservationByNameSinceDate(String resName, LocalDate sinceDate){
        return this.reservationRepository.findByReservationNameAndDateFromAfter(resName, sinceDate);
    }
}
