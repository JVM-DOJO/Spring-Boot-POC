package com.example.springbootpoc.controllers.rest;

import com.example.springbootpoc.persistance.model.Reservation;
import com.example.springbootpoc.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;

/**
 * Created by Michał Chromiak.
 */

@RestController
@RequestMapping(value = "/res")
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping(value = "/{name}")
    public Collection<Reservation> getReservationsByName(@PathVariable("name") String name) {
        return reservationService.getReservationByName(name);
    }

    /* Uses the `params` to distinguish the @RequestMapping*/
    @GetMapping(value = "/{name}", params = {"since"})
    public Collection<Reservation> getReservationsByNameSinceDate(
            @PathVariable("name") String resName,
            @RequestParam(value = "since") @DateTimeFormat(pattern = "yyyy-MM-dd")
                    LocalDate sinceDate) {
        return reservationService.getReservationByNameSinceDate(resName, sinceDate);
    }


    @RequestMapping(value = "/hello")
    public String getHello() {
        return "Hello world!";
    }
}
