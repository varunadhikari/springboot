package com.second.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.second.model.SecondModel;

@Service
public class SecondServiceImpl implements SecondService{
	
	@Autowired
	private SecondDao dao;
	
	public List<SecondModel> getlist() {
		return dao.getList();
	}

}
