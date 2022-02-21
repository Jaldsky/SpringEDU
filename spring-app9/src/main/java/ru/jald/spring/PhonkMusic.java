package ru.jald.spring;

import org.springframework.stereotype.Component;


public class PhonkMusic implements Music{
    @Override
    public String getSong() {
        return "Phonky Town";
    }
}
