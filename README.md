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

@Entity
class Passport {
    ...
}
```

### One to many
### Many to one
### Many to many

## Contribute
For any problems, comments, or feedback please create an issue 
[here](https://github.com/egnaf/spring-hibernate-example/issues).
<br>

## License
Project is released under the [MIT](https://en.wikipedia.org/wiki/MIT_License).