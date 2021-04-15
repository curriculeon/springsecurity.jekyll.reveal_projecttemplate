package com.github.curriculeon.config;

import com.github.curriculeon.model.UserProfile;
import com.github.curriculeon.model.UserProfileRole;
import com.github.curriculeon.service.SecurityServiceImpl;
import com.github.curriculeon.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Arrays;

public class UserProfileConfig {
    private final SecurityServiceImpl securityService;
    private UserProfileService service;

    @Autowired
    public UserProfileConfig(UserProfileService service, SecurityServiceImpl securityService) {
        this.service = service;
        this.securityService = securityService;
    }

    @PostConstruct
    public void setup() {
        UserProfile userProfile = new UserProfile();
        UserProfileRole userProfileRole = new UserProfileRole();
        userProfileRole.setName("administrator0!");
        userProfile.setUserRoles(Arrays.asList(userProfileRole));
        userProfile.setUsername("administrator0!");
        userProfile.setPassword("administrator0!");
        service.save(userProfile);
        securityService.autologin(userProfile.getUsername(), userProfile.getPasswordConfirm());
    }
}
