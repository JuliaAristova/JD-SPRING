package com.cybertek.services;

import org.springframework.stereotype.Component;
import com.cybertek.interfaces.ExtraSessions;

@Component
public class MockInterviewHours implements ExtraSessions {
    public int getHours() {
        return 4;
    }
}
