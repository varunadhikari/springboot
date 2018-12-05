package com.first.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.first.model.FirstModel;

@Component
public class FirstDaoImpl implements FirstDao{

	public List<FirstModel> getList() {
		
		List<FirstModel> list = new ArrayList<>();
		list.add(new FirstModel("varun",10));
		list.add(new FirstModel("test",11));
		
		return list;
	}

}
