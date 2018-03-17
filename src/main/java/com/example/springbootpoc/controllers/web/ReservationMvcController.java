package com.example.springbootpoc.controllers.web;

import com.example.springbootpoc.persistance.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Michał Chromiak.
 */


public class ReservationMvcController {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationMvcController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
}
