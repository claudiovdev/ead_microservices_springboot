package com.ead.authuser.repositories;

import com.ead.authuser.models.UserCourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserCorseRepository extends JpaRepository<UserCourseModel, UUID> {
}
