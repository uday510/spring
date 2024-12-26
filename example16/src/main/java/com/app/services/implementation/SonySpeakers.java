package com.app.services.implementation;

import com.app.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    public String playMusic() {
        return "Music is Playing with Sony!";
    }
}
