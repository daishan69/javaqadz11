package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void findAllEmpty(){
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals( expected,actual);
    }

    @Test
    public void findAllOne(){
        FilmManager manager = new FilmManager();

        manager.add("Фильм1");

        String[] expected = {"Фильм1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals( expected,actual);

    }

    @Test
    public void findAllMore() {
        FilmManager manager = new FilmManager();

        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");

        String[] expected = {"Фильм1", "Фильм2", "Фильм3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllSomeMore() {
        FilmManager manager = new FilmManager();

        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм4");
        manager.add("Фильм3");
        manager.add("Фильм7");

        String[] expected = {"Фильм1", "Фильм2", "Фильм4","Фильм3","Фильм7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastUnderLimit() {
        FilmManager manager = new FilmManager();

        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");
        manager.add("Фильм4");

        String[] expected = {"Фильм4", "Фильм3", "Фильм2","Фильм1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit() {
        FilmManager manager = new FilmManager();

        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");
        manager.add("Фильм4");
        manager.add("Фильм5");

        String[] expected = {"Фильм5", "Фильм4", "Фильм3", "Фильм2", "Фильм1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAboveLimit() {
        FilmManager manager = new FilmManager();

        manager.add("Фильм1");
        manager.add("Фильм2");
        manager.add("Фильм3");
        manager.add("Фильм4");
        manager.add("Фильм5");
        manager.add("Фильм6");
        manager.add("Фильм7");

        String[] expected = {"Фильм7", "Фильм6", "Фильм5", "Фильм4", "Фильм3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
