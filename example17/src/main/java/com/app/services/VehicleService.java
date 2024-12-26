package com.app.services;

import com.app.interfaces.LogAspect;
import com.app.interfaces.Speakers;
import com.app.interfaces.Tyres;
import com.app.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleService {

    private final Logger logger = Logger.getLogger(VehicleService.class.getName());

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public VehicleService() {
        System.out.println("Vehicle Service Object created.");
    }

    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song) {
//        Instant start = Instant.now();
//        logger.info("playMusic method execution start");
//        String music = null;
//        if (vehicleStarted) {
//            music = speakers.playMusic();
//        } else {
//            logger.log(Level.SEVERE, "Vehicle not started to perform the operation.");
//        }

//        logger.info("playMusic method execution end");
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start, finish).toMillis();
//        logger.info("Time took to execute the method : " + timeElapsed);

//        return music;
        return speakers.playMusic(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
//      Instant start = Instant.now();;
//      logger.info("moveVehicle method execution start");
      String status = null;
      if (vehicleStarted) {
          status =  tyres.rotate();
      } else {
//          logger.log(Level.SEVERE, "Vehicle not started to perform the operation.");
      }
//      logger.info("moveVehicle method execution end");
//      Instant finish = Instant.now();
//      long timeElapsed = Duration.between(start, finish).toMillis();
//      logger.info("Time took to execute the method : " + timeElapsed);

      return status;
    }

    public String applyBrake(boolean vehicleStarted) {
//        Instant start = Instant.now();
//        logger.info("method execution start");
//        String status = null;
//        if (vehicleStarted) {
//            status = tyres.stop();
//        } else {
//            logger.log(Level.SEVERE, "Vehicle not started to perform the operation.");
//        }

//        logger.info("applyBrake method execution end");
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start, finish).toMillis();
//        logger.info("Time took to execute the method : " + timeElapsed);

//        return status;
        return tyres.rotate();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

}
