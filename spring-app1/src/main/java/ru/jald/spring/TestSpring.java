package ru.jald.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );//этот класс получаем от Applicationcontext

        TestBean testBean = context.getBean("testBean", TestBean.class);
        //положим наш класс в переменную testBean
        // класс бин которого хотим получить TestBean.class

        System.out.println(testBean.getName());
        context.close();
    }
}
