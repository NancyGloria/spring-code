package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoanApplication;

import com.example.demo.Service.LoanApplicationService;

@RestController
public class LoanApplicationController {
	
	@Autowired
	private LoanApplicationService lser;
	
	@PostMapping("/loan")

	LoanApplication addDetail(@RequestBody LoanApplication lm)
	{
		return lser.SaveInfos(lm);
	}
	@GetMapping("/loaner")
	List<LoanApplication>getDetail()
	{
		return lser.getInfos();
		}
	@PutMapping("/Putloan")
	public LoanApplication displays(@RequestBody LoanApplication lm)
	{
		return lser.updateInfos(lm);
	}
	@DeleteMapping("/Deletelaon/{loanid}")
	public String deleteDetail(@PathVariable int loanid)
	{
		lser.deleteInfos(loanid);
		return "id "+loanid+" deleted";
	}

}
