package com.project.project_api_rest.service;

import com.project.project_api_rest.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
