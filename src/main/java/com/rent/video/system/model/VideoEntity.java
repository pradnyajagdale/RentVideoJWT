package com.rent.video.system.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;


@Entity
@Table(name="videodetails")
@Access(value= AccessType.FIELD)
public class VideoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nonnull
    @Column(name = "videoid")
    int videoid;
    @Column(name = "title")
    String title;
    @Column(name = "director")
    String director;
    @Column(name = "avlstatus")
    String avlstatus;

    public VideoEntity()
    {

    }
    public VideoEntity(int videoid, String title, String director, String avlstatus) {
        this.videoid = videoid;
        this.title = title;
        this.director = director;
        this.avlstatus = avlstatus;
    }
    public VideoEntity(String title, String director, String avlstatus) {
        this.title = title;
        this.director = director;
        this.avlstatus = avlstatus;
    }
    public int getVideoid() {
        return videoid;
    }
    public void setVideoid(int videoid) {
        this.videoid = videoid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getAvlstatus() {
        return avlstatus;
    }
    public void setAvlstatus(String avlstatus) {
        this.avlstatus = avlstatus;
    }
    @Override
    public String toString() {
        return "VideoEntity{" +
                "videoid=" + videoid +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", avlstatus='" + avlstatus + '\'' +
                '}';
    }
}
