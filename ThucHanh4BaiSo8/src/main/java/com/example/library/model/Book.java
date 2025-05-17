package com.example.library.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String status;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Borrow> borrows = new ArrayList<>();

    // Getters và Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<Borrow> getBorrows() { return borrows; }
    public void setBorrows(List<Borrow> borrows) {
        this.borrows = borrows;
    }
}
