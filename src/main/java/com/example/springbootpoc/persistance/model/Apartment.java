package com.example.springbootpoc.persistance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Created by Michał Chromiak.
 */

@Entity
@Table(name = "Apartments")
@NoArgsConstructor // JPA requires empty constructor

@Getter
@Setter // used by spring-data to set values so no arg constructor required
@ToString
public class Apartment extends AbstractDomainObject{

    Integer apartmentNr;
    Byte roomCount;

    @ManyToMany(cascade = CascadeType.ALL)
    Reservation reservations;

    //List<ReservationPeriod> resPer

}
