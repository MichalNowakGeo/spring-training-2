package pl.sda;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AuthorBo {

    private BookBo bookBo;

    public AuthorBo(BookBo bookBo) {
        this.bookBo = bookBo;
    }

    public BigDecimal calculateAverageBookPrice(String authorName) {
        List<Book> authorBooks = bookBo.findByAuthorName(authorName);

        BigDecimal bookSum = authorBooks.stream().map(Book::getPrice).reduce(BigDecimal::add).get();
        return bookSum.divide(BigDecimal.valueOf(authorBooks.size()));
    }
}