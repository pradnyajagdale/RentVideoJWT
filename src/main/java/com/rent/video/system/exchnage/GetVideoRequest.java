package com.rent.video.system.exchnage;

public class GetVideoRequest {
    String title;
    String director;
    String avlstatus;

    public GetVideoRequest()
    {

    }
    public GetVideoRequest(String title, String director, String avlstatus) {
        this.title = title;
        this.director = director;
        this.avlstatus = avlstatus;
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
        return "GetVideoRequest{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", avlstatus='" + avlstatus + '\'' +
                '}';
    }
}
