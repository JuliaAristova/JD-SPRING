package com.cybertek.services.floor;

import com.cybertek.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class LivingRoom implements Floor {

    @Value("${width}")
    private BigDecimal width;

    @Value("${length}")
    private  BigDecimal length;

    @Override
    public BigDecimal getArea() {
        return width.multiply(length);
    }
}
