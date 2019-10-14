package com.ryszardp.service;

import com.ryszardp.domain.vo.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
