package com.example.springbootpoc.persistance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.NaturalId;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Michał Chromiak.
 */
@Entity
@Table(name = "Reservations")
@NoArgsConstructor // JPA requires empty constructor

@Getter
@Setter // used by spring-data to set values so no arg constructor required
@ToString(exclude = {"apartment", "customer"})

public class Reservation extends AbstractDomainObject {

    @NaturalId
    @Column(nullable = false, unique = true)
    private String reservationName;

    @Column(nullable = false)
    private LocalDate dateFrom;

    @Column(nullable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateTo;

    // References
    @Column(nullable = false)

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "")
    @JoinColumn(name = "apartments_list")
    private Set<Apartment> apartments;

    //private Customer customer;
    // status(payment, events)

}
