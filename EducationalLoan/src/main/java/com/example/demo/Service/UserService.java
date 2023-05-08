package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;



@Service
public class UserService {
	@Autowired
	public UserRepository userrep;
	
	//POST METHOD
		
		public User SaveInfo(User obj1)
		{
			return userrep.save(obj1);
		}
		
		public List<User>getInfo()
		{
			return userrep.findAll();
		}
		public User updateInfo(User in)
		{
			return userrep.saveAndFlush(in);
		}
		public void deleteInfo(int id)
		{
			userrep.deleteById(id);
		}
}
