package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtos.SubCompPrice;
import com.example.services.AlternateComponentService;

@RestController
@CrossOrigin
public class AlternateComponentController {

	@Autowired
	
	AlternateComponentService alt_mgr;

	@GetMapping("api/defcompname/{model_id}")
	public List<SubCompPrice> getDefaultCompname(@PathVariable(value="model_id") int model_id) {
		return alt_mgr.getDefaultCompname(model_id);
	}

	@GetMapping("api/config/{model_id}/{comp_name}")
	public List<SubCompPrice> getConfigurableconfig(@PathVariable(value="model_id") int model_id , @PathVariable(value="comp_name") String comp_name) {
		// TODO Auto-generated method stub
		return alt_mgr.getConfigurableConfig(model_id , comp_name);
	}
	
	@GetMapping("api/std/{model_id}")
	public List<String> getCompnameByStd(@PathVariable(value="model_id") int model_id) {
		return alt_mgr.getCompnameByStd(model_id);
	}
	
	@GetMapping("api/interior/{model_id}")
	public List<String> getCompnameByInt(@PathVariable(value="model_id") int model_id) {
		return alt_mgr.getCompnameByInt(model_id);
	}
	
	@GetMapping("api/exterior/{model_id}")
	public List<String> getCompnameByExt(@PathVariable(value="model_id") int model_id) {
		return alt_mgr.getCompnameByExt(model_id);
	}
	

	@GetMapping("api/invoice/{alt_id}")
	public SubCompPrice getFinalConfig(@PathVariable(value="alt_id") int alt_id) {
		return alt_mgr.getFinalConfig(alt_id);
	}
	
}