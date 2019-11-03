package com.company.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "passports")
@Data
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "middle_name", length = 100)
    private String middleName;

    @Column(name = "serial_number", length = 20)
    private String serialNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "human_id", referencedColumnName = "id")
    private Human human;
}
