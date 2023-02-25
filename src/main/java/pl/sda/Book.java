package pl.sda;

import lombok.*;

import java.math.BigDecimal;

@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Book {

    private String name;
    private BigDecimal price;
}