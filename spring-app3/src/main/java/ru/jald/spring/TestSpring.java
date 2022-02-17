package ru.jald.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );

        MusicPlayer musicPlayer1 = context.getBean("classicalMusicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("rockMusicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer3 = context.getBean("phonkMusicPlayer", MusicPlayer.class);

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();
        musicPlayer3.playMusic();

        context.close();
    }
}
