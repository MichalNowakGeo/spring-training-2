package pl.sda;

import lombok.*;

@Getter @Setter @ToString
@Builder @AllArgsConstructor  @NoArgsConstructor
public class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String address;


}