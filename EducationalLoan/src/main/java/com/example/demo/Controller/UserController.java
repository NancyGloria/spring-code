package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;


@RestController
@CrossOrigin("http;//localhost:3000")
public class UserController {

@Autowired

private UserService useser;

@PostMapping("/user")

User addDetails(@RequestBody User um)
{
	return useser.SaveInfo(um);
}
@GetMapping("/users")
List<User>getDetails()
{
	return useser.getInfo();
	}
@PutMapping("/Putuser")
public User display(@RequestBody User obj5)
{
	return useser.updateInfo(obj5);
}
@DeleteMapping("/Deleteuser/{id}")
public String deleteDetails(@PathVariable int id)
{
	useser.deleteInfo(id);
	return "id "+id+" deleted";
}

}
