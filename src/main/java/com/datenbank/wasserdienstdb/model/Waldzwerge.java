package com.datenbank.wasserdienstdb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Waldzwerge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  //nötig?
    private String name;
    private String email;
    private String kindName;
    private String kindGeburtstag;

    // Getter und Setter für id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter und Setter für name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter und Setter für email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter und Setter für kindName
    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    // Getter und Setter für kindGeburtstag
    public String getKindGeburtstag() {
        return kindGeburtstag;
    }

    public void setKindGeburtstag(String kindGeburtstag) {
        this.kindGeburtstag = kindGeburtstag;
    }
}
