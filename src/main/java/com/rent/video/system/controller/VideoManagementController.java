package com.rent.video.system.controller;


import com.rent.video.system.dto.Video;
import com.rent.video.system.exchnage.*;
import com.rent.video.system.services.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivideo")
@Slf4j
public class VideoManagementController {

    @Autowired
    VideoService videoService;

    @GetMapping("/video/ping")
    public String ping()
    {
        return "pong";
    }


    @GetMapping("/video/list")
    public ResponseEntity<List<Video>> getVideoList(@RequestBody GetUserLoginRequest getUserLoginRequest)
    {
        List<Video> videoList = videoService.getAllVideoList(getUserLoginRequest);
        return ResponseEntity.ok().body(videoList);
    }

    @GetMapping("/video/jwt/list")
    public ResponseEntity<List<Video>> getVideoListJWTToken(Authentication authetication)
    {
        String email = authetication.getName();
        log.info("in video controller email=="+email);
        GetUserLoginRequest getUserLoginRequest = new GetUserLoginRequest();
        getUserLoginRequest.setEmail(email);


        List<Video> videoList = videoService.getAllJWTVideoList(getUserLoginRequest);
        log.info("in video controller video size=="+videoList.size());
        return ResponseEntity.ok().body(videoList);
    }

    @PostMapping("/video/add")
    public ResponseEntity<GetVideoResponse> addVideoEntry(@RequestBody GetVideoRequest getVideoRequest)
    {
        GetVideoResponse getVideoResponse = videoService.addVideoIntoAppln(getVideoRequest);
        return ResponseEntity.ok().body(getVideoResponse);
    }

    @PutMapping("/video/update")
    public ResponseEntity<Integer> modifyVideoEntry(@RequestBody VideoUpdateRequest updateRequest)
    {    int isUpdate =  videoService.updateVideoAppln(updateRequest);
        return ResponseEntity.ok().body(isUpdate);
    }
    @DeleteMapping("/video/delete/{title}")
    public ResponseEntity<Integer> deleteVideoEntry(@PathVariable String vtitle)
    {
        int isDelete = videoService.deleteVideoAppln(vtitle);
        return ResponseEntity.ok().body(isDelete);
    }
}
