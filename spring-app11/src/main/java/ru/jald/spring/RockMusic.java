package ru.jald.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> musicList = new ArrayList<>();
        musicList.add("Rock and Rose");
        musicList.add("Golet");
        musicList.add("Hart");
        return musicList;
    }

}
