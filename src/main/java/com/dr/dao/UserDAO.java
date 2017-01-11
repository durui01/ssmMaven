package com.dr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dr.beans.User;
@Repository
public interface UserDAO {
	List<User> selectId(String username);
}
