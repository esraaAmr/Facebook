package com.example.splach_screen.Models;

public class HomeModel {
    private String name;
    private String time;
    private int profImg;
    private String title;
    private int postImg;

    public HomeModel(String name, String time, int profImg, String title, int postImg) {
        this.name = name;
        this.time = time;
        this.profImg = profImg;
        this.title = title;
        this.postImg = postImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getProfImg() {
        return profImg;
    }

    public void setProfImg(int profImg) {
        this.profImg = profImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPostImg() {
        return postImg;
    }

    public void setPostImg(int postImg) {
        this.postImg = postImg;
    }
}
