package com.ilkaygunel.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.ilkaygunel.pojo.FormulaOneDriver;
import com.ilkaygunel.tureng.Results;
import com.ilkaygunel.tureng.Tureng;

@RestController
public class GetWebService {

	@GetMapping("/records")
	public List<FormulaOneDriver> getAllRecords() {

		List<FormulaOneDriver> driverList = new ArrayList<>();
		FormulaOneDriver michael = new FormulaOneDriver("Michael", "Schumacher");
		driverList.add(michael);
		FormulaOneDriver sebastian = new FormulaOneDriver("Sebastian", "Vettel");
		driverList.add(sebastian);
		FormulaOneDriver kubica = new FormulaOneDriver("Robert", "Kubica");
		driverList.add(kubica);
		FormulaOneDriver test = new FormulaOneDriver("testName", "testLastName");
		driverList.add(test);

		return driverList;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/tureng")
	public ResponseEntity<Results> getTureng(@RequestParam("name")String name) {
		
		Tureng tureng = new Tureng();
		Results results = tureng.translate(name); 
		///results.print();
		
		return ResponseEntity.ok(results);
	}
}
