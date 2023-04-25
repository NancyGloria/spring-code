package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Repository.BloodRepo;
import com.example.demo.model.BloodModel;

@Service
public class BloodService {
	@Autowired
	public BloodRepo obj;
	public BloodModel SaveInfo(@RequestBody BloodModel obj1)
	{
		return obj.save(obj1);
	}
	public List<BloodModel>getInfo()
	{
		return obj.findAll();
	}
	public BloodModel updateInfo(BloodModel in)
	{
		return obj.saveAndFlush(in);
	}
	public void deleteInfo(int seeker_id)
	{
		obj.deleteById(seeker_id);
	}
		
}
