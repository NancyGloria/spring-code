package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BloodModel;
import com.example.demo.service.BloodService;

@RestController
public class BloodController {
	@Autowired
	public BloodService obj3;
	@PostMapping("/saveBlood")
	public BloodModel addDetails(@RequestBody BloodModel obj4)
	{
		return obj3.SaveInfo(obj4);
	}
	@GetMapping("/GetBlood")
	public List<BloodModel>getDetails()
	{
		return obj3.getInfo();
	}
	@PutMapping("/PutBlood")
	public BloodModel display(@RequestBody BloodModel obj5)
	{
		return obj3.updateInfo(obj5);
	}
	@DeleteMapping("/DeleteBlood/{seeker_id}")
	public String deleteDetails(@PathVariable int seeker_id)
	{
		obj3.deleteInfo(seeker_id);
		return "seeker_id "+seeker_id+" deleted";
	}
	@DeleteMapping("/deleteByParam")
	public String deleteByParamas(@RequestParam("seeker_id") int seeker_id)
	{
		obj3.deleteInfo(seeker_id);
		return "seeker_id"+seeker_id+"is deleted";
	}
}
