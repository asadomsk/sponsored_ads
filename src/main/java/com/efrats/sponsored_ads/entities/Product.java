package com.efrats.sponsored_ads.entities;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Product {

    private Long id;
    private String title;
    private String category;
    private BigDecimal price;
    private int serialNum;

}
