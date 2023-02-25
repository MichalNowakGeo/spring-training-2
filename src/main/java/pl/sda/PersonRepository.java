package pl.sda;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class PersonRepository {

    public List<Person> findAll() {
        Person person1 = Person.builder().firstName("Adam").lastName("Nowak").age(29).build();
        Person person2 = Person.builder().firstName("Kasia").lastName("Kowalska").age(30).build();
        Person person3 = Person.builder().firstName("Ola").lastName("Borawska").age(40).build();

        return Arrays.asList(person1, person2, person3);
    }
}
