package com.rathana.adapter_demo.model;

import android.support.annotation.DrawableRes;

public class Product {

    private double price;
    @DrawableRes
    private int thumbnail;

    public Product() { }

    public Product(double price, @DrawableRes int thumbnail) {
        this.price = price;
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(@DrawableRes int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
