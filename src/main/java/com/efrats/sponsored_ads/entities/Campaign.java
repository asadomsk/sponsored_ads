package com.efrats.sponsored_ads.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
public class Campaign {
   String name;
   Date startDate;
   String category;
   BigDecimal bid;
}
