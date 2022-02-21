package ru.jald.spring;

import org.springframework.stereotype.Component;

@Component("classicalMusic") //компонент
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
