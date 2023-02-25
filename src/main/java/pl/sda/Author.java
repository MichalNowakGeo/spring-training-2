package pl.sda;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Author extends Person {

    private List<Book> books;
}