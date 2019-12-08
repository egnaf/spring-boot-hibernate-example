package com.github.egnaf.springHibernateExample.models.manyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToMany
    @JoinTable(name = "student_elective", joinColumns = {
            @JoinColumn(name = "student_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "elective_id", referencedColumnName = "id")})
    private Set<Elective> electives;
}
