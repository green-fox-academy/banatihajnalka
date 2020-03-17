package com.greenfoxacademy.programmerfoxclub;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import com.greenfoxacademy.programmerfoxclub.repositories.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgrammerFoxClubApplication implements CommandLineRunner {

    private TrickRepository trickRepository;
    private FoxRepository foxRepository;

    @Autowired
    public ProgrammerFoxClubApplication(TrickRepository trickRepository, FoxRepository foxRepository) {
        this.trickRepository = trickRepository;
        this.foxRepository = foxRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProgrammerFoxClubApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        trickRepository.save(new Trick("coding"));
        trickRepository.save(new Trick("fly"));
        trickRepository.save(new Trick("sing"));
        trickRepository.save(new Trick("play"));
        foxRepository.save(new Fox("Karak", "meat", "water"));
        foxRepository.save(new Fox("Vuk"));
        foxRepository.save(new Fox("Csele"));
    }
}
