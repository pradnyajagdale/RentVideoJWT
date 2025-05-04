package com.rent.video.system.exchnage;

import com.rent.video.system.dto.Video;

public class GetVideoResponse {
    private Video video;

    public GetVideoResponse()
    {

    }
    public GetVideoResponse(Video video) {
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "GetVideoResponse{" +
                "video=" + video +
                '}';
    }
}
