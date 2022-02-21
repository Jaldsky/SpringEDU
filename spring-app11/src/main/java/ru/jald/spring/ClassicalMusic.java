package ru.jald.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classicalMusic") //компонент
public class ClassicalMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> musicList = new ArrayList<>();
        musicList.add("Hungarian Rhapsody");
        musicList.add("Thchelkunchik");
        musicList.add("Lebed lake");

        return musicList;
    }
}
