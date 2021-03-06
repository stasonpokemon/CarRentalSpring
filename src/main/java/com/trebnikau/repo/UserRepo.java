package com.trebnikau.repo;

import com.trebnikau.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User,Long> {

    User findUserByUsername(String username);
    List<User> findAllByUsername(String username);
}
