package com.example.CRUDApplication;

import jakarta.persistence.*;

@Entity
@Table(name="GameList")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name ="first_release", nullable = false)
    private String release;
    private String developer;
    @Transient
    boolean recent;

    public Game(Integer id, String name, String release, String developer, boolean recent) {
        this.id = id;
        this.name = name;
        this.release = release;
        this.developer = developer;
        this.recent = recent;
    }

    public Game() {
    }

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

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public boolean isRecent() {
        return recent;
    }

    public void setRecent(boolean recent) {
        this.recent = recent;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", release='" + release + '\'' +
                ", developer='" + developer + '\'' +
                ", recent=" + recent +
                '}';
    }
}
