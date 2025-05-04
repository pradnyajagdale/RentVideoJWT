package com.rent.video.system.services;

import com.rent.video.system.dto.Video;
import com.rent.video.system.exchnage.GetUserLoginRequest;
import com.rent.video.system.exchnage.GetVideoRequest;
import com.rent.video.system.exchnage.GetVideoResponse;
import com.rent.video.system.exchnage.VideoUpdateRequest;
import com.rent.video.system.model.VideoEntity;

import java.util.List;

public interface VideoService {
    public List<Video> getAllVideoList(GetUserLoginRequest getUserLoginRequest);
    GetVideoResponse addVideoIntoAppln(GetVideoRequest urequest);
    public int updateVideoAppln(VideoUpdateRequest updateRequest);
    public int deleteVideoAppln(String vtitle);
    public List<Video> getAllJWTVideoList(GetUserLoginRequest getUserLoginRequest);
}
