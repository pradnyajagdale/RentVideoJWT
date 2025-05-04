package com.rent.video.system.dto;

public class Video {
    int videoid;
    String title;
    String director;
    String avlstatus;

    public Video()
    {

    }
    public Video(int videoid, String title, String director, String avlstatus) {
        this.videoid = videoid;
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
        return "video{" +
                "videoid=" + videoid +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", avlstatus='" + avlstatus + '\'' +
                '}';
    }
}
