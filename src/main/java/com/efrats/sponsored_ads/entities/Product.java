package com.efrats.sponsored_ads.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
public class Product {
   @Id
    private Long product_id;
    private String title;
    private String category;
    private BigDecimal price;
    private int serial_Num;


}
