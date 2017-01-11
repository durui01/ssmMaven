package com.dr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.beans.User;
import com.dr.dao.UserDAO;
import com.dr.service.UserService;
@Service 
public class UserServiceImpl implements UserService {
@Autowired
    private UserDAO dao;

public UserDAO getDao() {
	return dao;
}
public void setDao(UserDAO dao) {
	this.dao = dao;
}


	@Override
	public boolean doUserLogin(User user) {
		List<User> list=dao.selectId(user.getUsername());
      if(list.size()==0){
    	  return false;
      }else{
    	  if(list.get(0).getPassword().equals(user.getPassword())){
    	  return true;
    	  }else{
    		  
    	  return false;
    	  
    	  
    		  
    	  }
      }
	}

}
