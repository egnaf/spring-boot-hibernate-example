package com.github.egnaf.springHibernateExample.models.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String model;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Car car;
}
