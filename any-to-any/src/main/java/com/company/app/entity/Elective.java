package com.company.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "electives")
@Data
public class Elective {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "electives", cascade=CascadeType.ALL)
    private Set<Student> students;

    public Elective() {
    }

    public Elective(String name, Set<Student> students) {
        this.name = name;
        this.students = students;
    }

    public Elective(String name) {
        this.name = name;
    }
}
