package com.example.springbootpoc.persistance.repositories;

import com.example.springbootpoc.persistance.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;


/**
 * Created by Michał Chromiak.
 */

@RepositoryRestResource(path = "apts", collectionResourceRel = "apartments")
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

    /*@Param("apnr") defines parameter for /search/by-number?apnr=? */
    @RestResource(path = "by-number", rel = "by-apartment-nr")
    Collection<Apartment> findByApartmentNr(@Param("apnr") Integer nr);
}
