package com.absolutecoder01.blog.services;

import com.absolutecoder01.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
