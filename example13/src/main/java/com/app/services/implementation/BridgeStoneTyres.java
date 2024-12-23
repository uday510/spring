package com.app.services.implementation;

import com.app.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public String rotate() {
        return "Vehicle moving with Bridge Stone Tyres";
    }
}
