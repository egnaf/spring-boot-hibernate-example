package com.github.egnaf.springHibernateExample.models.oneToOne;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "passports")
@Data
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "human_id", referencedColumnName = "id")
    private Human human;
}
