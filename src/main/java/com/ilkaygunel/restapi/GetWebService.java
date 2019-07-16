package com.ilkaygunel.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilkaygunel.pojo.FormulaOneDriver;

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

		return driverList;
	}
}
