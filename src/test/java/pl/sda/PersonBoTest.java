package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "classpath:my-beans.xml" })
class PersonBoTest {
    @Autowired
    private PersonBo personBo;

    @Test
    void shouldFindAll() {
        //given

        //when
        List<Person> persons = personBo.findAll();
        //then
        Assertions.assertTrue(persons.size() > 0);
    }
}