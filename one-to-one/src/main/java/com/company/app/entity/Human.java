package com.company.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "humans")
@Data
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
}
