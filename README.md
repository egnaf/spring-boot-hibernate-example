# spring-hibernate-example

## Relationship types
### One to one
```java
...
@Entity
class Human {
    ...
    @OneToOne
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    private Passport passport;
}

...
@Entity
class Passport {
    ...
}
```

### One to many
```java
...
@Entity
class Teacher {
    ...
    @OneToMany(mappedBy = "teacher")
    private Set<Pupil> pupils;
}

...
@Entity
public class Pupil {
    ...
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}

```

### Many to one
```java
...
@Entity
class Car {
    ...
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;
}

...
@Entity
class Driver {
    ...
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "driver")
    private Set<Car> cars;
}
```

### Many to many
```java
...
@Entity
class Elective {
    ...
    @ManyToMany(mappedBy = "electives")
    private Set<Student> students;
}

...
@Entity
class Student {
    ...
    @ManyToMany
    @JoinTable(name = "student_elective",
            joinColumns = {
            @JoinColumn(name = "student_id", referencedColumnName = "id")},
            inverseJoinColumns = {
            @JoinColumn(name = "elective_id", referencedColumnName = "id")})
    private Set<Elective> electives;
}
```

## Contribute
For any problems, comments, or feedback please create an issue 
[here](https://github.com/egnaf/spring-hibernate-example/issues).
<br>

## License
Project is released under the [MIT](https://en.wikipedia.org/wiki/MIT_License).
