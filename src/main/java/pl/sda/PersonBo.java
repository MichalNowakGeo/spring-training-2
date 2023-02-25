package pl.sda;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonBo {

    private PersonRepository personRepository;

    public PersonBo(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }
}