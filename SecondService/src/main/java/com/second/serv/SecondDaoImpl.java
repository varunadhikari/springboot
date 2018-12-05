package com.second.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.second.model.SecondModel;

@Component
public class SecondDaoImpl implements SecondDao{

	public List<SecondModel> getList() {
		
		List<SecondModel> list = new ArrayList<>();
		list.add(new SecondModel("varun",10));
		list.add(new SecondModel("test",11));
		
		return list;
	}

}
