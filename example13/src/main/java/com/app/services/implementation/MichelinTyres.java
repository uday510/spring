package com.app.services.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres {

    public String rotate() {
        return "Vehicle moving with Michelin Tyres";
    }
}
