package com.cybertek.interfaces.carpetPrice;

import com.cybertek.enums.City;

import java.math.BigDecimal;

//to get price for a particular city
public interface Carpet {

    BigDecimal getSqFtPrice(City city);
}
