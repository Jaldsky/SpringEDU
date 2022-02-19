package ru.jald.spring;

import org.springframework.stereotype.Component;

@Component("phonkMusic")
public class PhonkMusic implements Music{
    @Override
    public String getSong() {
        return "Phonky Town";
    }
}
