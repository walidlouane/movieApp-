package com.example.moviesapp;

public class MymovieData {
    private int id;
    private String name;
    private String releaseDate;
    private int imageResId;

    public MymovieData(int id,String releaseDate, String name, int imageResId) {
        this.releaseDate = releaseDate;
        this.id = id;
        this.name = name;
        this.imageResId = imageResId;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}
