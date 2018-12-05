package com.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.first.model.FirstModel;
import com.first.serv.FirstService;

@RestController
public class FirstController {

	@Autowired
	FirstService service;
	
	@RequestMapping(method = RequestMethod.GET , path="/")
	public List<FirstModel> getList(){
		return service.getlist();
	}
}
