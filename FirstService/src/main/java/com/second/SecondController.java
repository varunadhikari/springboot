package com.second;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.second.model.SecondModel;
import com.second.serv.SecondService;

@RestController
public class SecondController {

	@Autowired
	SecondService service;
	
	@RequestMapping(method = RequestMethod.GET , path="/first")
	public List<SecondModel> getList(){
		return service.getlist();
	}
}
