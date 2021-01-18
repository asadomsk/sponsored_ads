package com.efrats.sponsored_ads.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    private String title;
    private String category;
    private BigDecimal price;
    private int serial_Num;

 @ManyToMany(targetEntity = Campaign.class,  mappedBy = "promoted_products", cascade = CascadeType.ALL )
 @JsonIgnore
 Set<Campaign> promotions;




}
