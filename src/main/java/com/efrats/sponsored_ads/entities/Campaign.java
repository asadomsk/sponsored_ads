package com.efrats.sponsored_ads.entities;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

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
   private Long id;
   String name;
   Date start_date;
   String category;
   BigDecimal bid;
}
