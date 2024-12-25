package com.app.services.implementation;

import com.app.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String playMusic() {
        return "Music is Playing with Bose Speakers";
    }
}
