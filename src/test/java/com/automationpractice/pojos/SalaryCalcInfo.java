package com.automationpractice.pojos;

public class SalaryCalcInfo {
	
	private String jobTitle;
	private String location;
	private String yearsOfExperience;
	private String result; 
	
	
	public SalaryCalcInfo (String jobTitle, String location, String yearsOfExperience) {
		this.jobTitle = jobTitle;
		this.location = location;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void SalaryCalcInfo1 (String result) {}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getYearsOfExperience() {
		return yearsOfExperience;
	}


	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public String getResult() {
		return result;
	}



}
