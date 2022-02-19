package ru.jald.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );
        Music music1 = context.getBean("classicalMusic", Music.class);
        Music music2 = context.getBean("rockMusic", Music.class);
        Music music3 = context.getBean("phonkMusic", Music.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        MusicPlayer musicPlayer3 = new MusicPlayer(music3);

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();
        musicPlayer3.playMusic();

        context.close();
    }
}
