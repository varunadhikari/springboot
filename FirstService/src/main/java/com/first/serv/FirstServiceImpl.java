package com.first.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.model.FirstModel;

@Service
public class FirstServiceImpl implements FirstService{
	
	@Autowired
	private FirstDao dao;
	
	public List<FirstModel> getlist() {
		return dao.getList();
	}

}
