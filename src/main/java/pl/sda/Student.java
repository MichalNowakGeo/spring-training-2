package pl.sda;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter @ToString(callSuper = true)
public class Student extends Person {

    //@Value("#{person1.age}")
    //@Value("29")
    //@Value("#{2 > 1 ? 22 : 30}")

    private Integer indexNumber;


}