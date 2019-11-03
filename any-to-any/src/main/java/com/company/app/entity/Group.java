package com.company.app.entity;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "groups")
@Data
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "group", cascade = CascadeType.ALL)
    private Set<Student> students;

    public Group() {
    }

    public Group(String name, Set<Student> students) {
        this.name = name;
        this.students = students;
    }

    public Group(String name) {
        this.name = name;
    }
}
