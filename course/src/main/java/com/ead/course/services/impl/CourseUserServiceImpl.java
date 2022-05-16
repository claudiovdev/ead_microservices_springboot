package com.ead.course.services.impl;

import com.ead.course.models.repositories.CourseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseUserServiceImpl {

    @Autowired
    CourseUserRepository courseUserRepository;
}
