package com.directmedia.onlinestore.core.entity;

public class Work {

    private String title;
    private Artist mainArtist;
    private String genre;
    private int release;
    private String summary;
    private long id;

    public static long lastId;

    public Work() {
        id = (lastId+1);
        lastId = id;
    }
    public Work(String title) {
        this.title = title;
        id = (lastId+1);
        lastId = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(Artist mainArtist) {
        this.mainArtist = mainArtist;
    }
}
