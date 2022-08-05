package com.example.poemapp.models;

public class Poem {

    private int id;
    private String title;
    private String description;
    private String author;
    private String image;

    //GET id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //GET title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //GET description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Get author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Get image
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
