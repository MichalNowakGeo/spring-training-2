package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);

        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student1);


        SystemProperties systemProperties = context.getBean(SystemProperties.class);
        System.out.println(systemProperties);

        AuthorBo authorBo = context.getBean(AuthorBo.class);
        System.out.println(authorBo.calculateAverageBookPrice("Mój author"));
    }
}