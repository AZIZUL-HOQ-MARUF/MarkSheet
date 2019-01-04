package com.azizul.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.azizul.dao.Dao;
import com.azizul.model.Model;

@org.springframework.stereotype.Service
@Transactional
public class ServiceImp implements Service {

	@Autowired
	Dao dao;
	@Override
	public List<Model> getList() {
		// TODO Auto-generated method stub
		return dao.getList();
	}
	@Override
	public Model save(Model college) {
		// TODO Auto-generated method stub
		return dao.save(college);
	}
	@Override
	public List<Model> getObject(String name, String roll) {
		// TODO Auto-generated method stub
		return dao.getObject(name,roll);
	}
	@Override
	public void delete(Model id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}
	@Override
	public Model getObject(Integer id) {
		// TODO Auto-generated method stub
		return dao.getObject(id);
	}

}
