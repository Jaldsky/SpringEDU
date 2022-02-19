package ru.jald.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);
        classicalMusic.getSong();

        context.close();
    }
}
