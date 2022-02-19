package ru.jald.spring;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){};

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    };

    public void doMyInit(){System.out.println("Doing initialization"); }
    public void doMyDestroy(){System.out.println("Doing destroying"); }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
