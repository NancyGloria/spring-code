package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
@Entity
@Table(name="Bloodbankproject")
public class BloodModel {

	@Id
	@Column
	private int seeker_id;
	private int donor_id;
	private int bloodbank_id;
	private int hospital_id;
	private int seeker_age;
	private int donor_age;
	private String seekername;
	private String donorname;
	private String hospitalname;
	private String bloodbankname;
	private String bloodGroup;
	
	
	public int getSeeker_id() {
		return seeker_id;
	}


	public void setSeeker_id(int seeker_id) {
		this.seeker_id = seeker_id;
	}


	public int getDonor_id() {
		return donor_id;
	}


	public void setdonor_id(int donor_id) {
		this.donor_id = donor_id;
	}


	public int getbloodbank_id() {
		return bloodbank_id;
	}


	public void setbloodbank_id(int bloodbank_id) {
		this.bloodbank_id = bloodbank_id;
	}


	public int gethospital_id() {
		return hospital_id;
	}


	public void sethospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}


	public int getseeker_age() {
		return seeker_age;
	}


	public void setseeker_age(int seeker_age) {
		this.seeker_age = seeker_age;
	}


	public int getdonor_age() {
		return donor_age;
	}


	public void setdonor_age(int donor_age) {
		this.donor_age = donor_age;
	}


	public String getseekername() {
		return seekername;
	}


	public void setseekername(String seekername) {
		this.seekername = seekername;
	}


	public String getdonorname() {
		return donorname;
	}


	public void setdonorname(String donorname) {
		this.donorname = donorname;
	}


	public String gethospitalname() {
		return hospitalname;
	}


	public void sethospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}


	public String getbloodbankname() {
		return bloodbankname;
	}


	public void setbloodbankname(String bloodbankname) {
		this.bloodbankname = bloodbankname;
	}


	public String getbloodGroup() {
		return bloodGroup;
	}


	public void setbloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	
	
	

}
