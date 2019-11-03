package com.company.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "faculties")
@Data
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "faculty", cascade = CascadeType.ALL)
    private Set<Student> students;

    public Faculty() {
    }

    public Faculty(String name, Set<Student> students) {
        this.name = name;
        this.students = students;
    }

    public Faculty(String name) {
        this.name = name;
    }
}
