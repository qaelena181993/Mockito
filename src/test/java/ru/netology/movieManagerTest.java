package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class movieManagerTest {
    
    movieManager manager = new movieManager();
    
    @Test
    void addMovie() {
        
        String[] moviesMassive = new String[]{"Bloodshot", "LetsGo", "HostelBelgrade", "Gentlemen"};
        manager.setMoviesPoster(moviesMassive);
        String addMovie = "NumberOne";
        manager.add(addMovie);

        String[] expected = new String[]{"Bloodshot", "LetsGo", "HostelBelgrade", "Gentlemen", "NumberOne"};
        String[] actual = manager.getMoviesPoster();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {

        String[] moviesMassive = new String[]{"Bloodshot", "LetsGo", "HostelBelgrade", "Gentlemen"};
        manager.setMoviesPoster(moviesMassive);
        manager.findAll();

        String[] expected = new String[]{"Bloodshot", "LetsGo", "HostelBelgrade", "Gentlemen"};
        String[] actual = manager.getMoviesPoster();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastManager() {

        String[] moviesMassive = new String[]{"Bloodshot", "LetsGo", "HostelBelgrade", "Gentlemen", "NumberOne"};
        manager.setMoviesPoster(moviesMassive);

        String[] expected = new String[]{"NumberOne", "Gentlemen", "HostelBelgrade", "LetsGo", "Bloodshot"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastManagerMoreThanTen() {

        String[] moviesMassive = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        manager.setMoviesPoster(moviesMassive);

        String[] expected = new String[]{"11", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastManagerLimit3() {
        movieManager manager = new movieManager(3);

        String[] moviesMassive = new String[]{"Bloodshot", "LetsGo", "HostelBelgrade", "Gentlemen", "NumberOne"};
        manager.setMoviesPoster(moviesMassive);


        String[] expected = new String[]{"NumberOne", "Gentlemen", "HostelBelgrade"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastManagerLimit11() {
        movieManager manager = new movieManager(11);

        String[] moviesMassive = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        manager.setMoviesPoster(moviesMassive);


        String[] expected = new String[]{"11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
