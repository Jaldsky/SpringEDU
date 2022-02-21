package ru.jald.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("musicPlayer")//компонент
public class MusicPlayer {
//    @Autowired //внедрение через переменную
//    private Music music;

////    @Autowired //внедряем компонент classicalMusic в MusicPlayer
//    public MusicPlayer(Music music) { //IoC с использованием полиморфизма
//        this.music = music;
//    }
//
//    @Autowired //внедряем через сеттер
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    private ClassicalMusic classicalMusic;
    private  RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(){
        return "Playing " + classicalMusic.getSong();

    }
}

