package com.rent.video.system.exchnage;

public class VideoUpdateRequest {
    String title;
    String director;

    public VideoUpdateRequest()
    {

    }
    public VideoUpdateRequest(String title, String director) {
        this.title = title;
        this.director = director;
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
}
