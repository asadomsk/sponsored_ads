package com.efrats.sponsored_ads.entities;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@NamedQuery(
        name = "findAllCategories",
        query = "SELECT c.name FROM Campaign c WHERE c.category = :category")
public class Campaign {
   @Id
   //@GeneratedValue(strategy=GenerationType.AUTO) ??
   private Long campaign_id;
   private String name;
   private Date start_date;
   private String category;
   private BigDecimal bid;


   @ManyToMany(targetEntity = Product.class, mappedBy = "category", cascade = CascadeType.ALL)
   private List<Product> users;
}
