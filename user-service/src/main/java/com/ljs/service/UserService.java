package com.ljs.service;

import com.ljs.domain.User;

import java.util.List;

public interface UserService {
    void create(User user);

    User getUser(Long id);

    List<User> getUserByIds(List<Long> ids);

    User getByUsername(String username);

    void update(User user);

    void delete(Long id);
}
