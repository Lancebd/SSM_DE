package com.chikitbd.dao;

import java.util.List;

import com.chikitbd.model.User;
/*
 */

public interface UserMapper {

	void save(User user);

	void update(User user);

	void delete(int id);

	User findById(int id);

	List<User> findAll();

}
