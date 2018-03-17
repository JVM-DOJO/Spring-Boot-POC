package com.example.springbootpoc.persistance.model;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

/**
 *  Base class with @MappedSuperClass must be used to inherit properties, associations, and
 *  methods that are common to several unrelated classes, but NO entity based on those descendant
 *  classes will ever have an association to a AbstractDomainObject.
 *
 *  Class used mainly for `id` field not to be exposed to any constructor or setter (implied by
 *  lombok annotations), except manipulated only by JPA implementation.
 *
 *  Classes that are entities and related should use @Inheritance
 *
 * Created by Michał Chromiak.
 */

@MappedSuperclass
@Getter
public abstract class AbstractDomainObject implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // so called surrogate key
}
