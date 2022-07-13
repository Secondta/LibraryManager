package net.code.java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Library {
    private Long id;
    private Long name_of_books;
    private Long publication_year;
    private Long creation;
    protected Library() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName_of_books() {
        return name_of_books;
    }

    public void setName_of_books(Long name_of_books) {
        this.name_of_books = name_of_books;
    }

    public Long getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(Long publication_year) {
        this.publication_year = publication_year;
    }

    public Long getCreation() {
        return creation;
    }

    public void setCreation(Long creation) {
        this.creation = creation;
    }
}
