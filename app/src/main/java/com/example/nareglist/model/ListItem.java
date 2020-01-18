package com.example.nareglist.model;

public class ListItem {
    private int imageId;
    private String name;
    private String descreption;

    public ListItem() {
    }

    public ListItem(int imageId, String name, String descreption) {
        this.imageId = imageId;
        this.name = name;
        this.descreption = descreption;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }
}
