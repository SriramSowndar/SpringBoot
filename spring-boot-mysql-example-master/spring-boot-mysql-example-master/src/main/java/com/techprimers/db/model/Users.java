package com.techprimers.db.model;

import javax.persistence.*;
@Entity
@Table(name="student")
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "FavBook")
    private String favBook;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavBook() {
        return favBook;
    }

    public void setFavBook(String favBook) {
        this.favBook = favBook;
    }
}
