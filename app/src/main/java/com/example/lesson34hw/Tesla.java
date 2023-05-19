package com.example.lesson34hw;

import java.io.Serializable;

public class Tesla implements Serializable {
    String name;
    int image;
    String color;
    String description;
    String price;

    public Tesla(String name, int image, String color, String description, String price) {
        this.name = name;
        this.image = image;
        this.color = color;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
