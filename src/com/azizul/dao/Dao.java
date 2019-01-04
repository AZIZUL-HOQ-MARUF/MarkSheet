package com.azizul.dao;

import java.util.List;

import com.azizul.model.Model;

public interface Dao {
	public List<Model> getList();
	public Model save(Model college);
	public List<Model> getObject(String name, String roll);
	public Model getObject(Integer id);
	public void delete(Model id);
}
