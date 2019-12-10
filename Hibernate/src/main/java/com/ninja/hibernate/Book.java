/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ninja.hibernate;
import javax.persistence.*;

/**
 *
 * @author lil_ninja88
 */

/*
 * This method looks at the Books table and uses getter and setter methods to
 * look at and enter the Title, Author, and Price columns.
 */

@Entity
@Table(name = "book")
public class Book {
    private long id;
    private String title;
    private String author;
    private float price;

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
