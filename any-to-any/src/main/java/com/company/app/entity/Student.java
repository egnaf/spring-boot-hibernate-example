package com.company.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "average_mark")
    private Double averageMark;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="group_id")
    private Group group;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="faculty_id")
    private Faculty faculty;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_elective", joinColumns = {
            @JoinColumn(name = "student_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "elective_id", referencedColumnName = "id")})
    private Set<Elective> electives;

    public Student() {
    }

    public Student(String firstName, String lastName, String middleName, Double averageMark, Group group,
                   Faculty faculty, Set<Elective> electives) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.averageMark = averageMark;
        this.group = group;
        this.faculty = faculty;
        this.electives = electives;
    }
}
