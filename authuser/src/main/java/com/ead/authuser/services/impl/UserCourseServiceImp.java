package com.ead.authuser.services.impl;

import com.ead.authuser.repositories.UserCorseRepository;
import com.ead.authuser.services.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserCourseServiceImp implements UserCourseService {

    @Autowired
    UserCorseRepository userCorseRepository;

}
