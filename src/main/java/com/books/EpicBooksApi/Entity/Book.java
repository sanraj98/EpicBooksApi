package com.books.EpicBooksApi.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "COPIES")
    private Integer copies;
    @Column(name = "COPIES_AVAILABLE")
    private Integer copiesAvailable;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "IMG")
    private String img;
}
