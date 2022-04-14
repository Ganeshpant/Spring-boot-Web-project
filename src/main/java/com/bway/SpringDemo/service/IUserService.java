package com.bway.SpringDemo.service;

import java.util.List;

import com.bway.SpringDemo.model.User;

public interface IUserService {
void addUser(User user);
void deleteUser(int id);
void updateUser(User user);
List<User> showUser();
User conformInLogin(String un, String pass);
}
