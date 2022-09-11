package ru.netology;

public class movieManager {
    private String[] moviesPoster = new String[0];

    private int limitLength = 10;

   //Конструкторы

    public movieManager() {
    }

    public movieManager(int limitLength) {
        this.limitLength = limitLength;
    }

    //геттеры и сеттеры

    public String[] getMoviesPoster() {
        return moviesPoster;
    }

    public void setMoviesPoster(String[] moviesPoster) {
        this.moviesPoster = moviesPoster;
    }

    public int getLimitLength() {
        return limitLength;
    }

    public void setLimitLength(int limitLength) {
        this.limitLength = limitLength;
    }


    public void add(String movie) {
        int length = moviesPoster.length + 1;
        String[] largePoster = new String[length];

        for (int i = 0; i < moviesPoster.length; i++) {
            largePoster[i] = moviesPoster[i];
        }
        int lastIndex = largePoster.length - 1;
        largePoster[lastIndex] = movie;
        moviesPoster = largePoster;
    }

    public void findAll() {
        getMoviesPoster();
    }

    public String[] findLast() {
        int endLength = moviesPoster.length;
        if (endLength > limitLength) {
            endLength = limitLength;
        }

        String[] lastFilms = new String[endLength];
        for (int i = 0; i < lastFilms.length; i++) {
            int index = moviesPoster.length - i - 1;
            lastFilms[i] = moviesPoster[index];
        }
        return lastFilms;
    }
}
