package com.ead.authuser.services.impl;

import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.models.UserModel;
import com.ead.authuser.repositories.UserCorseRepository;
import com.ead.authuser.services.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserCourseServiceImp implements UserCourseService {

    @Autowired
    UserCorseRepository userCorseRepository;

    @Override
    public boolean existByUserAndCourseId(UserModel userModel, UUID courseId) {
        return userCorseRepository.existsByUserAndCourseId(userModel, courseId);
    }

    @Override
    public UserCourseModel save(UserCourseModel userCourseModel) {
        return userCorseRepository.save(userCourseModel);
    }
}
