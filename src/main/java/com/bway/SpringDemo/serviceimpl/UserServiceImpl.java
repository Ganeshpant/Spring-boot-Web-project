package com.bway.SpringDemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.SpringDemo.model.User;
import com.bway.SpringDemo.repository.UserRepository;
import com.bway.SpringDemo.service.IUserService;
@Service
public class UserServiceImpl  implements IUserService{
 
	
	@Autowired
	private UserRepository urepo;
	
	@Override
	public void addUser(User user) {
	
		urepo.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> showUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User conformInLogin(String un, String pass) {
		 return  urepo.findByNameAndPassword(un, pass);
		
		
	}

}
