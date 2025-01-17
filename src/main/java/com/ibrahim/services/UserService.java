package com.ibrahim.services;

import com.ibrahim.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
