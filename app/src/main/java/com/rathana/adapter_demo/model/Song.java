package com.rathana.adapter_demo.model;

import android.support.annotation.DrawableRes;

public class Song {

    private String title;
    private String singer;
    @DrawableRes
    private int thumbnail;
    private boolean isPlaying;

    public Song(){}

    public Song(String title, String singer, int thumbnail, boolean isPlaying) {
        this.title = title;
        this.singer = singer;
        this.thumbnail = thumbnail;
        this.isPlaying = isPlaying;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
