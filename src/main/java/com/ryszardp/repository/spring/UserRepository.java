package com.ryszardp.repository.spring;

import com.ryszardp.domain.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName (String username);
}
