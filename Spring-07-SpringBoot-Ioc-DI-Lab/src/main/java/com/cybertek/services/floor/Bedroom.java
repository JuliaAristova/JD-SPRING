package com.cybertek.services.floor;

import com.cybertek.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Bedroom implements Floor {

    @Value("${width}")
    BigDecimal width;

    //we need to use method not operator - BigDecimal
    @Override
    public BigDecimal getArea() {
        return (BigDecimal)width.pow(2);
    }
}
