package com.dice.stepDefs;

import java.util.Map;

import com.automationpractice.pojos.SalaryCalcInfo;

import io.cucumber.java.DataTableType;

public class CustomTypeTransformer {

	
	@DataTableType
	public SalaryCalcInfo salaryCalcInfoEntry (Map <String, String> row) {
		
		
		return new SalaryCalcInfo(row.get("Job Title"), 
				                  row.get("Location"),
				                  row.get("Years of Experience"));
				                
		
	}
}
