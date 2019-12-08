package com.github.egnaf.springHibernateExample.models.manyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "electives")
@Data
@NoArgsConstructor
public class Elective {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "electives")
    private Set<Student> students;
}
