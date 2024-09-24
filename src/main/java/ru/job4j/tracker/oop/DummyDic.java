package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String translate = "Неизвестное слово " + eng;
        return translate;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String translate = dummyDic.engToRus("car");
        System.out.println(translate);
    }
}
