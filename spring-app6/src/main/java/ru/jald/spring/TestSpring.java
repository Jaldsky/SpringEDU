package ru.jald.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );
        MusicPlayer classicalMusicPlayer1 = context.getBean("classicalMusicPlayer", MusicPlayer.class);
        MusicPlayer classicalMusicPlayer2 = context.getBean("classicalMusicPlayer", MusicPlayer.class);

        boolean compare = classicalMusicPlayer1 == classicalMusicPlayer2;

        System.out.println(compare);

        System.out.println(classicalMusicPlayer1);
        System.out.println(classicalMusicPlayer2);

        classicalMusicPlayer1.setVolume(99);

        System.out.println(classicalMusicPlayer1.getVolume());
        System.out.println(classicalMusicPlayer2.getVolume());

        context.close();
    }
}
