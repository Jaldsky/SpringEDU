package ru.jald.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("musicPlayer")//компонент
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;

    @Autowired
    @Qualifier("classicalMusic")
    private Music music1;
    @Autowired()
    @Qualifier("rockMusic")
    private Music music2;

    public void playMusic(Geners geners) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (geners == Geners.CLASSICAL) {
            System.out.println(music1.getSong().get(randomNumber));
        } else
            System.out.println(music2.getSong().get(randomNumber));

    }
}

