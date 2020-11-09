package com.techprimers.db.model;

import lombok.Data;

import javax.persistence.*;
@Data
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
}
