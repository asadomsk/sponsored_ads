package com.efrats.sponsored_ads.entities;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@NamedQuery(
        name = "findMostExpProductInActiveCategory",
        query = "SELECT  promoted_products  from Campaign cc where cc.bid =\n" +
                "     (SELECT max(c.bid)\n" +
                "     FROM Campaign c \n" +
                "     WHERE c.category = :category" +
                "       AND c.start_date >= current_date - 10)\n" +
                "and cc.category = :category")

@NamedQuery(
        name = "findMostExpProduct",
        query = "SELECT  promoted_products  from Campaign cc where cc.bid =\n" +
                "     (SELECT max(c.bid)\n" +
                "     FROM Campaign c )")
public class Campaign {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long campaign_id;
   private String name;
   private Date start_date;
   private String category;
   private BigDecimal bid;
   public void addProd(Product product) {
      promoted_products.add(product);
      product.getPromotions().add(this);
   }

   @ManyToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
   @JoinTable(
           name = "camp_prod",
           joinColumns = @JoinColumn(name = "campaign_id"),
           inverseJoinColumns = @JoinColumn(name = "product_id"))
   Set<Product> promoted_products;


}
