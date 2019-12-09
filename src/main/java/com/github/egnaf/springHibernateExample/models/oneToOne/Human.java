package com.github.egnaf.springHibernateExample.models.oneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "humans")
@Data
@NoArgsConstructor
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    private Passport passport;
}
