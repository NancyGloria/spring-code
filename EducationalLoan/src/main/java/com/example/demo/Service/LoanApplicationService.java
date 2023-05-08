package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoanApplication;

import com.example.demo.Repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {
	
	@Autowired
	public LoanApplicationRepository lrep;
	
	

	public LoanApplication SaveInfos(LoanApplication obj1)
	{
		return lrep.save(obj1);
	}
	
	public List<LoanApplication>getInfos()
	{
		return lrep.findAll();
	}
	public LoanApplication updateInfos(LoanApplication in)
	{
		return lrep.saveAndFlush(in);
	}
	public void deleteInfos(int id)
	{
		lrep.deleteById(id);
	}
}
