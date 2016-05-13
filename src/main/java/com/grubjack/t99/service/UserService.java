package com.grubjack.t99.service;

import com.grubjack.t99.model.User;

import java.util.List;

/**
 * Created by user on 12.05.2016.
 */
public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    List<User> getUsers();

    List<User> getUsersByName(String name);


}
