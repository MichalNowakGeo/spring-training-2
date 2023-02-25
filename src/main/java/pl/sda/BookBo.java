package pl.sda;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookBo {

    public List<Book> findByAuthorName(String name) {
        Book book1 = Book.builder().name("Harry Potter").price(BigDecimal.TEN).build();
        Book book2 = Book.builder().name("Poor dad, rich dad").price(new BigDecimal("100")).build();
        return Arrays.asList(book1, book2);
    }
}