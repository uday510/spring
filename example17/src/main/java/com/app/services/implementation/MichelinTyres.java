package com.app.services.implementation;

import com.app.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle moving with Michelin Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of Michelin Tyres";
    }
}
