package ru.jald.spring;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) { //IoC с использованием полиморфизма
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing " + music.getSong());
    }
}
