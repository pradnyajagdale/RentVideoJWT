package com.rent.video.system.services;

import com.rent.video.system.dto.User;
import com.rent.video.system.exchnage.GetUserLoginRequest;
import com.rent.video.system.exchnage.GetUserLoginResponse;
import com.rent.video.system.exchnage.GetUserRegistrationRequest;
import com.rent.video.system.exchnage.GetUserRegistrationResponse;

import java.util.Optional;

public interface UserService {
    public GetUserRegistrationResponse registerUserintoVideoAppln(GetUserRegistrationRequest urequest);
    public GetUserLoginResponse loginUserToApplication(GetUserLoginRequest getUserLoginRequest);
    public Optional<User> getUserByEmail(String email);
}
