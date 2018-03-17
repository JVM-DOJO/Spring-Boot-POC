package com.example.springbootpoc.persistance.repositories;

import com.example.springbootpoc.persistance.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Collection;

/**
 * Created by Michał Chromiak.
 */

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

    // @Query("select * from reservations where reservation_name = :resName")
    Collection<Reservation> findByReservationName(String name);

    Collection<Reservation> findByReservationNameAndDateFromAfter(String name, LocalDate since);
}
