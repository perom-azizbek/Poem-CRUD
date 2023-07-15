package com.example.poemapp.models;

import org.w3c.dom.Text;

import javax.persistence.*;
import javax.websocket.Decoder;
import javax.websocket.Encoder;

@Entity //creating a table
public class Poem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String author;

    @Column
    private int year;

    //GET id
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    //GET author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //GET year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
