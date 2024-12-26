package com.app.main;

import com.app.config.ProjectConfiguration;
import com.app.models.Song;
import com.app.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());

        Song song = new Song();
        song.setTitle("Seduction");
        song.setSingerName("Eminem");

        boolean vehicleStarted = false;
        String moveVehicleStatus = vehicleService.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        String applyBrakeStatus = vehicleService.applyBrake(vehicleStarted);

    }
}
