package pl.sda;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Getter @Setter @ToString
//@Component
@Service
public class SystemProperties {

    private Student student;

   // @Value("#{systemProperties['']}")
    private String javaPath;

   @Value("#{systemEnvironment['TEMP']}")
    private String temp;

   @Autowired
   SystemProperties(Student student){
       this.student = student;
   }
}