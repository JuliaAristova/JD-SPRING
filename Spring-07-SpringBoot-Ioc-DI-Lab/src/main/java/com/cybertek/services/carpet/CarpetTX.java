package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrice.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static {
        sqPriceForCity.put(City.AUSTIN, new BigDecimal("1.32"));
        sqPriceForCity.put(City.DUlLAS, new BigDecimal("1.75"));
        sqPriceForCity.put(City.SAN_ANTONIO, new BigDecimal("2.45"));
    }

    //if cuty is not found -> null pointer, to avoid, we use Optional
    @Override
    public BigDecimal getSqFtPrice(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;

        //as it is a map we need to convert it to set - we use entrySet, then we can convert to stream
        Optional<Map.Entry<City, BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();

        //will return a price or 0 if city is not found
        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
