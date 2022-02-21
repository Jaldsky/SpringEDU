package ru.jald.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("musicPlayer")//компонент
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;


    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1,@Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing " + music1.getSong() + " and@ " + music2.getSong();

    }
}

